package sijmenhuizenga.oopd.dobbel;

public class ChuckALuckSpel {

	private Dobbelbeker beker;
	private int saldo;
	private int ronde;
	private int geluksgetal;

	public ChuckALuckSpel(int saldo) {
		this.saldo = saldo;
		this.ronde = 0;
		this.beker = new Dobbelbeker(3);
	}

	public void speelRonde(int geluksgetal, int inzet) {
		this.geluksgetal = geluksgetal;
		ronde++;
		beker.werp();
		int hoeveelGelijk = beker.hoeveelGelijk(geluksgetal);
		switch (hoeveelGelijk) {
			case 0:
				saldo -= inzet;
				break;
			case 1:
				saldo += inzet;
				break;
			case 2:
				saldo += inzet * 2;
				break;
			case 3:
				saldo += inzet * 10;
				break;
			default:
				break;
		}
	}

	@Override
	public String toString() {
		String out = "------------------" + System.lineSeparator();
		out += "Ronde: " + ronde + System.lineSeparator();
		out += "geluksgetal: " + geluksgetal + System.lineSeparator();
		out += beker.toString() + System.lineSeparator();
		out += "saldo: " + saldo;

		return out;
	}

}
