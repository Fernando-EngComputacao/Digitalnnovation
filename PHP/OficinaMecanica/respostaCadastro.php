<?php
include "session.php";
if($var != 0){
	$nome = $_POST['nome'];
	$cpf = $_POST['cpf'];
	$sexo = $_POST['sexo'];
	$login = $_POST['login'];
	$senha = $_POST['senha'];
	$confirmsenha = $_POST['confirmsenha'];
	$data = $_POST['data'];
	$telefone = $_POST['telefone'];
	$rg = $_POST['rg'];
	$endereco = $_POST['endereco'];
	

	include "conexao.php";
	
	if ($senha == $confirmsenha){
		$arquivoServidor = "";
		$papel = 1;

		$sql = "insert into funcionario values(null, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		$stmt = mysqli_prepare($conexao, $sql);
		mysqli_stmt_bind_param($stmt, 'ssssssissss', $cpf , $nome, $data, $telefone, $rg, $endereco, $papel, $login, $senha,  $arquivoServidor, $sexo);

		if(mysqli_stmt_execute($stmt)){
			header("Location: cadastro_funcionario.php?var=1&#openModal");
		}
		
		else{
			header("Location: cadastro_funcionario.php?vari=1&#openModal");
			}
	}
	else{
		header("Location: cadastro_funcionario.php?nome=$nome&rg=$rg&endereco=$endereco&cpf=$cpf&data=$data&telefone=$telefone&sexo=$sexo&login=$login&sexo=$sexo&vars=1&#openModal");
	}
}
?>
