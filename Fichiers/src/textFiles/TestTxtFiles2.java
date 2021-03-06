package textFiles;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

public class TestTxtFiles2 {

	public static void main(String[] args) throws IOException {
		
	File filsrc = new File("source.txt"); //fichier source
    File fildes = new File("Salaries.txt"); //Fichier destinataire
    
    FileReader fr = new FileReader(filsrc); //la lecteure du fichier
    
	ArrayList<String> resultat = new ArrayList<String>(); //Là ou on va stocker le résultat
     try {
		BufferedReader br = new BufferedReader(fr); //Stocker le resultat qu'on a lit dans le BufferedReader

		while(br.ready()) //parcouru tous les lignes
		{
			String line = br.readLine(); //la lecture ligne par ligne
			resultat.add(line); // L'ajout des lignes à notre ArrayList
			System.out.println(line); //L'affichage pour voir ce qui se passe
		}

		System.out.println("----------- Start 2eme Maniere ------------");
	    for (String line2 = br.readLine(); line2 != null; line2 = br.readLine()) {
	        System.out.println(line2);
	     }
	    System.out.println("----------- End 2eme Maniere ------------");
	    br.close();
	    
		if(!fildes.exists()) { //Vérifier si le fichier existe sinon on le crée
			fildes.createNewFile();
		}
		System.out.println(fildes.getAbsoluteFile());
		FileWriter fwr = new FileWriter(fildes.getAbsoluteFile()); //Préparation de fichier pour l'ecriture
		
		BufferedWriter bwr = new BufferedWriter(fwr); //BufferedWriter 
		for (String l : resultat) {
			bwr.write(l+"\n"); //l'écritue ligne par ligne et retour à la ligne \n (new ligne)
		}
		bwr.flush();
		bwr.close();//fermeture
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}

	}

}
