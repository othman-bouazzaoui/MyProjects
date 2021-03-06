<?php
$myObj = (object) null;;
$myObj->name = "John";
$myObj->age = 30;
$myObj->city = "New York";

$myJSON = json_encode($myObj);

//echo $myJSON;

include("module.php");
$id = $_GET['id'];
$res = find($id);

echo json_encode($res)
?>
