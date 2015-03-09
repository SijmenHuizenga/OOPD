package sijmenhuizenga.oopd.swich;

import processing.core.PApplet;

public class Tekstraam implements IDoelwit{

	private PApplet app;
	private String tekxt;
	private float x, y;
	
	public Tekstraam(KnoppenApp knoppenApp, String tekst, int x, int y) {
		this.app = knoppenApp;
		this.tekxt = tekst;
		this.x = x;
		this.y = y;
	}

	@Override
	public void schakel() {
		if(tekxt.equals("aan")){
			tekxt = "uit";
		}else{
			tekxt = "aan";
		}
	}

	@Override
	public void teken() {
		app.fill(255, 0, 0);
		app.text(tekxt, x, y);
	}
	
}
