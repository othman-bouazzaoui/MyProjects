<?php
include("module.php");
$id=$_GET['id']; //
var_dump($id);
delete($id);
//header("location:index.php?n=del");
header("location:index.php");
?>