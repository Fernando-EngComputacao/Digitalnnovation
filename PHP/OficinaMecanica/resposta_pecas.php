<?php
include "session.php";
if($var != 0){
	$nome = $_POST['nome'];
	$descricao = $_POST['descricao'];
	$quantidade = $_POST['quantidade'];

	

	include "conexao.php";
	


		$sql = "insert into peca values(null, ?, ?, ?)";
		$stmt = mysqli_prepare($conexao, $sql);
		mysqli_stmt_bind_param($stmt, 'ssi', $nome , $descricao, $quantidade);

		if(mysqli_stmt_execute($stmt)){
			header("Location: cadastro_pecas.php?var=1&#openModal");
		}
		
		else{
			header("Location: cadastro_pecas.php?vari=1&#openModal");
			}

}
?>


