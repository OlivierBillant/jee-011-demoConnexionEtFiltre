<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<section>
	<c:choose>
	<c:when test="${utilisateurConnecte != null}">
		Vous êtes connecté avec : ${utilisateurConnecte.username}
		<!-- formulaire de déconnexion -->
		<%-- parce qu'on utilise des sous -url /admin on doit utiliser : ${pageContext.request.contextPath} : réference vers l'url de l'application : http://localhost:8080/DemoSessionFiltre --%>
		<form class="inline-form" action="${pageContext.request.contextPath}/deconnexion" method="POST">
			<button>déconnexion</button>
		</form>
	</c:when>
	<c:otherwise>
	<%-- parce qu'on utilise des sous -url /admin on doit utiliser : ${pageContext.request.contextPath} : réference vers l'url de l'application : http://localhost:8080/DemoSessionFiltre --%>
		Vous n'êtes pas connecté : <a href="${pageContext.request.contextPath}/connexion">connexion</a>
	</c:otherwise>
	</c:choose>	
</section>