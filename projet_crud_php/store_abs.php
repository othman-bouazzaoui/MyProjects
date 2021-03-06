<?php
require("module.php");
extract($_POST);
Ajouter_abs($heurs,$date_abs,$etudiant_id);
//header("location:absences.php");
?>