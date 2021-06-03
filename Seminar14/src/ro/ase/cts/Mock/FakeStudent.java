package ro.ase.cts.Mock;

import java.util.List;

import ro.ase.cts.clase.IStudent;

public class FakeStudent implements IStudent{

	private String numeStudent;
	private List<Integer> listaNote;
	private float medie;
	private int nota;
	private boolean areRestanta;
	
// obligatoriu am nevoie de set pt fiecare atribut
	
	public void setListaNote(List<Integer> listaNote) {
		this.listaNote = listaNote;
	}

	public void setNumeStudent(String numeStudent) {
		this.numeStudent = numeStudent;
	}

	public void setMedie(float medie) {
		this.medie = medie;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public void setAreRestanta(boolean areRestanta) {
		this.areRestanta = areRestanta;
	}

	@Override
	public String getNume() {
		// TODO Auto-generated method stub
		return numeStudent;
	}

	@Override
	public void setNume(String nume) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Integer> getNote() {
		// TODO Auto-generated method stub
		return listaNote;
	}

	@Override
	public void adaugaNota(int nota) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculeazaMedie() {
		// TODO Auto-generated method stub
		return medie;
	}

	@Override
	public int getNota(int index) {
		// TODO Auto-generated method stub
		return nota;
	}

	@Override
	public boolean areRestante() {
		// TODO Auto-generated method stub
		return areRestanta;
	}

}
