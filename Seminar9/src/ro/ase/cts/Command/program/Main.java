package ro.ase.cts.Command.program;

import ro.ase.cts.Command.clase.Comanda;
import ro.ase.cts.Command.clase.ComandaOcupare;
import ro.ase.cts.Command.clase.ComandaRezervare;
import ro.ase.cts.Command.clase.Masa;
import ro.ase.cts.Command.clase.Operator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Masa masa = new Masa(1);
		Masa masa2 = new Masa(2);
		
		Comanda comanda1 = new ComandaRezervare(masa);
		Comanda comanda2 = new ComandaOcupare(masa2);
		Comanda comanda3 = new ComandaOcupare(masa2);
		
		Operator operator = new Operator();
		operator.invoca(comanda1);
		operator.executaComanda();
		
		operator.invoca(comanda2);
		operator.invoca(comanda3);
		
		
		operator.executaComanda();
		operator.executaComanda();
		
	}

}
