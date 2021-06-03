package ro.ase.cts.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import ro.ase.cts.clase.Grupa;
import ro.ase.cts.clase.IStudent;
import ro.ase.cts.clase.Student;
import ro.ase.cts.tests.categorii.ConstructorGrupaCategory;
import ro.ase.cts.tests.categorii.GetPromovabilitateCategory;

public class TestsGupa {
	
	@Test
	@Category(ConstructorGrupaCategory.class)
	public void testConstructorCorect() {
		Grupa grupa = new Grupa (1081);
		assertEquals(1081,grupa.getNrGrupa());
	}
	
	@Test
	@Category(ConstructorGrupaCategory.class)
	public void testConstructorExistaLista() {
		Grupa grupa = new Grupa (1081);
		assertNotNull(grupa.getStudenti());
	}

	
	@Test
	@Category(ConstructorGrupaCategory.class)
	public void testConstructorLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	@Category(ConstructorGrupaCategory.class)
	public void testConstructorLimitaSuperioara() {
		Grupa grupa = new Grupa(1100);
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Category(ConstructorGrupaCategory.class)
	public void testConstructorExceptieLimitaInferioara() {
		Grupa grupa =new Grupa(900);
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Category(ConstructorGrupaCategory.class)
	public void testConstructorExceptieLimitaSuperioara() {
		Grupa grupa =new Grupa(1200);
	}
	
	@Test (timeout = 500)
	@Category(ConstructorGrupaCategory.class)
	public void testConstructorPerformantaDeTimp() {
		Grupa grupa =new Grupa(1081);
	}
	
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateRight() {
		Grupa grupa = new Grupa(1081);
		for(int i=0; i<10;i++) {
			IStudent student = new Student();
			student.adaugaNota(5);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		for(int i=0; i<5;i++) {
			IStudent student = new Student();
			student.adaugaNota(4);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0.66f, grupa.getPromovabilitate(),0.1);
	}
	
	
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateLimitaInferioara() {
		Grupa grupa = new Grupa(1001);
		for(int i=0; i<10;i++) {
			IStudent student = new Student();
			student.adaugaNota(4);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(0, grupa.getPromovabilitate(),0.01);
	}
	
	
	@Test
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateLimitaSuperioara() {
		Grupa grupa = new Grupa(1081);
		for(int i=0; i<10;i++) {
			IStudent student = new Student();
			student.adaugaNota(8);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		
		assertEquals(1, grupa.getPromovabilitate(),0.01);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateErrorCondition() {
		Grupa grupa = new Grupa(1081);
		
		grupa.getPromovabilitate();
	}
	
	@Test 
	@Category(GetPromovabilitateCategory.class)
	public void testGetPromovabilitateCardinality1() {
		Grupa grupa = new Grupa(1081);
		IStudent student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(6);
		grupa.adaugaStudent(student);
		
		assertEquals(1,grupa.getStudenti().size());
	}
	
}
