package ro.ase.cts.Facade.clase;

class BirouriCredite {
	
	public static boolean areCredite (Persoana persoana) {
		return Integer.parseInt(" " + persoana.getCNP().charAt(11)) % 2 == 0;
	}
	
}
