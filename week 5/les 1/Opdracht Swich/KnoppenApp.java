package sijmenhuizenga.oopd.swich;

import java.util.ArrayList;
import processing.core.PApplet;

@SuppressWarnings("serial")
public class KnoppenApp extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main(new String[] {"KnoppenApp"});
	}
	
	private ArrayList<Knop> knoppen = new ArrayList<>();

	private Licht licht;
	private Tekstraam tekstraam;
	
	public void setup() {
		size(400, 400);	
		licht = new Licht(this);
		tekstraam = new Tekstraam(this,"OOPD",250,250);
		
		Switch eenSwitch=new Switch(this,100,20,50,50);
		
		eenSwitch.voegDoelwitToe(licht);
		eenSwitch.voegDoelwitToe(tekstraam);

		knoppen.add(eenSwitch);
		
		Switch tweeSwitch = new Switch(this, 200, 20, 50, 50);
		tweeSwitch.voegDoelwitToe(licht);
		knoppen.add(tweeSwitch);
	}
	
	public void draw() {
		licht.teken();
		tekstraam.teken();
		for (Knop k : knoppen) {
			k.tekenKnop();
		}
	}
	
	public void mousePressed() {
		for (Knop k : knoppen) {
			if (k.isMuisOverKnop()) {
				k.handelInteractieAf();
			}
		}
	}
}
