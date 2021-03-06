<?php
include("module.php");
//var_dump($_GET['id_abs']);
//var_dump(find_abs($_GET['id_abs']));
if(isset($_GET['id']) && isset($_GET['id_abs']))
{
	$id = find(cinbyid($_GET['id'])['cin']);
    $cin = cinbyid($_GET['id'])['cin'];
    $nom = cinbyid($_GET['id'])['nom'];
    $prenom = cinbyid($_GET['id'])['prenom'];
    $abs = find_abs($_GET['id_abs']);
    $id_abs = $_GET['id_abs'];
}else 
{
	echo "";
}
//var_dump($id['id']);
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Edit Absence</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<?php include("nav_menu.php"); ?>
    <div class="container">
        <div class="row">
            <div class="col-md-6 mx-auto shadow">
            
            <form action="update_abs.php" method="get" enctype="multipart/form-data">
                <div style="display: none;" class="form-group"><label for="id">id</label>
                <input type="text" class="form-control" name="id" id="id" value="<?=$id['id'] ;?>">
                </div>
                <div style="display: none;" class="form-group"><label for="id_abs">id_abs</label>
                <input type="text" class="form-control" name="id_abs" id="id_abs" value="<?=$id_abs ;?>">
                </div>
                <div class="form-group"><label for="cin">CIN</label>
                <input type="text" class="form-control" name="cin" id="cin" value="<?=$cin ;?>">
                </div>
                <div class="form-group"><label for="nom">Nom</label>
                <input type="text" class="form-control" name="nom" id="nom" value="<?=$nom;?>">
                </div>
                <div class="form-group"><label for="prenom">Prenom</label>
                <input type="text" class="form-control" name="prenom" id="prenom" value="<?=$prenom;?>">
                </div> 
                <div class="form-group"><label for="date_abs">Date de l'absence</label>
                <input type="date" class="form-control" name="date_abs" id="date_abs" value="<?=$abs['date_abs'] ?>">
                </div>
                <div class="form-group"><label for="heurs">Nombre d'heures d'absence</label>
                <input type="number" class="form-control" name="heurs" id="heurs" value="<?=$abs['heurs'] ?>">
                </div>
                <button type="submit" class="btn btn-primary">Modifier</button>
            </form>
            </div>
        </div>
    </div>
<?php include "footer.php" ;?>
</body>
</html>

