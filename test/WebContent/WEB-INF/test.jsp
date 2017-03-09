<%@ page pageEncoding="UTF-8" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html>

<html>

    <head>

        <meta charset="utf-8" />

        <title>Test</title>

    </head>


    <body>

        <p>Ceci est une page générée depuis une JSP.</p>

		<p>
			
			//String attribut = (String) request.getAttribute("test");
            //out.println( attribut );
            
           // String parametre = request.getParameter( "auteur" );
            //out.println( parametre );
			${test}
			${param.auteur}
			
		</p>
		<p>
			 Récupération du bean :

            ${coyote.prenom}

            ${coyote.nom}
           <!--  Récupération du bean :
              
        		beans.Coyote notreBean = (beans.Coyote) request.getAttribute("coyote");
		        out.println( notreBean.getPrenom() );
	            out.println( notreBean.getNom() );
            %> -->

        </p>
        <p>

            Récupération de la liste :

            <%

            List<Integer> liste = (List<Integer>) request.getAttribute( "liste" );

            for( Integer i : liste ){

                out.println(i + " : "); 

            }

            %>

        </p>
        
    </body>

</html>