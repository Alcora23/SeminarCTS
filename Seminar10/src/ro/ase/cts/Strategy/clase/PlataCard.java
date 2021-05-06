package ro.ase.cts.Strategy.clase;

public class PlataCard implements IPlata {

	@Override
	public void plateste(float suma) {
		System.out.println("A fost achitata cu cadrul suma de: " + suma);
		
	}

}
