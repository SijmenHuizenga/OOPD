package sijmenhuizenga.oopd.vanifelse.gereedschappen;

import sijmenhuizenga.oopd.vanifelse.IGereedschap;
import sijmenhuizenga.oopd.vanifelse.TekenApp;
import sijmenhuizenga.oopd.vanifelse.figuren.Rechthoek;

public class RechthoekGereedschap implements IGereedschap{

	@Override
	public void pasGreedschapToe(TekenApp app) {
		Rechthoek r = new Rechthoek(app.mouseX-25, app.mouseY-25, 50, 50);
		app.figurenLijst.add(r);
	}

}
