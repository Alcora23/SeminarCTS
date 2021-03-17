package ro.ase.cts.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;
import ro.ase.cts.clase.Student;

public class StudentReader extends IReader {

	public StudentReader(String fisier) {
		super(fisier);
		// TODO Auto-generated constructor stub
	}

	public List<Aplicant> readAplicants() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(super.fisier));
		scanner.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<Aplicant>();

		while (scanner.hasNext()) {
			Student student = new Student();
			super.citireAplicant(scanner, student);
			int an_studii = scanner.nextInt();
			String facultate = (scanner.next()).toString();
			student.setAn_studii(an_studii);
			student.setFacultate(facultate);
			studenti.add(student);
		}
		scanner.close();
		return studenti;
	}
}
