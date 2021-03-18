package ro.ase.cts.clase;
public class Presedinte {
	private String nume;
	private int varsta;
	private int mandat;
	
	private Presedinte() {
		this.nume = "Putin";
		this.varsta = 68;
		this.mandat = 10;
	}
	private Presedinte(String nume, int varsta, int mandat) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.mandat = mandat;
	}
	
	public static Presedinte instance =new Presedinte(); //de regula este private , dar la eager initialization putem pune si publica
	
	public static Presedinte getInstance() {
		return instance;
	}
	@Override
	public String toString() {
		return "Presedinte [nume=" + nume + ", varsta=" + varsta + ", mandat=" + mandat + "]";
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
	
	public void setMandat(int mandat) {
		this.mandat = mandat;
	}
	
}
