<?php 
include("module.php");
$res = All("etudiant");
?>
<!DOCTYPE html>
<html>
<head>
	<title>Gestion des Absences de étudiants</title>
</head>
<body>

<?php include "nav_menu.php"; ?>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Cin</th>
      <th scope="col">Nom</th>
      <th scope="col">Prenom</th>
      <th scope="col">Date de Naissance</th>
      <th scope="col">Image</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
  <?php foreach ($res as $k => $v) { ?>
  
    <tr>
      <td><?=$v['cin'] ?></td>
      <td><?=$v['nom'] ?></td>
      <td><?=$v['prenom'] ?></td>
      <td><?=$v['date_naiss'] ?></td>
      <td><img src="http://localhost/mini_projet/<?=$v['image'];?>" style="width: 60px;height: 50px;"/></td>
 	<td>
     <div class="btn-group">
      <a href="show.php?id=<?=$v['cin']?>" class="btn btn-info btn-sm">Consulter</a>
      <a href="edit.php?id=<?=$v['cin']?>" class="btn btn-warning btn-sm">Modifier</a>
      <a href="delete.php?id=<?=$v['cin']?>" class="btn btn-danger btn-sm"  onclick="return confirm('Supprimer ?')">Supprimer</a>
     
     </div>
      </td>
    </tr>
<?php } ?>
  </tbody>
</table>
<?php include "footer.php" ;?>
</body>
</html>