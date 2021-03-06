<?php
include("module.php");
if(isset($_GET['id']))
{
	$result = find($_GET['id']);
	$cin = $result['cin'];
}else 
	$cin = "n'est défini !";

//var_dump(uploader($_FILES["image"]));
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Nouveau Etudiant</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<?php include("nav_menu.php"); ?>
    <div class="container">
        <div class="row">
            <div class="col-md-6 mx-auto shadow">
            
            <form action="update.php" method="post" enctype="multipart/form-data">
                <div class="form-group"><label for="cin">CIN</label>
                <input type="text" class="form-control" name="cin" id="cin" value="<?=$cin ;?>">
                </div>
                <div class="form-group"><label for="nom">Nom</label>
                <input type="text" class="form-control" name="nom" id="nom" value="<?=$result['nom'];?>">
                </div>
                <div class="form-group"><label for="prenom">Prenom</label>
                <input type="text" class="form-control" name="prenom" id="prenom" value="<?=$result['prenom'];?>">
                </div> 
                <div class="form-group"><label for="date_naiss">Date de Naissance</label>
                <input type="date" class="form-control" name="date_naiss" id="date_naiss" value="<?=$result['date_naiss'];?>">
                </div>
        <div class="form-group"><label for="image">Image</label>
                <input type="file" class="form-control" name="image" id="image" >
                </div>
                <button type="submit" class="btn btn-primary">Modifier</button>
            </form>
            </div>
        </div>
    </div>
<?php include "footer.php" ;?>
</body>
</html>

