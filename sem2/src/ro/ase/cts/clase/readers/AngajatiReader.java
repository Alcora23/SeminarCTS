package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Angajat;
import ro.ase.cts.clase.Aplicant;

public class AngajatiReader extends IReader {

	public AngajatiReader(String fisier) {
		super(fisier);
		// TODO Auto-generated constructor stub
	}

	public List<Aplicant> readAplicants() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(super.fisier));
		scanner.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Angajat angajat = new Angajat();
			super.citireAplicant(scanner, angajat);
			int salariu = scanner.nextInt();
			String ocupatie = scanner.next();
			angajat.setSalariu(salariu);
			angajat.setOcupatie(ocupatie);
			angajati.add(angajat);
		}
		scanner.close();
		return angajati;
	}
}
