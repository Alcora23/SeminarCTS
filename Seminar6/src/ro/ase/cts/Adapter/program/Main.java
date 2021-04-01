package ro.ase.cts.Adapter.program;

import ro.ase.cts.Adapter.clase.Adapter;
import ro.ase.cts.Adapter.clase.AdapterV2;
import ro.ase.cts.Adapter.clase.Bilet;
import ro.ase.cts.Adapter.clase.IBiletOnline;

public class Main {
	
	private static void rezervaSiAfiseazaBiletLaCasa(Bilet bilet) {
		bilet.rezervare();
		bilet.vanzare();
	}
	
	private static void rezervaSiAfiseazaBiletOnline(IBiletOnline bilet) {
		bilet.rezervaBiletOnline();
		bilet.vindeBiletOnline();
	}
	
	public static void main(String[] args) {
		Bilet bilet = new Bilet(30);
		rezervaSiAfiseazaBiletLaCasa(bilet);
		
		//apel adaptre de ob
		IBiletOnline adapter = new Adapter(bilet);
		rezervaSiAfiseazaBiletOnline(adapter);
	
		
		//apel adapter de clase
		IBiletOnline adapterClase = new AdapterV2(20);
		rezervaSiAfiseazaBiletOnline(adapterClase);
	}
}
