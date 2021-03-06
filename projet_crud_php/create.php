<?php
//require("modules.php");
//$categories=all("categorie");
?>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Nouveau produit</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
<?php include("nav_menu.php"); ?>
    <div class="container">
        <div class="row">
            <div class="col-md-6 mx-auto shadow">
            
            <form action="store.php" method="post" enctype="multipart/form-data">
                <div class="form-group"><label for="cin">CIN</label>
                <input type="text" class="form-control" name="cin" id="cin" >
                </div>
                <div class="form-group"><label for="nom">Nom</label>
                <input type="text" class="form-control" name="nom" id="nom" >
                </div>
                <div class="form-group"><label for="prenom">Prenom</label>
                <input type="text" class="form-control" name="prenom" id="prenom" >
                </div> 
                <div class="form-group"><label for="date_naiss">Date de Naissance</label>
                <input type="date" class="form-control" name="date_naiss" id="date_naiss" >
                </div>
        <div class="form-group"><label for="image">Image</label>
                <input type="file" class="form-control" name="image" id="image" >
                </div>
                <button type="submit" class="btn btn-primary">valider</button>
            </form>
            </div>
        </div>
    </div>
<?php include "footer.php" ;?>
</body>
</html>

