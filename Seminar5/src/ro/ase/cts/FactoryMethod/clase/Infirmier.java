package ro.ase.cts.FactoryMethod.clase;

public class Infirmier extends PersonalSpital{

	public Infirmier (String nume) {
		super(nume);
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Infirmier:" + super.getNume();
	}
	
	
}
 

