package ro.ase.cts.Template.clase;

public class SpectatorVip extends SpectatorAbstract{

	private String nume;
	
	public SpectatorVip(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareLaCoada() {
		System.out.println("Spectatorul " + nume + " nu a mai stat la coada pentru ca e VIP");
		
	}

	@Override
	public void prezentareBilet() {
		System.out.println("Spectatorul " + nume + " a prezentat un bilet VIP");
		
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println("Spectatorul " + nume + " a fost controlat");
		
	}

	@Override
	public void ocupaLoc() {
		System.out.println("Spectatorul " + nume + " si-a ocupat locul in loja");
		
	}

}
