<?php 
include("module.php");
$res = All("etudiant");
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
            
            <form action="store_abs.php" method="post" enctype="multipart/form-data">
                <div class="form-group"><label for="cin">Selectionner un étudiant</label>
                <select name="etudiant_id">
                    <?php foreach ($res as $i => $v) { ;?>

                    <option value="<?=$v['id']?>"><?=$v['cin']." ".$v['nom']." ".$v['prenom']?> </option>
                <?php };?>
                </select>
                </div>
                <div class="form-group"><label for="date_abs">Date de l'absence</label>
                <input type="date" class="form-control" name="date_abs" id="date_abs>
                </div>
                <div class="form-group"><label for="heurs">Nombre d'heures d'absence</label>
                <input type="number" class="form-control" name="heurs" id="heurs">
                </div>
                <button type="submit" class="btn btn-primary">Créer l'absence</button>
            </form>
            </div>
        </div>
    </div>
<?php include "footer.php" ;?>
</body>
</html>

