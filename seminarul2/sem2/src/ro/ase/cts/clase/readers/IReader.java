package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import ro.ase.cts.clase.Aplicant;

public abstract class IReader {
	
	protected String fisier;
	
	public IReader(String fisier) {
		this.fisier=fisier;
	}
	
	public abstract List<Aplicant> readAplicants()throws FileNotFoundException, NumberFormatException;

}
