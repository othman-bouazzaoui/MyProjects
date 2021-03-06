<?php
require("module.php");
extract($_POST) ;
Modifier($cin,$nom,$prenom,$date_naiss,uploader($_FILES["image"]));
header("location:index.php");
?>