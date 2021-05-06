package ro.ase.cts.Strategy.program;

import ro.ase.cts.Strategy.clase.*;

public class Main {

	public static void main(String[] args) {
		
		Client client = new Client("Anca");
		
		client.plateste(30);
		client.setTipPlata(new PlataCard());
		client.plateste(200);
		

	}

}
