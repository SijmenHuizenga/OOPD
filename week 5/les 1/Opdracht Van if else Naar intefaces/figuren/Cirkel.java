package sijmenhuizenga.oopd.vanifelse.figuren;

import processing.core.PApplet;
import sijmenhuizenga.oopd.vanifelse.Figuur;

public class Cirkel extends Figuur {

	public Cirkel(int x, int y, int radius){
		
	}

	@Override
	public boolean isMuisBinnen(int x, int y) {
		return false;
	}

	@Override
	public void teken(PApplet app) {
	}
	
}
