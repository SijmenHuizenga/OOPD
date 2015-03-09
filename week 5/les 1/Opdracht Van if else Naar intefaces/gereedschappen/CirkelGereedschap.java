package sijmenhuizenga.oopd.vanifelse.gereedschappen;

import sijmenhuizenga.oopd.vanifelse.IGereedschap;
import sijmenhuizenga.oopd.vanifelse.TekenApp;
import sijmenhuizenga.oopd.vanifelse.figuren.Cirkel;

public class CirkelGereedschap implements IGereedschap{

	@Override
	public void pasGreedschapToe(TekenApp app) {
		Cirkel c = new Cirkel(app.mouseX, app.mouseY, 50);
		app.figurenLijst.add(c);
	}

}
