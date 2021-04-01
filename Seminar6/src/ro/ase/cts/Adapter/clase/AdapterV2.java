package ro.ase.cts.Adapter.clase;

public class AdapterV2 extends Bilet implements IBiletOnline{
	//adapter de clase
	
	public AdapterV2(float pret) {
		super(pret);
	}

	@Override
	public void vindeBiletOnline() {
		super.vanzare();
	}

	@Override
	public void rezervaBiletOnline() {
		super.rezervare();
	}
	
}
