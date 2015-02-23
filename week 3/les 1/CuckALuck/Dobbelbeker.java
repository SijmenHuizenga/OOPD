package sijmenhuizenga.oopd.dobbel;

public class Dobbelbeker {

	private Dobbelsteen[] dobbelstenen;

	public Dobbelbeker(int aantalDobbelstenen) {
		dobbelstenen = new Dobbelsteen[aantalDobbelstenen];
		for (int i = 0; i < aantalDobbelstenen; i++) {
			dobbelstenen[i] = new Dobbelsteen(1, 6);
		}
	}

	public void werp() {
		for (int i = 0; i < dobbelstenen.length; i++) {
			dobbelstenen[i].werp();
		}
	}

	public int hoeveelGelijk(int geluksgetal) {
		int teller = 0;
		for (int i = 0; i < dobbelstenen.length; i++) {
			if (dobbelstenen[i].isGelijkAan(geluksgetal)) {
				teller++;
			}
		}
		return teller;
	}

	public String toString() {
		String stringBuilder = "";
		for (int i = 0; i < dobbelstenen.length; i++) {
			stringBuilder = stringBuilder + dobbelstenen[i] + " ";
		}

		return "worp: " + stringBuilder;
	}

}
