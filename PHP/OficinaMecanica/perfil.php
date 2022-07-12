<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="utf-8">
		<link rel="stylesheet" type="text/css" href="modal.css">
		<meta name='viewport' content='width=device-width, initial-scale=1.0'>

	<style type="text/css">
		#img{
			height: auto;
			width: 20%;
			border-radius: 20%;
			float: left;
			margin-left: 26%; 
			}
		#div{
			float: right;
			margin-right: 26%;
			margin-top: 1%;
			}
		.font{
			color: green;
			font-weight: bold;
			font-size: 22px;
			}
		.fonte{
			color: orange;
			font-weight: bold;
			font-size: 22px;
			}
		

		#direita{
			text-decoration: none;
			font-size: 18px;
			color: white;
			border-style: solid;
			border-color: green;
			background-color: green;
			padding: 2%;
			}
		#direita:hover{
			border-style: solid;
			border-color: orange;
			background-color: orange;			
			}
			
		@media screen and (max-width: 1200px){
		#img{
			height: auto;
			width: 25%;
			border-radius: 20%;
			float: left;
			margin-left: 20%; 
			}
		#div{
			float: right;
			margin-right: 20%;
			margin-top: 1%;
			}	
			
			

		#direita{
			text-decoration: none;
			font-size: 25px;
			}		
			}

		@media screen and (max-width: 840px){
		#img{
			height: auto;
			width: 35%;
			border-radius: 20%;
			float: left;
			margin-left: 10%; 
			}
		#div{
			float: right;
			margin-right: 10%;
			margin-top: 1%;
			}
		
			}
			
		@media screen and (max-width: 680px){
		#img{
			height: auto;
			width: 35%;
			border-radius: 20%;
			float: left;
			margin-left: 5%; 
			}
		#div{
			float: right;
			margin-right: 5%;
			margin-top: 1%;
			}
			
			}
		@media screen and (max-width: 550px){
			#direita{
				padding: 1%;
				}
		#img{
			height: auto;
			width: 45%;
			border-radius: 20%;
			float: none;
			}
		#div{
			float: none;
			text-align: center;
			}
		.font{
			color: green;
			font-weight: bold;
			font-size: 20px;			
			}
		.fonte{
			font-size: 20px;						
			}
		
			}

		@media screen and (min-width: 1600px){
		#img{
			height: auto;
			width: 20%;
			border-radius: 20%;
			float: left;
			margin-left: 30%; 
			}
		#div{
			float: right;
			margin-right: 30%;
			margin-top: 1%;
			}						
			}
	</style>
	</head>
	<body>
		<?php
			include "session.php";
			include "conexao.php";

			$sql = "select NOME, CPF, SEXO, TELEFONE, FOTO from FUNCIONARIO where ID = ?";

			$stmt = mysqli_prepare($conexao, $sql);
			mysqli_stmt_bind_param($stmt, 'i', $_SESSION['ID']);
			mysqli_stmt_execute($stmt);
			mysqli_stmt_bind_result($stmt, $NOME, $CPF, $SEXO, $TELEFONE, $FOTO);
			mysqli_stmt_fetch($stmt);
			

			if($FOTO == "" and $SEXO == "Masculino"){
				$FOTO = "img_perfil/man.jpg";
			}
			else if($FOTO == "" and $SEXO == "Feminino"){
				$FOTO = "img_perfil/women.jpg";
			}
			
		if(isset($_GET['varda'])){
		 echo "<div id='openModal' class='modalDialog'>";
		 echo "<div id='divdiv' style='height: 40%;'>";
		 echo "<a href='#close' title='Close' class='closeModal' style='color: white;'></a>";
		 echo "<center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "<h1 id='h1'>Aviso:</h1>";
		 echo "<h2 id='h2'>Dados atualizados!</h2>";
		 echo "</center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "</div>";
		 echo "</div>";			}
		
		elseif(isset($_GET['vardna'])){
		 echo "<div id='openModal' class='modalDialog'>";
		 echo "<div id='divdiv' style='height: 40%;'>";
		 echo "<a href='#close' title='Close' class='closeModal' style='color: white;'></a>";
		 echo "<center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "<h1 id='h1'>Aviso:</h1>";
		 echo "<h2 id='h2'>Não foi possível atualizar os dados!</h2>";
		 echo "</center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "</div>";
		 echo "</div>";			}
		 
		 elseif(isset($_GET['varrf'])){
		 echo "<div id='openModal' class='modalDialog'>";
		 echo "<div id='divdiv' style='height: 40%;'>";
		 echo "<a href='#close' title='Close' class='closeModal' style='color: white;'></a>";
		 echo "<center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "<h1 id='h1'>Aviso:</h1>";
		 echo "<h2 id='h2'>A imagem de perfil foi removida!</h2>";
		 echo "</center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "</div>";
		 echo "</div>";			}
	?>
				<center><img id="img" src="<?php echo $FOTO; ?>"></center>
				<div id="div">
				<font class="fonte">Nome: </font><font class="font"><?php echo $NOME; ?></font><br><br>
				<font class="fonte">CPF: </font><font class="font"><?php echo $CPF; ?></font><br><br>
				<font class="fonte">Sexo: </font><font class="font"><?php echo $SEXO; ?></font><br><br>
				<font class="fonte">Telefone: </font><font class="font"><?php echo $TELEFONE; ?></font><br><br>
				<a id="direita" href="update.php">Alterar Dados</a>
				</div>	

	</body>
</html>
