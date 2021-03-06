<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sessions</title>
</head>
<body>
<c:if test="${ !empty sessionScope.nom && !empty sessionScope.prenom }">
   <p> Vous êtes ${sessionScope.nom } ${sessionScope.prenom } /:</p>
</c:if>
  <form action="sessions" method="post">
  <p>
    <label for="nom">Nom : </label>
    <input id="nom" name="nom" type="text"/>
  </p>
  <p>
    <label for="prenom">Prenom : </label>
    <input id="prenom" name="prenom" type="text" />
  </p>
    <input type="submit"/>
  </form>
</body>
</html>