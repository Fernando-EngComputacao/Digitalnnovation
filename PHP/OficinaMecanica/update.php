<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="utf-8">
		<title>Cadastro</title>
		<link rel="stylesheet" type="text/css" href="styleCadastro.css">
	<link rel="stylesheet" type="text/css" href="modal.css">

		<meta name='viewport' content='width=device-width, initial-scale=1.0'>
		<style type='text/css'>

			input{
				margin-bottom: 4%;
				margin-top: 1%;
			}

			}
			#right, #left{float: none;}
			#button{margin-top: 8%;
					}
			select{margin-bottom: 6%;}
			
			@media screen and (min-width: 630px){	
			input{
				margin-bottom: 12%;
				margin-top: 3%;
			}

			#left{
				float: left;
				margin-left: 10%;
				margin-top: 0;
					
					}
				#right{
					float: right;
					margin-right: 10%;
					margin-top: 0;
					
					}
			#button{margin-top: 4%;
					position: static;
				}
				#button{	
				position: fixed; 
				margin-top: 440px;
				margin-left: -2%;
			}
				
				}
			@media screen and (min-width: 900px){

			input{
				margin-bottom: 12%;
				margin-top: 3%;
			}

			#left{
				float: left;
				margin-left: 20%;
				margin-top: 0;
					
					}
				#right{
					float: right;
					margin-right: 20%;
					margin-top: 0;
					
					}
				
				}
		
		
		@media screen and (min-width: 1200px){	
			input{
				margin-bottom: 10%;
				margin-top: 0%;
			}

			#left{
				float: left;
				margin-left: 30%;
				margin-top: 0;
					
					}
				#right{
					float: right;
					margin-right: 30%;
					margin-top: 0;
					
					}
				
				}

			.select{
			   -webkit-appearance: none;  /* Remove estilo padrão do Chrome */
			   -moz-appearance: none; /* Remove estilo padrão do FireFox */
			   appearance: none; /* Remove estilo padrão do FireFox*/
			   background: url(fotos/seta.gif) no-repeat #eeeeee;  /* Imagem de fundo (Seta) */
			   background-position: 218px center;  /*Posição da imagem do background*/
			   width: 250px; /* Tamanho do select, maior que o tamanho da div "div-select" */
			   height:30px; /* Altura do select, importante para que tenha a mesma altura em todo os navegadores */
			   border:2px solid green;
			   background-color: white;
			   text-align: center;
			   text-align-last: center;
			   color: green;
			   font-weight: bold;
			   font-size: 15px;
			}
			
			option{
			   text-align: center;
			   text-align-last: center;
			   color: green;
			   font-weight: bold;
			   font-size: 15px;
			   }
		
		#botao{
			border-style: solid;
			border-color: orange;
			background-color: orange;
			color: white;
			margin-top: 8px;
			cursor: pointer;
			height: auto;
			width: auto;
			
			}


		</style>

		<SCRIPT LANGUAGE="JavaScript"> 
		<!-- Disable 
		function disableselect(e){ 
		return false 
		} 

		function reEnable(){ 
		return true 
		} 

		//if IE4+ 
		document.onselectstart=new Function ("return false") 
		document.oncontextmenu=new Function ("return false") 
		//if NS6 
		if (window.sidebar){ 
		document.onmousedown=disableselect 
		document.onclick=reEnable 
		} 
		//--> 
		</script> 
	</head>
	<body bgcolor="#fcfcff">
		<?php
		include "session.php";
		include "conexao.php";

		$sql = "select NOME, RG, CPF, SEXO, FOTO, LOGIN, SENHA, TELEFONE, DATA_NASC, ENDERECO from FUNCIONARIO where ID = ?";

		$stmt = mysqli_prepare($conexao, $sql);
		mysqli_stmt_bind_param($stmt, 'i', $_SESSION['ID']);
		mysqli_stmt_execute($stmt);
		mysqli_stmt_bind_result($stmt, $NOME, $RG, $CPF, $SEXO, $FOTO, $LOGIN, $SENHA, $TELEFONE, $DATA_NASC, $ENDERECO);
		mysqli_stmt_fetch($stmt);

		if($FOTO == "" and $SEXO == "Masculino"){
			$FOTO = "img_perfil/man.jpg";
		}
		else if($FOTO == "" and $SEXO == "Feminino"){
			$FOTO = "img_perfil/women.jpg";
		}
		
		if($SEXO == "Masculino"){
			$sexM = "selected";
			$sexF = "";
		}
		else if($SEXO == "Feminino"){
			$sexM = "";
			$sexF = "selected";
		}
		
		if(isset($_GET['varsa'])){
		 echo "<div id='openModal' class='modalDialog'>";
		 echo "<div id='divdiv' style='height: 40%;'>";
		 echo "<a href='#close' title='Close' class='closeModal' style='color: white;'></a>";
		 echo "<center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "<h1 id='h1'>Aviso:</h1>";
		 echo "<h2 id='h2'>Digite sua senha atual corretamente!</h2>";
		 echo "</center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "</div>";
		 echo "</div>";			}
		
		elseif(isset($_GET['varsn'])){
		 echo "<div id='openModal' class='modalDialog'>";
		 echo "<div id='divdiv' style='height: 40%;'>";
		 echo "<a href='#close' title='Close' class='closeModal' style='color: white;'></a>";
		 echo "<center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "<h1 id='h1'>Aviso:</h1>";
		 echo "<h2 id='h2'>Confirmação de nova senha incorreta!</h2>";
		 echo "</center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "</div>";
		 echo "</div>";			}
		 
		 elseif(isset($_GET['varfns'])){
		 echo "<div id='openModal' class='modalDialog'>";
		 echo "<div id='divdiv' style='height: 40%;'>";
		 echo "<a href='#close' title='Close' class='closeModal' style='color: white;'></a>";
		 echo "<center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "<h1 id='h1'>Aviso:</h1>";
		 echo "<h2 id='h2'>Digite sua nova senha para realizar a alteração.</h2>";
		 echo "</center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "</div>";
		 echo "</div>";			}
		 
		 elseif(isset($_GET['varfsa'])){
		 echo "<div id='openModal' class='modalDialog'>";
		 echo "<div id='divdiv' style='height: 40%;'>";
		 echo "<a href='#close' title='Close' class='closeModal' style='color: white;'></a>";
		 echo "<center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "<h1 id='h1'>Aviso:</h1>";
		 echo "<h2 id='h2'>Digite sua senha atual para realizar a alteração.</h2>";
		 echo "</center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "</div>";
		 echo "</div>";			}
		?>

	<form action="respostaperfil.php" method="POST" enctype="multipart/form-data" autocomplete="off" id="respostaperfil">
    <div id='left'>
	<center>
        <font class="fontecadastro left">Nome:</font><br>
        <input class='input left' type="text" name="nome" id="nome" value="<?php echo $NOME; ?>" required autocomplete="off"><br>
        <font class="fontecadastro left">Data de Nascimento:</font><br>  
        <input class='input left' type="date" name="data" id="data" value="<?php echo $DATA_NASC; ?>" required autocomplete="off"><br>      
        <font class="fontecadastro left">Senha Atual:</font><br>
        <input class='input left' type="password" name="senhaatual" id="senhaatual" autocomplete="off"><br>
		<font class="fontecadastro left">Nova Senha:</font><br>
        <input class='input left' type="password" name="novasenha" id="novasenha" autocomplete="off"><br>
		<font class="fontecadastro left">Confirmar Nova Senha:</font><br>
        <input class='input left' type="password" name="confirmarnovasenha" id="confirmarnovasenha" autocomplete="off"><br>


		</center>

		</div>
		<div id="right">
		<center>
		<font class="fontecadastro right">CPF:</font><br>
        <input class='input right' id="cpf" type="text" name="cpf" maxlength="14" value="<?php echo $CPF; ?>" required autocomplete="off" onkeydown="javascript: fMasc( this, mCPF );"><br>
        <font class="fontecadastro left">RG:</font><br>
        <input class='input right' type="text" name="rg" id="rg" value="<?php echo $RG; ?>" required autocomplete="off"><br>
		<font class="fontecadastro right">Telefone:</font><br>
		<input class='input left' type="text" name="telefone" id="telefone" value="<?php echo $TELEFONE; ?>" required autocomplete="off"><br>
        <font class="fontecadastro right">Sexo:</font><br>
        <select class="select" name="sexo" class="right" required>
			<option value="Masculino" <?php echo $sexM; ?>>Masculino</option>
			<option value="Feminino" <?php echo $sexF; ?>>Feminino</option>
        </select><br>
        <font class="fontecadastro left">Endereço:</font><br>
        <input class='input right' type="text" name="endereco" id="endereco" value="<?php echo $ENDERECO; ?>" required autocomplete="off"><br>
        <font class="fontecadastro right">Foto:</font><br>
        <label style="border-style: none;" for='edit_foto' style='cursor: pointer;' height="60px" width="60px"><img style="cursor: pointer; border-style: solid; border-color: green;" height="60px" width="60px" src="<?php echo $FOTO; ?>" width='80px'></label><input id='edit_foto' type='file' name='imagem' style='display: none;'><br>
	</form>
		<?php
			if ($FOTO != "img_perfil/man.jpg" and $FOTO != "img_perfil/women.jpg"){
				echo  "<form action='remover_imagem.php' method='POST' id='remover'>
				<input type='hidden' name='fotoAtual' accept='image/*' value='$FOTO'>
				<button id='botao' form='remover'>Remover Imagem</button>
				</form>";
			}
		?>
	</center>

</div>
		<center><button id='button' form="respostaperfil" class='ir'>Salvar</button></center>

<script>
	//bloqueia copiar colar
			document.getElementById('nome').onpaste = function(){
				return false;
			}
			document.getElementById('senha').onpaste = function(){
				return false;
			}
			document.getElementById('novasenha').onpaste = function(){
				return false;
			}
			
			//bloqueia arrastar e colar
			document.getElementById('nome').ondrop = function(){
				return false;
			}
			
			document.getElementById('senha').ondrop = function(){
				return false;
			}
			document.getElementById('novasenha').ondrop = function(){
				return false;
			}
</script>
	</body>
</html>
