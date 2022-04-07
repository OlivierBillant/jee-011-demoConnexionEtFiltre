<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<!-- include jsp : recopie une jsp à laquelle on peut preciser des paramètres -->
<jsp:include page="./include/head.jsp">
	<jsp:param name="titre" value="Page 3" />
</jsp:include>
<body>

	<header>
		<%@ include file="./include/nav.html"%>
		<%@ include file="./include/connection-status.jsp"%>
	</header>

	<h1>Vous êtes maintenant sur la page 3</h1>

</body>
</html>