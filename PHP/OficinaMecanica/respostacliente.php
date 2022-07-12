<?php
include "session.php";
if($var != 0){
	$nome = $_POST['nome'];
	$cpf = $_POST['cpf'];
	$sexo = $_POST['sexo'];
	$data = $_POST['data'];
	$telefone = $_POST['telefone'];
	$rg = $_POST['rg'];
	$endereco = $_POST['endereco'];
	

	include "conexao.php";
	


		$sql = "insert into cliente values(null, ?, ?, ?, ?, ?, ?, ?)";
		$stmt = mysqli_prepare($conexao, $sql);
		mysqli_stmt_bind_param($stmt, 'sssssss', $cpf , $nome, $data, $telefone, $rg, $endereco, $sexo);

		if(mysqli_stmt_execute($stmt)){
			header("Location: cadastro_cliente.php?var=1&#openModal");
		}
		
		else{
			header("Location: cadastro_cliente.php?vari=1&#openModal");
			}

}
?>

