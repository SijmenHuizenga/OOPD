package sijmenhuizenga.oopd.vanifelse;

import processing.core.PApplet;

public abstract class Figuur {

	public abstract boolean isMuisBinnen(int x, int y);
	
	public abstract void teken(PApplet app);
	
}
