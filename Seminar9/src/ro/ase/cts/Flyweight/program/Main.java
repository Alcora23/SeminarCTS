package ro.ase.cts.Flyweight.program;

import ro.ase.cts.Flyweight.clase.Flyweight;
import ro.ase.cts.Flyweight.clase.FlyweightFactory;
import ro.ase.cts.Flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		Rezervare rezervare1 =  new Rezervare(18,5,15);
		Rezervare rezervare2 =  new Rezervare(42,7,10);
		Rezervare rezervare3 =  new Rezervare(19,2,14);
		Rezervare rezervare4 =  new Rezervare(15,1,20);

		FlyweightFactory factory = new FlyweightFactory();
		Flyweight client1 = factory.getFlyweight("0727300");
		client1.printreazaRezervare(rezervare1);

		factory.getFlyweight("0727300").printreazaRezervare(rezervare2);
		factory.getFlyweight("0727999").printreazaRezervare(rezervare3);
		factory.getFlyweight("0727999").printreazaRezervare(rezervare4);
	}

}
