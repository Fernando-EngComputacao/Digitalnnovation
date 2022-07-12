<?php	
	include "session.php";

	include "conexao.php";
	
	$fotoAtual = $_POST['fotoAtual'];
	
	$foto = "";
	
	$sql = "UPDATE funcionario SET FOTO = ? WHERE ID = ?";
		$stmt = mysqli_prepare($conexao, $sql);
		mysqli_stmt_bind_param($stmt, 'si', $foto, $_SESSION['ID']);
		if(mysqli_stmt_execute($stmt)){
			mysqli_stmt_close($stmt);
			unlink($fotoAtual);
			header("Location: perfil.php?varrf=1&#openModal");
		}
?>
