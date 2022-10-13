package LecteurFichier;

import java.util.Collections;

public class FichierReverse extends FichierTexte {
	
	public FichierReverse(String nom) {
		super(nom);
	}
	
	@Override
	public void montrerLeFichier() {
		Collections.reverse(contenu);
		System.out.println(contenu);
	}

}