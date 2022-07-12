<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="utf-8">
		<title>Login</title>
		<link rel="stylesheet" type="text/css" href="styleLogin.css">
		<meta name='viewport' content='width=device-width, initial-scale=1.0'>
		<link rel="shortcut icon" href="fotos/icon.png" />
		
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
		<br>
		<img id="imglogin" src="fotos/mecanica.png">
		<center>
		<div id="divlogin">
			<form action="respostalogin.php" method="post" autocomplete="off">
				<font class="login">Login:</font><br/>
				<input required class="inputlogin" name="login" type="text" autocomplete="off"><br><br>
				<font class="login">Senha:</font><br>
				<input  required class="inputlogin" name="senha" type="password" autocomplete="off"><br><br>
				<?php
					if (isset($_GET['tent']) and $_GET['tent'] == 1){
						echo "<font id='erro'>Dados Inválidos, tente novamente!</font><br><br>";
					}
					else if(isset($_GET['tent']) and $_GET['tent'] == 2){
						echo "<font id='erro'>Sua sessão expirou, efetue o login novamente!</font><br><br>";

						}
					else if(isset($_GET['tent']) and $_GET['tent'] == 3){
						echo "<font id='erro'>Você foi excluído do sistema, relate ao administrador!</font><br><br>";

						}
					//else if(isset($_GET['tent']) and $_GET['tent'] == 4){
						//echo "<font id='erro'>Você não possui mais permissão para acessar essa página!</font><br><br>";

						//}
				 ?>
				<input id="submitlogin" value="Entrar" type="submit">
				<br><br>
			</form>
		</div>
	</center>
	</body>
</html>
