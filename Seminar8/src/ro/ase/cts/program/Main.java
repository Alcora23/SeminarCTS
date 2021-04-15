package ro.ase.cts.program;

import ro.ase.cts.clase.DecoratorAbstract;
import ro.ase.cts.clase.DecoratorCuLaMultiAni;
import ro.ase.cts.clase.DecoratorCuPasteFericit;
import ro.ase.cts.clase.NotaDePlata;

public class Main {

	public static void main(String[] args) {
		NotaDePlata notaInitiala = new NotaDePlata(55);
		notaInitiala.printeaza();
		
		DecoratorAbstract decoratorLaMultiAni = new DecoratorCuLaMultiAni(notaInitiala);
		decoratorLaMultiAni.printeazaFelicitare();
		System.out.println();
		decoratorLaMultiAni.printeaza();
		
		
		DecoratorAbstract decoratorPaste = new DecoratorCuPasteFericit(notaInitiala);
		decoratorPaste.printeaza();
		
		
		NotaDePlata notaDePlata = new NotaDePlata(150);
		DecoratorAbstract decoratorAbstract = new DecoratorCuLaMultiAni(notaDePlata);
		DecoratorAbstract decoratorAbstract2 = new DecoratorCuPasteFericit(decoratorAbstract);
		decoratorAbstract2.printeaza();
	}

}
