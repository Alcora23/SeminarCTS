package ro.ase.cts.Template.clase;

public abstract class SpectatorAbstract {
	
	public abstract void asezareLaCoada();
	public abstract void prezentareBilet();
	public abstract void realizareControlCorporal();
	public abstract void ocupaLoc();
	
	public final void intrareInStadion() {
		//final ca nici o clasa concreta sa nu o supradefineasca
		asezareLaCoada();
		prezentareBilet();
		realizareControlCorporal();
		ocupaLoc();
	}
}
