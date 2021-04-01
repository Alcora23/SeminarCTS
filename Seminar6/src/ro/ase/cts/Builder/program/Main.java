package ro.ase.cts.Builder.program;

import ro.ase.cts.Builder.clase.Rezervare;
import ro.ase.cts.Builder.clase.RezervareBuilder;
import ro.ase.cts.Builder.clase.RezervareBuilderV2;

public class Main {
	public static void main(String[] args) {
		Rezervare rezervare1;
		Rezervare rezervare2;
		
		RezervareBuilder rezervareBuilder = new RezervareBuilder();
		rezervareBuilder.setCodRezervare(100).setAreMancare(true);
		rezervare1= rezervareBuilder.build();
		
		rezervare2 = new RezervareBuilder(101).setAreMancare(true).build();
		
		Rezervare rezervare3 = new Rezervare (102,true,false,true,true,"pop");
		
		Rezervare rezervare4;
		rezervareBuilder.setCodRezervare(104).setAreMuzica(true).setAreScaun(true);
		rezervare4=rezervareBuilder.build();
		
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
		System.out.println(rezervare3.toString());
		System.out.println(rezervare4.toString());
		
		
		RezervareBuilderV2 rezervareBuilderV2 = new RezervareBuilderV2().setAreMancare(true).setAreBautura(true).setAreScaunErgonomic(true);
		Rezervare rezervare5 = rezervareBuilderV2.setCodRezervare(148).build();
		Rezervare rezervare6 = rezervareBuilderV2.setCodRezervare(150).build();

		System.out.println(rezervare5.toString());
		System.out.println(rezervare6.toString());
		
	}

}
