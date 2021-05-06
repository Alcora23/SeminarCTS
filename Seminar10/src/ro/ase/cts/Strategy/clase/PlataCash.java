package ro.ase.cts.Strategy.clase;

public class PlataCash implements IPlata{

	@Override
	public void plateste(float suma) {
		System.out.println("A fost achitata cash suma de: " + suma);
		
	}

}
