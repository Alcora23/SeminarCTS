package ro.ase.cts.State.program;

import ro.ase.cts.State.clase.Masa;
import ro.ase.cts.State.clase.StareLibera;

public class Main {

	public static void main(String[] args) {
		
		Masa masa = new Masa(10);
		
		
		masa.elibereazaMasa();
		masa.rezervaMasa();
	
		masa.rezervaMasa();
		
		masa.ocupaMasa();
		

	}

}
