package sijmenhuizenga.oopd.vanifelse.figuren;

import processing.core.PApplet;
import sijmenhuizenga.oopd.vanifelse.Figuur;

public class Rechthoek extends Figuur {

	public Rechthoek(int x, int y, int width, int height){
		
	}
	
	@Override
	public boolean isMuisBinnen(int x, int y) {
		return false;
	}

	@Override
	public void teken(PApplet app) {
	}

}
