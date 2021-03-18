package ro.ase.cts.clase;

public class PresedinteLazy {
	
	private String nume;
	private int varsta;
	private int mandat;
	
	private static PresedinteLazy instance =null;

	private PresedinteLazy(String nume, int varsta, int mandat) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.mandat = mandat;
	}
	
	private PresedinteLazy() {
		this.nume = "Putin";
		this.varsta = 68;
		this.mandat = 10;
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
	
	
	@Override
	public String toString() {
		return "PresedinteLazy [nume=" + nume + ", varsta=" + varsta + ", mandat=" + mandat + "]";
	}

	//la run time pot sa ii dau valorile cu care vreau sa mi se initializeze instanta -> ESTE UN AVANTAJ LA LAZY FARA DE EAGER
	public static synchronized PresedinteLazy getInstance(String nume, int varsta, int mandat) {
		if (instance == null) {
			instance = new PresedinteLazy(nume,varsta,mandat);
		}
		
		return instance;
	}
	

}
