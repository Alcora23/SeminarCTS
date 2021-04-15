package ro.ase.cts.clase;

public class NotaDePlata implements INota{

	private int sumaDePlata;

	
	public NotaDePlata(int sumaDePlata) {
		super();
		this.sumaDePlata = sumaDePlata;
	}


	@Override
	public void printeaza() {
		System.out.println(String.format("S-a printata nota de plata cu suma %d", sumaDePlata));
		
	}
	
}
