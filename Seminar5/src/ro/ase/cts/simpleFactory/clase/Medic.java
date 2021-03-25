package ro.ase.cts.simpleFactory.clase;

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
