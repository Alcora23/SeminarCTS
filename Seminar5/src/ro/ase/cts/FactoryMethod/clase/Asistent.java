package ro.ase.cts.FactoryMethod.clase;

public class Asistent extends PersonalSpital{

	public Asistent (String nume) {
		super(nume);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Asistent: " + super.getNume();
	}
}
