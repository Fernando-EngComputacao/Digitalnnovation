<?php
	$login = $_POST['login'];
	$senha = $_POST['senha'];

	include "conexao.php";

	$sql = "select ID, CPF, PAPEL, NOME from FUNCIONARIO where LOGIN = ? and SENHA = ?";

	$stmt = mysqli_prepare($conexao, $sql);
	mysqli_stmt_bind_param($stmt, 'ss', $login, $senha);
	mysqli_stmt_execute($stmt);
	mysqli_stmt_bind_result($stmt, $ID, $CPF, $PAPEL, $NOME);
	mysqli_stmt_fetch($stmt);

	if(isset($CPF)){
		session_start();
		$_SESSION['CPF'] = $CPF;
		$_SESSION['ID'] = $ID;
		$_SESSION['PAPEL'] = $PAPEL;
		$_SESSION['NOME'] = $NOME;
		$_SESSION["sessiontime"] = time() + 140;
		header("Location: home.php" );
	}

	else{
		header("Location: login.php?tent=1");
}
mysqli_stmt_close($stmt);
?>
