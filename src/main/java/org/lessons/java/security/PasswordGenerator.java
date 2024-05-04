package org.lessons.java.security;

//Creo un attributo utente di tipo Utente, poi creo il costruttore che acetta come paramentro Utente,
//ad ultimo creo il metodo che andrà a generare la password basata sulle informazioni di base di un utente, fornite dall'oggetto Utente.

public class PasswordGenerator {

	private Utente utente;
	
	public PasswordGenerator(Utente utente) {
		this.utente = utente;
	}
	
	
	public String generaPassword() {
		return utente.getNome() + "-" + utente.getCognome() + "-" + utente.getColorePreferito() + "-" + (utente.getGiornoNascita() + utente.getMeseNascita() + utente.getAnnoNascita());
	}
}

