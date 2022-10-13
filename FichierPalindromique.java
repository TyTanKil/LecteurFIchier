package LecteurFichier;

import java.util.ArrayList;
import java.util.Collections;

public class FichierPalindromique extends FichierTexte {
	
	public FichierPalindromique(String nom) {
		super(nom);
	}

	public void montrerLeFichier() {
		int sizeList = contenu.size();

        ArrayList<String> contenuPalindrome = new ArrayList<>();

        for (int i = 0; i < sizeList; i++) {
            String line  = contenu.get(i);
            String[] phrases = (line.split("/[\\s+]/g"));

            for (String palindrome : phrases) {
                StringBuilder phrasesInverse = new StringBuilder(palindrome);
                palindrome = phrasesInverse.reverse().toString();
                contenuPalindrome.add(palindrome);
            }
        }
        Collections.reverse(contenuPalindrome);
        contenu.addAll(contenuPalindrome);
        System.out.println(contenu);
	}
	
}