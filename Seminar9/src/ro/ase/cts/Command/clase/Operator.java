package ro.ase.cts.Command.clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {

	private List<Comanda> comenzi;

	public Operator() {
		super();
		this.comenzi = new ArrayList<>();
	}
	
	public void invoca(Comanda comanda) {
		this.comenzi.add(comanda);
	}
	
	public void executaComanda() {
		this.comenzi.get(0).executa();
		this.comenzi.remove(0);
	}
	
	
}
