package ro.ase.cts.Flyweight.clase;

public class Client implements Flyweight{

	private String nume;
	private String nrTelefon;
	private String email;
	
	
	public Client(String nume, String nrTelefon, String email) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.email = email;
	}


	@Override
	public String toString() {
		return "Client [nume=" + nume + ", nrTelefon=" + nrTelefon + ", email=" + email + "]";
	}



	@Override
	public void printreazaRezervare(Rezervare rezervare) {
		//printam info din client dar si pe cele din rezervare
		System.out.println(this.toString()+" "+rezervare.toString());
	}

}
