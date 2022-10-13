package LecteurFichier;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public abstract class FichierTexte implements LecteurFichier{
	
	private final String nomF;
	
	protected ArrayList<String> contenu;
	
	public FichierTexte(String nom) {
		this.nomF = nom;
		this.contenu = new ArrayList<String>();
	}
	
	public void lire(String nomF) throws IOException {
		
			
		try (
	             BufferedReader reader = new BufferedReader(new FileReader(this.nomF)))
		{
			
			String ligneCourante;  
            while((ligneCourante=reader.readLine()) != null){    
             contenu.add(ligneCourante); 
            }    
          }
		catch(Exception e)
		{
			System.out.println(e);
		} 
		
	}
	
	
	public abstract void montrerLeFichier();
	

}