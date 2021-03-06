<jsp:include page="taglib.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insertion Des fichiers</title>
</head>
<body>
  <form action="form" method="post" enctype="multipart/form-data">
    <p>
	     <label for="des">Description de fichier : </label>
	     <input type="text" name="desc" id="desc"/>
     </p>
     <p>
	     <label for="des">Le fichier : </label>
	     <input type="file" name="fichier" id="fichier"/>
     </p>
     <input type="submit"/>
  </form>
</body>
</html>