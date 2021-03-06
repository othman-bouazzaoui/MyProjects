package web;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class form
 */
//@WebServlet("/form")
public class form extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public static int FIL_TEMPO = 10240;
    public static String CHEMIN_FILE = "C:/Users/obouazzaoui/Desktop/PG/";
    /**
     * @see HttpServlet#HttpServlet()
     */
    public form() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String desc = request.getParameter("desc");
       request.setAttribute("desc", desc);
       
       Part part = request.getPart("fichier");
       System.out.println(part.getName());
       
       
       //String nomFichier = getNomFichier(part);
        String nomFichier = part.getSubmittedFileName();
       
       if(nomFichier != null && !nomFichier.isEmpty()) {
    	   String nomChamp = part.getName();
    	   System.out.println(part.getSubmittedFileName());
    	   //Correction bug internet Explorer
    	   //nomFichier = nomFichier.substring(nomFichier.lastIndexOf('/')+1).substring(nomFichier.lastIndexOf('\\')+1);
    	   ecrireFichier(part, nomFichier, CHEMIN_FILE);
    	   request.setAttribute("nomChamp", nomChamp);
       }
       this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
		
	}
    //Methode pour recuperer le nom du fichier
	private static String getNomFichier(Part part)
	{
	    /* Boucle sur chacun des paramètres de l'en-tête "content-disposition". */
	    for ( String contentDisposition : part.getHeader( "content-disposition" ).split( ";" ) ) {
	    	/* Recherche de l'éventuelle présence du paramètre "filename". */
	        if ( contentDisposition.trim().startsWith("filename") ) {
	            /* Si "filename" est présent, alors renvoi de sa valeur, c'est-à-dire du nom de fichier. */
	            return contentDisposition.substring( contentDisposition.indexOf( '=' ) + 1 );
	        }
	    }
	    /* Et pour terminer, si rien n'a été trouvé... */
	    return null;
	}
	
	//Methode pour ecrire le fichier
	private void ecrireFichier(Part part, String nomFichier, String chemin) throws IOException {
		BufferedInputStream entree =null;
		BufferedOutputStream sortie = null;
		
		
			entree = new BufferedInputStream(part.getInputStream(),FIL_TEMPO);
			
			
			sortie = new BufferedOutputStream(new FileOutputStream(new File(chemin+nomFichier)),FIL_TEMPO);
			
			byte[] tempo = new byte[FIL_TEMPO];
			int longeur;
	
			while ((longeur = entree.read(tempo)) > 0)
			{
				sortie.write(tempo,0,longeur);
			}
			sortie.close();
		
		
	}
}
