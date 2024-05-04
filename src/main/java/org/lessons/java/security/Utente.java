package org.lessons.java.security;

//Creo gli attributi della classe, a seguire creo il costruttore su cui passare i parametri degli attributi,
//devo incapsulare gli attributi di modo che possano essere direttamente acessibili dalle altre classi singolarmente,
//ad ultimo creo un metodo che mi permetta di mostrare in linea i dati che l'utente andra a inserire dopo che li compila.

public class Utente {
	
	//Attributi della classe utente
	private String nome;
	private String cognome;
	private String colorePreferito;
	private int giornoNascita;
	private int meseNascita;
	private int annoNascita;
	
	//Costruttore
	public Utente(String nome, String cognome, String colorePreferito, int giornoNascita, int meseNascita, int annoNascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.colorePreferito = colorePreferito;
		this.giornoNascita = giornoNascita;
		this.meseNascita = meseNascita;
		this.annoNascita = annoNascita;
		
	}

	public String  getNome() {
		return nome;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public String getColorePreferito() {
		return colorePreferito;
	}
	
	public int getGiornoNascita() {
		return giornoNascita;
	}
	
	public int getMeseNascita() {
		return meseNascita;
	}
	
	public int getAnnoNascita() {
		return annoNascita;
	}
	
	public String mostraDatiUtente() {
		return "nome: " + nome + " cognome: " + cognome + " colore: " + colorePreferito + " data: " + giornoNascita + "/" + meseNascita + "/" + annoNascita;
	}
	
}
