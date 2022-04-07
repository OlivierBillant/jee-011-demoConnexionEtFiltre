package fr.eni.jee.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Filtre qui va s'executer en amont de chaque appel au servlet
 * S'applique à toutes les requêtes HTTP qui correspondent à l'url définie par @WebFilter
 */
@WebFilter("/*") // même format d'url que les servlets (ici le filtre s'applique à toutes les requêtes HTTP)
public class AuthorisationFilter extends HttpFilter implements Filter {
       
   

	/**
	 * doFilter() : contient le code qui va être executé en amont de chaque requête
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		/*
		 * Attention: pour pouvoir utiliser toutes les méthodes de HttpServletRequest/ HttpServletResponse
		 * , on doit faire un (cast) des paramètre request/response (types ServletRequest/ServletResponse)
		 */
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		
		System.out.println("url qui passe le filtre : " + httpRequest.getServletPath());
		
		
		/*** pour les pages ADMIN, à moins que l'utilisateur soit connecté, on renvoie une erreur 403 - NON authorisée ***/
		if (httpRequest.getServletPath().contains("/admin")) {
			HttpSession session = httpRequest.getSession();
			if (session == null || session.getAttribute("utilisateurConnecte") == null){
				httpResponse.sendError(HttpServletResponse.SC_FORBIDDEN);
				// on aurait aussi pu faire in httpResponse.sendredirect() sur une page d'erreur personalisée
				return; // on sort de la fonction
			}
		}
		
		/*** dans tous les autre cas, on laisser passer ***/
		
		// chain.doFilter() : je laisse passer la requête 
		chain.doFilter(request, response);
	}

}
