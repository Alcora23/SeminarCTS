package ro.ase.cts.ChainOfResponsibility.program;

import ro.ase.cts.ChainOfResponsibility.clase.Client;
import ro.ase.cts.ChainOfResponsibility.clase.NotificatorEmail;
import ro.ase.cts.ChainOfResponsibility.clase.NotificatorSMS;

public class Main {

	public static void main(String[] args) {
		
		Client client1 = new Client(null,null,"Marin");
		Client client2 = new Client(null,"072257893","Cristina");
		Client client3 = new Client("voicu@gmail.com",null,"Voicu");
		
		NotificatorSMS notificatrSms = new NotificatorSMS();
		NotificatorEmail notificatrEmail = new NotificatorEmail();
		notificatrSms.setNotificator(notificatrEmail);
		notificatrSms.trimiteNotificare(client1, "Mesaj");
	}

}
