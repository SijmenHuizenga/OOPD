package sijmenhuizenga.oopd.dobbel;

import java.util.Random;

public class Dobbelsteen {
	
	private int waarde, min, max;
	private Random random = new Random();
	
	public Dobbelsteen(int min, int max) {
		super();
		this.waarde = -1;
		this.min = min;
		this.max = max;
	}
	
	public boolean isGelijkAan(int geluksgetal){
		return geluksgetal == waarde;
	}

	public void werp(){
		this.waarde = random.nextInt((max - min) + 1) + min;
	}
	
	@Override
	public String toString() {
		return ""+waarde;
	}
	

}
