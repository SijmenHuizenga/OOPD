package sijmenhuizenga.oopd.vanifelse.gereedschappen;

import sijmenhuizenga.oopd.vanifelse.Figuur;
import sijmenhuizenga.oopd.vanifelse.IGereedschap;
import sijmenhuizenga.oopd.vanifelse.TekenApp;

public class GumGereedschap implements IGereedschap{

	@Override
	public void pasGreedschapToe(TekenApp app) {
		for (int i = app.figurenLijst.size() - 1; i >= 0; i--) {
			Figuur fig = app.figurenLijst.get(i);
			if (fig.isMuisBinnen(app.mouseX, app.mouseY)) {
				app.figurenLijst.remove(i);
			}
		}
	}

}
