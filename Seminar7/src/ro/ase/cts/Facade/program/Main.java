package ro.ase.cts.Facade.program;

import ro.ase.cts.Facade.clase.Persoana;
import ro.ase.cts.Facade.clase.VerificatorPersoane;

public class Main {

	public static void main(String[] args) {
		
		Persoana persoana = new Persoana("Andrei","1951212016833");
		if(VerificatorPersoane.isEligibile(persoana) ) {
			System.out.println("Persoana este eligibila");
		}
		else {
			System.out.println("Persoana nu este eligibila");
		}
	}

}
