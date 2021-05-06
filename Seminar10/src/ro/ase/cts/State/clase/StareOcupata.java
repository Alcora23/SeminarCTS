package ro.ase.cts.State.clase;

public class StareOcupata implements Stare{

	@Override
	public void modificaStare(Masa masa) {
		if(masa.getStare() instanceof StareLibera) {
			System.out.println("Masa cu numarul " + masa.getNumar()+ " este ocupata");
			masa.setStare(this);
		}
		
		else if(masa.getStare() instanceof StareRezervata) {
			System.out.println("Masa cu numarul " + masa.getNumar()+ " este ocupata");
			masa.setStare(this);
		}
		else {
			System.out.println("Masa nu poate fi ocupata");
		}
		
	}

}
