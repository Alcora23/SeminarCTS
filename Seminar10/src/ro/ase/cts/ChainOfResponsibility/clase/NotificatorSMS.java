package ro.ase.cts.ChainOfResponsibility.clase;

public class NotificatorSMS  extends Notificator{

	@Override
	public void trimiteNotificare(Client client, String mesaj) {
	if(client.getTelefon()!=null) {
		System.out.println("Trimitere SMS catre " + client.getNume() + " cu mesajul " + mesaj);
		
	}
	else {
		
		if(super.getNotificator()!=null) {
				this.getNotificator().trimiteNotificare(client, mesaj);
	     }
		
		else {
			System.out.println("Domule Manager, nu avem date de contact pentru clientul "+ client.getNume());
		}
		
	}
	}
}
	
	

