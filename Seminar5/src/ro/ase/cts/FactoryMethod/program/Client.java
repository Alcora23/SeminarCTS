package ro.ase.cts.FactoryMethod.program;

import ro.ase.cts.FactoryMethod.clase.FactoryAsistent;
import ro.ase.cts.FactoryMethod.clase.FactoryInfirmier;
import ro.ase.cts.FactoryMethod.clase.FactoryMedic;
import ro.ase.cts.FactoryMethod.clase.IFactory;
import ro.ase.cts.FactoryMethod.clase.PersonalSpital;

public class Client {
	
	public static void afisareInformatiiPersonalSpital(IFactory factory,String nume) {
		PersonalSpital personalSpital = factory.getPersonal(nume);
		
		System.out.println(personalSpital.toString());
	}
	
	public static void main(String[] args) {
		
		afisareInformatiiPersonalSpital (new FactoryAsistent(),"Mircea");
		afisareInformatiiPersonalSpital (new FactoryMedic(),"Mihai");
		afisareInformatiiPersonalSpital (new FactoryInfirmier(),"Mirel");
		

	}

}
