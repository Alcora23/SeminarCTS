package ro.ase.cts.Template.clase;

public class Spectator extends SpectatorAbstract{

	private String nume;
	
	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareLaCoada() {
		System.out.println("Spectatorul " + nume + " s-a asezat la coada");
	}

	@Override
	public void prezentareBilet() {
		System.out.println("Spectatorul " + nume + " a prezentat biletul");
		
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println("Spectatorul " + nume + " a fost controlat");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println("Spectatorul " + nume + " a ocupat locul");
		
	}

}
