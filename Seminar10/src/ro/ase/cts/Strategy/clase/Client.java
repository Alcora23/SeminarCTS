package ro.ase.cts.Strategy.clase;

public class Client {
	private IPlata tipPlata;
	private String nume;
	
	
	public Client(String nume) {
		super();
		this.tipPlata = new PlataCash();
		this.nume = nume;
	}


	public void setTipPlata(IPlata tipPlata) {
		this.tipPlata = tipPlata;
	}
	
	
	public void plateste(float suma) {
		System.out.println("Clientul " + this.nume + " are de platit " + suma +" lei" );
		tipPlata.plateste(suma);
	}
	
	
	

}
