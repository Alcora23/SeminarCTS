package ro.ase.cts.FactoryMethod.clase;

public class Medic extends PersonalSpital{

	public Medic(String nume) {
		super(nume);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Medic:" + super.getNume();
	}
}
