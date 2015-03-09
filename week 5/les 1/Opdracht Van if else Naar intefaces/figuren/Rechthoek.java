package sijmenhuizenga.oopd.vanifelse.figuren;

import java.awt.Rectangle;

import processing.core.PApplet;
import sijmenhuizenga.oopd.vanifelse.Figuur;

public class Rechthoek extends Figuur {

	private int x, y, width, height;
	
	public Rechthoek(int x, int y, int width, int height){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	@Override
	public boolean isMuisBinnen(int x, int y) {
		return new Rectangle(this.x, this.y, this.width, this.height).contains(x, y);
	}

	@Override
	public void teken(PApplet app) {
		app.fill(0, 255, 0);
		app.rect(x, y, width, height);
	}

	@Override
	public String toString() {
		return "Rechthoek [x=" + x + ", y=" + y + ", width=" + width
				+ ", height=" + height + "]";
	}

}
