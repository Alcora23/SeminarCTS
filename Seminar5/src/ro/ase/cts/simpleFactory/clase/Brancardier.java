package ro.ase.cts.simpleFactory.clase;

public class Brancardier extends PersonalSpital{
	
		public Brancardier(String nume) {
			super(nume);
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Brancardier:" + super.getNume();
		}
	

}
