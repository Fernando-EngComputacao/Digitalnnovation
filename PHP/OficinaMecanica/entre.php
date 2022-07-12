<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="utf-8">
		<title>Cadastro</title>
		<style type="text/css">
			a{
				text-decoration: none;
				font-size: 30px;
				color: green;
				padding: 2px;
				
				}
			a:hover{
				color: blue;
				border-style: solid;
				border-color: green;
				}
		</style>
	</head>
	<body>
		<center>
		<br><br>
		<?php
		include "session.php";
		if($_SESSION['PAPEL'] == 2){
		echo "<a href='cadastro_funcionario.php'>Funcionário</a><br><br>";
	}
		?>
		<a href="cadastro_cliente.php">Cliente</a><br><br>
		<a href="cadastro_pecas.php">Peças</a><br><br>
		</center>
	</body>
</html>
