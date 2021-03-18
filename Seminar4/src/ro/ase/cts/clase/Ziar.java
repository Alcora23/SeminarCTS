package ro.ase.cts.clase;

public class Ziar {
	private String nume;
	private double pret;
	private int nrPagini;
	
	private static Ziar instance =null;
	
	private Ziar(String nume, double pret, int nr_pagini) {
		super();
		this.nume = nume;
		this.pret = pret;
		this.nrPagini = nr_pagini;
	}
	
	private Ziar () {
		this.nume = "Click";
		this.pret = 10;
		this.nrPagini = 20;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}

	public void setNr_pagini(int nr_pagini) {
		this.nrPagini = nr_pagini;
	}

	@Override
	public String toString() {
		return "Ziar [nume=" + nume + ", pret=" + pret + ", nr_pagini=" + nrPagini + "]";
	}
	
	public static synchronized Ziar getInstance (String nume, double pret, int nr_pagini) {
		if(instance == null) {
			instance = new Ziar (nume,pret,nr_pagini);
		}
		return instance;
	}
	
	
	
}
