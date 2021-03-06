<?php
require("modulee.php");
extract($_POST) ;
//Modifier($cin,$nom,$prenom,$date_naiss,uploader($_FILES["image"]));
Modifier($cin,$nom);
//header("location:index.php");
?>