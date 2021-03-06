<?php

function connect()
{
		try {
			$options=[
			    PDO::ATTR_ERRMODE => PDO::ERRMODE_EXCEPTION,
			    PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC

			];
			$pdo = new PDO("mysql:host=localhost;dbname=db_cigma","root","",$options);
			return $pdo;
		} catch (Exception $e) {
			echo "Error you can't connect db ".$e->getMessage();
		}
}

function All()
{
	try
	{
	$con = connect();
	$req = $con->prepare("select id,cin,date_naiss,nom,prenom,image from etudiant");
	$req->execute();
	$resultat = $req->fetchAll();
	return $resultat;
	}catch(Exception $e) {
			echo $e->getMessage();
		}
}

function find($id)
{
		try
		{
		$con = connect();
		$req = $con->prepare("select id,cin,date_naiss,nom,prenom,image from etudiant where cin=?");
		$req->execute([$id]);
		$resultat = $req->fetch();
		return $resultat;
		}catch(Exception $e) {
				echo $e->getMessage();
		}
}	

function Ajouter($cin,$nom,$prenom,$date_naiss,$img)
{
		try
		{
		$con = connect();
		$req = $con->prepare("insert into etudiant (cin,nom,prenom,date_naiss,image) values(?,?,?,?,?)");
		$req->execute([$cin,$nom,$prenom,$date_naiss,$img]);
	
		}catch(Exception $e) {
				echo $e->getMessage();
		}
}
//function Modifier($cin,$nom,$prenom,$date_naiss,$img)//
function Modifier($cin,$nom)
{
		try
		{
		$con = connect();
		//$req = $con->prepare("update etudiant set cin=?,date_naiss=?,image=?,nom=?,prenom=? where cin=?");
		$req = $con->prepare("update etudiant set cin=?,nom=? where cin=?");
		//$req->execute([$cin,$date_naiss,$img,$nom,$prenom,$cin]);
		$req->execute([$cin,$nom,$cin]);
		}catch(Exception $e) {
				echo $e->getMessage();
		}
}
function delete($id)
{
	try
		{
		$con = connect();
		$req = $con->prepare("delete from etudiant where cin = ?");
		$req->execute([$id]);
	
		}catch(Exception $e) {
				echo $e->getMessage();
		}
}
function uploader($file){
    $tmp = $file["tmp_name"];
    $fileName = $file["name"];
    if(!move_uploaded_file($tmp,"img/$fileName")){
        die("erreur d'upload");
    }
    return "img/$fileName";
}
/*-------- methode absence ---------*/

function All_abs()
{
	try
	{
	$con = connect();
	$req = $con->prepare("select id_abs,date_abs,heurs,etudiant_id from absence");
	$req->execute();
	$resultat = $req->fetchAll();
	return $resultat;
	}catch(Exception $e) {
			echo $e->getMessage();
		}
}

function find_abs($id)
{
		try
		{
		$con = connect();
		$req = $con->prepare("select id_abs,date_abs,heurs,etudiant_id from absence where id_abs=?");
		$req->execute([$id]);
		$resultat = $req->fetch();
		return $resultat;
		}catch(Exception $e) {
				echo $e->getMessage();
		}
}	

function Ajouter_abs($heurs,$date_abs,$etudiant_id)
{
		try
		{
		$con = connect();
		$req = $con->prepare("insert into absence (heurs,date_abs,etudiant_id) values(?,?,?)");
		$req->execute([$heurs,$date_abs,$etudiant_id]);
	
		}catch(Exception $e) {
				echo $e->getMessage();
		}
}
function Modifier_abs($id_abs,$heurs,$date_abs,$etudiant_id)
{
		try
		{
		$con = connect();
		$req = $con->prepare("update absence set heurs=?,date_abs=?,etudiant_id=? where id_abs=?");
		$req->execute([$heurs,$date_abs,$etudiant_id,$id_abs]);
	
		}catch(Exception $e) {
				echo $e->getMessage();
		}
}
function delete_abs($id)
{
	try
		{
		$con = connect();
		$req = $con->prepare("delete from absence where id_abs = ?");
		$req->execute([$id]);
	
		}catch(Exception $e) {
				echo $e->getMessage();
		}
}
function cinbyid($id)
{
		try
		{
		$con = connect();
		$req = $con->prepare("select cin,nom,prenom from etudiant where id=?");
		$req->execute([$id]);
		$resultat = $req->fetch();
		return $resultat;
		}catch(Exception $e) {
				echo $e->getMessage();
		}
}