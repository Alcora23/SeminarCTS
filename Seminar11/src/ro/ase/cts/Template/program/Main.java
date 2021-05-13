package ro.ase.cts.Template.program;

import ro.ase.cts.Template.clase.Spectator;
import ro.ase.cts.Template.clase.SpectatorAbstract;
import ro.ase.cts.Template.clase.SpectatorVip;

public class Main {

	public static void main(String[] args) {
		
		SpectatorAbstract spectator = new Spectator("Andrei");
		SpectatorAbstract spectatorVip = new SpectatorVip("Marius");
		
		spectator.intrareInStadion();
		spectatorVip.intrareInStadion();
		

	}

}
