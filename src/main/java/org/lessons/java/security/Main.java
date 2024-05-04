package org.lessons.java.security;

import java.util.Scanner;

//Utilizzo la classe Scanner per memorizzare nelle rispettive variabili ciò che l'utente andrà a digitare, compilando le risposte.
//dopo devo istanziare la classe Utente e la classe PasswordGenerator, cosi da poter richiamare i metodi che ho creato al loro interno,
//con il metodo creato nella classe Utente potrò stampare in una stringa concatenata i dati che l'utente inserira,
//con il metodo creato nella classe PasswordGenerator potrò generare la password che concatena tutti i dati, e per quanto riguarda
//il giorno, mese e anno li sommera stampando il risultato al posto della data.
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Inserisci il tuo nome: ");
		String nome = scan.nextLine();
		System.out.println("Inserisci il tuo cognome: ");
		String cognome = scan.nextLine();
		System.out.println("Inserisci il tuo colore preferito: ");
		String colorePreferito = scan.nextLine();
		System.out.println("Inserisci il tuo giorno di nascita: ");
		int giornoNascita = scan.nextInt();
		System.out.println("Inserisci il tuo mese di nascita: ");
		int meseNascita = scan.nextInt();
		System.out.println("Inserisci il tuo anno di nascita: ");
		int annoNascita = scan.nextInt();
		scan.close();
		Utente datiUtente = new Utente(nome, cognome, colorePreferito, giornoNascita, meseNascita, annoNascita);
		
		System.out.println(datiUtente.mostraDatiUtente());
		
		Utente utente = new Utente(nome, cognome, colorePreferito, giornoNascita, meseNascita, annoNascita);
		
		PasswordGenerator generatorePassword = new PasswordGenerator(utente);
		
		System.out.println(generatorePassword.generaPassword());
	}

}
