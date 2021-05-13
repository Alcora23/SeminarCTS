package ro.ase.cts.Observer.program;

import ro.ase.cts.Observer.clase.*;

public class Main {

	public static void main(String[] args) {
	
		Manager manager = new Manager();
		Client client = new Client("Dan");
		Client client1 = new Client("Razvan");
		Client client2 = new Client("Florin");
		
		
		manager.addObservator(client);
		manager.addObservator(client1);
		manager.addObservator(client2);
		
		
		manager.anuntaMeci("fotbal");
		
		manager.stergeObservator(client2);
		
		manager.anuntaMeci("handbal");
	}

}
