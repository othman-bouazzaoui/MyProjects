<?php
include("module.php");
$id=$_GET['id_abs']; //
var_dump($id);
delete_abs($id);
header("location:absences.php");
?>