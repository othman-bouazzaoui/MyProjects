<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Les cookies</title>
</head>
<body>
<c:out value="${prenom }"></c:out>
  <form action="cookies" method="post">
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