package ro.ase.cts.simpleFactory.clase;

public class PersonalSpital {
	private String nume;

	public PersonalSpital(String nume) {
		super();
		this.nume = nume;
	}

	public String getNume() {
		return nume;
	}

	@Override
	public String toString() {
		return "PersonalSpital [nume=" + nume + "]";
	}
	
}
