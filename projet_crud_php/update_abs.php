<?php
require("module.php");
var_dump(extract($_GET)) ;
var_dump($_GET);
Modifier_abs($id_abs,$heurs,$date_abs,$id);
header("location:absences.php");
?>