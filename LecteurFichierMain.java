package LecteurFichier;

import java.io.IOException;

public class LecteurFichierMain {
	
	private static final String FILENAME = "\\Test.txt";

	public static void main(String[] args) throws IOException{
		System.out.println("----- Projet Lecteur Fichier -----\n");
		
		System.out.println("----- Texte à l'endroit -----\n");
		
		FichierDroit fd = new FichierDroit("\\Test.txt");
		fd.lire(FILENAME);
		fd.montrerLeFichier();
		
		System.out.println("");
		System.out.println("----- Texte à l'envers -----\n");
		
		FichierReverse fr = new FichierReverse("\\Test.txt");
		fr.lire(FILENAME);
		fr.montrerLeFichier();
		
		
		System.out.println("");
		System.out.println("----- Texte palindromique -----\n");
		
		FichierPalindromique fp = new FichierPalindromique("\\Test.txt");
		fp.lire(FILENAME);
		fp.montrerLeFichier();
		
		  }
	}