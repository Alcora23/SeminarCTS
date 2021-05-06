package ro.ase.cts.ChainOfResponsibility.clase;

public class Client {

	private  String mail;
	private String telefon;
	private String nume;
	
	public Client(String mail, String telefon, String nume) {
		super();
		this.mail = mail;
		this.telefon = telefon;
		this.nume = nume;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getMail() {
		return mail;
	}
	public String getTelefon() {
		return telefon;
	}
	public String getNume() {
		return nume;
	}
	
	
	
	
}
