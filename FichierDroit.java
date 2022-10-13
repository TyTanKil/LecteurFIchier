package LecteurFichier;

public class FichierDroit extends FichierTexte {
	
	public FichierDroit(String nom) {
		super(nom);
	}

	@Override
	public void montrerLeFichier() {
		System.out.println(contenu);
	}

}