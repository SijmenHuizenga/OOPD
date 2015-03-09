package sijmenhuizenga.oopd.vanifelse.figuren;

import java.awt.Point;

import processing.core.PApplet;
import sijmenhuizenga.oopd.vanifelse.Figuur;

public class Cirkel extends Figuur {

	private int x, y, radius;
	
	public Cirkel(int x, int y, int radius){
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public boolean isMuisBinnen(int x, int y) {
		Point a = new Point(x, y);
		return a.distance(this.x,  this.y) <= radius/2;
	}

	@Override
	public void teken(PApplet app) {
		app.fill(255, 0, 0);
		app.ellipse(this.x, this.y, radius, radius);
	}
	
}
