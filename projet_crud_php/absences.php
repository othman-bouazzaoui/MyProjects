<?php 
include("module.php");
$res = All_abs();
//var_dump($res);
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
      <th scope="col">Date de L'absence</th>
      <th scope="col">Nombre des heures d'abs</th>
      <th scope="col">Actions</th>
    </tr>
  </thead>
  <tbody>
  <?php foreach ($res as $k => $v) { ?>
  
    <tr>
      <td><?=cinbyid($v['etudiant_id'])['cin'] ?></td>
      <td><?=cinbyid($v['etudiant_id'])['nom'] ?></td>
      <td><?=cinbyid($v['etudiant_id'])['prenom'] ?></td>
      <td><?=$v['date_abs'] ?></td>
      <td><?=$v['heurs'];?></td>
 	<td>
     <div class="btn-group">
      <a href="edit_abs.php?id=<?=$v['etudiant_id']?>&id_abs=<?=$v['id_abs'];?>" class="btn btn-warning btn-sm">Modifier L'abs</a>
      <a href="delete_abs.php?id_abs=<?=$v['id_abs']?>" class="btn btn-danger btn-sm"  onclick="return confirm('Supprimer ?')">Supprimer L'abs</a>
     
     </div>
      </td>
    </tr>
<?php } ?>
  </tbody>
</table>
<?php include "footer.php" ;?>
</body>
</html>