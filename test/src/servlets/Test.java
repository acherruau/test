package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Coyote;

public class Test extends HttpServlet {

	 public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		 
		 String paramAuteur = request.getParameter( " auteur" );
		 String message = "Transmission de variables : OK ! ";// + paramAuteur;
		 
		 /* Création du bean */
			Coyote premierBean = new Coyote();
			/* Initialisation de ses propriétés */
			premierBean.setNom( "Coyote" );
			premierBean.setPrenom( "Wile E." );
				
			/* Création de la liste et insertion de quatre éléments */

		    List<Integer> premiereListe = new ArrayList<Integer>();

		    premiereListe.add( 27 );

		    premiereListe.add( 12 );

		    premiereListe.add( 138 );

		    premiereListe.add( 6 );

		        

		    /* Stockage du message, du bean et de la liste dans l'objet request */

		    request.setAttribute( "test", message );

		    request.setAttribute( "coyote", premierBean );

		    request.setAttribute( "liste", premiereListe );
			
		 this.getServletContext().getRequestDispatcher( "/WEB-INF/test.jsp" ).forward( request, response );
		 
		 /*response.setContentType("text/html");

		    response.setCharacterEncoding( "UTF-8" );

		    PrintWriter out = response.getWriter();

		    out.println("<!DOCTYPE html>");

		    out.println("<html>");

		    out.println("<head>");

		    out.println("<meta charset=\"utf-8\" />");

		    out.println("<title>Test</title>");

		    out.println("</head>");

		    out.println("<body>");

		    out.println("<p>Ceci est une page générée depuis une servlet.</p>");

		    out.println("</body>");

		    out.println("</html>");*/
	        

	    }
	
}
