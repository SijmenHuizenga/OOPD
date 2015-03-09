package sijmenhuizenga.oopd.vanifelse;

import java.util.ArrayList;

import processing.core.PApplet;
import sijmenhuizenga.oopd.vanifelse.gereedschappen.CirkelGereedschap;
import sijmenhuizenga.oopd.vanifelse.gereedschappen.GumGereedschap;
import sijmenhuizenga.oopd.vanifelse.gereedschappen.RechthoekGereedschap;
import sijmenhuizenga.oopd.vanifelse.gereedschappen.SelecteerGereedschap;

public class TekenApp extends PApplet {
	
	private static final long serialVersionUID = 8535080038834173930L;

	public ArrayList<Figuur> figurenLijst = new ArrayList<>();
	private IGereedschap huidigGereedschap = new SelecteerGereedschap();

	public void setup() {
		size(400, 400);
	}

	public void draw() {
		background(0);
		for (Figuur figuur : figurenLijst) {
			figuur.teken(this);
		}
	}

	public void mousePressed() {
		huidigGereedschap.pasGreedschapToe(this);
	}

	public void keyReleased() {
		switch (key) {
		case 's':
			huidigGereedschap = new SelecteerGereedschap();
			break;
		case 'r':
			huidigGereedschap = new RechthoekGereedschap();
			break;
		case 'c':
			huidigGereedschap = new CirkelGereedschap();
			break;
		case 'g':
			huidigGereedschap = new GumGereedschap();
			break;
		}
	}

}
