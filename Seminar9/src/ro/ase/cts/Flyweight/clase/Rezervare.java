package ro.ase.cts.Flyweight.clase;

public class Rezervare {
	private int nrMasa;
	private int nrPersoane;
	private int ora;
	
	public Rezervare(int nrMasa, int nrPersoane, int ora) {
		super();
		this.nrMasa = nrMasa;
		this.nrPersoane = nrPersoane;
		this.ora = ora;
	}

	@Override
	public String toString() {
		return "Rezervare [nrMasa=" + nrMasa + ", nrPersoane=" + nrPersoane + ", ora=" + ora + "]";
	}
	

}
