<?php
	include "session.php";

  include "conexao.php";
  if($var != 0){
		echo $_GET['id'];
		$sql = "DELETE FROM `sgom`.`funcionario` WHERE `ID`= ?";
		$stmt = mysqli_prepare($conexao, $sql);
		mysqli_stmt_bind_param($stmt, 'i', $_GET['id']);
		
		if(mysqli_stmt_execute($stmt)){header("Location: usuarios.php");}
	  
	  
	  }
?>
