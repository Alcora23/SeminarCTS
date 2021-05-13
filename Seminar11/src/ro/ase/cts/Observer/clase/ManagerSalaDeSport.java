package ro.ase.cts.Observer.clase;

import java.util.ArrayList;
import java.util.List;

public abstract class ManagerSalaDeSport {
	private List<Observator> observatori;

	public ManagerSalaDeSport() {
		super();
		this.observatori = new ArrayList<>();
	}
	
	public void addObservator( Observator o) {
		observatori.add(o);
	}
	
	
	public void stergeObservator( Observator o) {
		observatori.remove(o);
	}
	
	public void notificaObservatori (String mesaj) {
		for(Observator o: observatori) {
			o.primesteMesaj(mesaj);
		}
	}
}
