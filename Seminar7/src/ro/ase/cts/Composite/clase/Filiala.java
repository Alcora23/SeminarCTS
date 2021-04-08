package ro.ase.cts.Composite.clase;

public class Filiala implements ISediu {
	private String numeFiliala;
		
	public Filiala(String numeFiliala) {
		super();
		this.numeFiliala = numeFiliala;
	}

	@Override
	public void afiseazaDescriere() {
		System.out.println("Este filiala " + numeFiliala);
		
	}

	@Override
	public void addNod(ISediu sediu) throws Exception {
		throw new Exception ("Nu este implemnetat");
		
	}

	@Override
	public void removeNod(ISediu sediu) throws Exception {
		throw new Exception ("Nu este implemnetat");
		
	}

	@Override
	public ISediu getNod(int pozitie) throws Exception {
		throw new Exception ("Nu este implemnetat");
		
	}

}
