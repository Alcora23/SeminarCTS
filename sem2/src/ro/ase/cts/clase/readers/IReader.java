package ro.ase.cts.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class IReader {

	protected String fisier;

	public IReader(String fisier) {
		this.fisier = fisier;
	}

	public abstract List<Aplicant> readAplicants() throws FileNotFoundException, NumberFormatException;

	public void citireAplicant(Scanner scanner, Aplicant aplicant) {
		String nume = scanner.next();
		String prenume = scanner.next();
		int varsta = scanner.nextInt();
		int punctaj = scanner.nextInt();
		int nr_proiecte = scanner.nextInt();
		String[] vectorDenumiri = new String[nr_proiecte];
		for (int proiect = 0; proiect < nr_proiecte; proiect++)
			vectorDenumiri[proiect] = scanner.next();

		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setVectorDenumiri(vectorDenumiri, nr_proiecte);
		
	}
}
