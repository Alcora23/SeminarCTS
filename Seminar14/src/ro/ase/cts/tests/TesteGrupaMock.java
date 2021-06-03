package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.Mock.DummyStudent;
import ro.ase.cts.Mock.FakeStudent;
import ro.ase.cts.Mock.StubStudent;
import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.tests.categorii.GetPromovabilitateCategory;
import ro.ase.cts.tests.categorii.TesteUrgente;

public class TesteGrupaMock {

	@Test
	@Category(TesteUrgente.class)
	public void testAdaugaStudent() {
		IStudent  student = new DummyStudent();
		Grupa grupa = new Grupa (1081);
		grupa.adaugaStudent(student);
		assertEquals(1, grupa.getStudenti().size());
	}

	
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitate() {
		IStudent student = new StubStudent();
		Grupa grupa = new Grupa (1081);
		grupa.adaugaStudent(student);
		
		assertEquals(1, grupa.getPromovabilitate(),0.001);
	}
	
	@Test
	@Category({GetPromovabilitateCategory.class, TesteUrgente.class})
	public void testGetPromovabilitateFakeStudent() {
		Grupa grupa = new Grupa (1081);
		for (int i=0; i<8;i++) {
			FakeStudent student = new FakeStudent();
			student.setAreRestanta(false);
			grupa.adaugaStudent(student);
		}
		
		for (int i=0; i<2;i++) {
			FakeStudent student = new FakeStudent();
			student.setAreRestanta(true);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.8f, grupa.getPromovabilitate(),0.015);
	}
}
