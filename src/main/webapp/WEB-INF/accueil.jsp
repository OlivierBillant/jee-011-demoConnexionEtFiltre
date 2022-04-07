<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<!-- include jsp : recopie une jsp à laquelle on peut preciser des paramètres -->
<jsp:include page="./include/head.jsp">
	<jsp:param name="titre" value="Accueil" />
</jsp:include>
<body>

	<header>
	<!-- include "standard" : recopie du code html "statique" -->
		<%@ include file="./include/nav.html"%>
		<%@ include file="./include/connection-status.jsp"%>
	</header>

	<h1>Bienvenue sur la page d'accueil</h1>

</body>
</html>