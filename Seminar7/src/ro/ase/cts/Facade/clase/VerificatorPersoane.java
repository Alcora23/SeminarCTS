package ro.ase.cts.Facade.clase;

public class VerificatorPersoane {
	public static boolean isEligibile(Persoana persoana) {
		if(persoana.getVarsta() >= 18) {
			if(!Politie.isUrmarit(persoana)) {
				if(!BirouriCredite.areCredite(persoana)) {
					return true;
				}
			}
		}
		return false;
	}
}
