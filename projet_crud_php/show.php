<?php 
include("module.php");
$id = $_GET['id'];
$res = find($id);
//var_dump($res);
?>
<!DOCTYPE html>
<html>
<head>
	<title>Gestion des Absences des étudiants</title>
</head>
<body>
<?php include "nav_menu.php"; ?>
<table class="table">
  <thead>
    <tr>
      <th scope="col">#</th>
      <th scope="col">Cin</th>
      <th scope="col">Nom</th>
      <th scope="col">Prenom</th>
      <th scope="col">Date de Naissance</th>
      <th scope="col">Image</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <th scope="row"></th>
      <td><?=$res['cin'] ?></td>
      <td><?=$res['nom'] ?></td>
      <td><?=$res['prenom'] ?></td>
      <td><?=$res['date_naiss'] ?></td>
      <td><img src="<?=$res['image'] ?>" style="width: 60px;height: 50px;"/></td>
 	<td>
     <div class="btn-group">
      <a href="edit.php?id=<?=$res['cin']?>" class="btn btn-warning btn-sm">Modifier</a>
      <a href="delete.php?id=<?=$res['cin']?>" class="btn btn-danger btn-sm"  onclick="return confirm('Supprimer ?')">Supprimer</a>
     
     </div>
      </td>
    </tr>
  </tbody>
</table>
<?php include "footer.php" ;?>
</body>
</html>