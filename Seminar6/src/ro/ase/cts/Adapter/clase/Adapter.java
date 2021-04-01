package ro.ase.cts.Adapter.clase;

public class Adapter implements IBiletOnline{
	private Bilet bilet;
	
	public Adapter(Bilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void vindeBiletOnline() {
		bilet.vanzare();
	}

	@Override
	public void rezervaBiletOnline() {
		bilet.rezervare();
	}
}
