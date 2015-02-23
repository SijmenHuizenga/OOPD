package sijmenhuizenga.oopd.klok;

import java.awt.Point;
import java.awt.Rectangle;

import processing.core.PApplet;
import processing.core.PConstants;

public class Klok {

	/**
	 * The location of the clock.
	 */
	private final Rectangle locatie;

	/**
	 * The background color of the clock.
	 */
	private int backgroundColor;

	/**
	 * The color of the text in the clock.
	 */
	private int textColor;

	/**
	 * The character that seperates the different numbers.
	 */
	private char seperator = '.';

	/**
	 * The counters in the clock.
	 */
	private final Teller[] tellers;

	/**
	 * Constructor of a Clock. The width of the clock wil automaticly be
	 * calcualated using the height and tellerMaximums.
	 *
	 * @param app
	 *            the application. Only used for
	 *            {@link PApplet#textWidth(String)} for textWidth method.
	 * @param tellerMaximums
	 *            the maximum numbers of the different counters.
	 * @param punt
	 *            the left top corner of the clock on the screen.
	 * @param height
	 *            The height of the clock.
	 */
	public Klok(PApplet app, int[] tellerMaximums, Point punt, int height) {
		this.tellers = new Teller[tellerMaximums.length];
		this.backgroundColor = app.color(0, 0, 0);
		this.textColor = app.color(0, 255, 0);

		app.textSize(height);
		int[] digitAmounts = getAmountOfDigits(tellerMaximums);
		int getalBreedte = (int) app.textWidth('0');
		int speratorBreedte = (int) app.textWidth(seperator);

		int curX = punt.x;

		for (int i = 0; i < tellers.length; i++) {
			tellers[i] = new Teller(new Rectangle(curX, punt.y, getalBreedte
					* digitAmounts[i], height), tellerMaximums[i], i != tellers.length-1);
			curX += getalBreedte * digitAmounts[i] + (i == tellers.length-1 ? 0 : speratorBreedte);
		}

		this.locatie = new Rectangle(punt.x, punt.y, curX-punt.x, height);
	}

	/**
	 * A class that represents 1 teller in the Klok. 
	 */
	private class Teller {

		/**
		 * The current number of this counter.
		 */
		private int huidigGetal;

		/**
		 * The maximum number of this counter.
		 */
		private final int max;

		/**
		 * the location of this counter.
		 */
		private final Rectangle locatie;

		/**
		 * wether or not to show the seperator.
		 */
		private final boolean showSeperator;

		/**
		 * constructor for the Teller.
		 * @param locatie The location of this Teller
		 * @param max The maximum number of this Teller.
		 */
		public Teller(Rectangle locatie, int max, boolean showSeperator) {
			this.locatie = locatie;
			this.huidigGetal = 0;
			this.max = max;
			this.showSeperator =showSeperator;
		}

		/**
		 * Draws this Teller on the screen.
		 * @param window The window to draw to.
		 */
		public void draw(PApplet window) {
			window.fill(textColor);
			window.stroke(textColor);
			window.textSize(this.locatie.height);
			window.textAlign(PConstants.LEFT, PConstants.CENTER);
			String toDraw = addLeadingZeros(huidigGetal, getAmountOfDigits(max))
					+ (showSeperator ? seperator : ' ');
			window.text(toDraw, (int) this.locatie.getMinX(),
					(int) this.locatie.getCenterY());
		}

		/**
		 * Add 1 to the teller.
		 * @return wether or not this teller was reset by reaching its maximum amount.
		 */
		public boolean tik() {
			huidigGetal++;
			if (huidigGetal > max) {
				huidigGetal = 0;
				return true;
			}
			return false;
		}

	}

	/**
	 * draw the clock on the screen.
	 *
	 * @param window
	 *            The window to draw opon.
	 */
	public void draw(PApplet window) {
		window.fill(backgroundColor);
		window.stroke(backgroundColor);
		window.rect(locatie.x, locatie.y, locatie.width, locatie.height);
		for (Teller teller : tellers) {
			teller.draw(window);
		}

	}

	/**
	 * Add 1 to the Klok
	 */
	public void tik() {
		for (int i = tellers.length - 1; tellers[i].tik() && i > 0; i--)
			;
	}

	/**
	 * @return the backgroundColor
	 */
	public int getBackgroundColor() {
		return backgroundColor;
	}

	/**
	 * @param backgroundColor the backgroundColor to set
	 */
	public void setBackgroundColor(int backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	/**
	 * @return the textColor
	 */
	public int getTextColor() {
		return textColor;
	}

	/**
	 * @param textColor the textColor to set
	 */
	public void setTextColor(int textColor) {
		this.textColor = textColor;
	}

	/**
	 * @return the seperator
	 */
	public char getSeperator() {
		return seperator;
	}

	/**
	 * @param seperator the seperator to set
	 */
	public void setSeperator(char seperator) {
		this.seperator = seperator;
	}

	/**
	 * add leading zeros so until the string reaches numberSize.
	 *
	 * @param n
	 *            the number
	 * @param numberSize
	 *            the output string size
	 * @return a string with length numberSize with leading zero's
	 */
	public static String addLeadingZeros(int n, int numberSize) {
		String out = String.valueOf(n);
		while (out.length() < numberSize) {
			out = '0' + out;
		}
		return out;
	}

	/**
	 * array-version of {{@link #getAmountOfDigits(int)}
	 */
	public static int[] getAmountOfDigits(int[] input) {
		int[] out = new int[input.length];
		for (int i = 0; i < input.length; i++) {
			out[i] = getAmountOfDigits(input[i]);
		}
		return out;
	}

	/**
	 * get the amount of digitis this integer has.
	 *
	 * @param i
	 *            the number to check.
	 * @return the amount of digits
	 */
	public static int getAmountOfDigits(int i) {
		return String.valueOf(i).length();
	}

}
