package ro.ase.cts.Builder.clase;

public class RezervareBuilder implements AbstractBuilder {
	private Rezervare rezervare;
	
public RezervareBuilder() {
		this.rezervare = new Rezervare(0,false,false,false,false,"notFound");
	}

public RezervareBuilder(int codRezervare) {
	this.rezervare = new Rezervare( codRezervare,false,false,false,false,"notFound");
}


public RezervareBuilder setCodRezervare(int cod) {
		this.rezervare.setCodRezervare(cod);
		return this;
	}

public RezervareBuilder setAreMancare(boolean areMancare) {
	this.rezervare.setAreMancare(areMancare);
	return this;
}

public RezervareBuilder setAreScaun(boolean areScaun) {
	this.rezervare.setAreScaunErgonomic(areScaun);
	return this;
}

public RezervareBuilder setAreButura(boolean areBautura) {
	this.rezervare.setAreBautura(areBautura);
	return this;
}

public RezervareBuilder setAreMuzica(boolean areMuzica) {
	this.rezervare.setAreMuzicaAmbientala(areMuzica);
	return this;
}

public RezervareBuilder setgenMuzica(String genMuzica) {
	this.rezervare.setGenMuzica(genMuzica);
	return this;
}

@Override
public Rezervare build() {
	return rezervare;
}

}
