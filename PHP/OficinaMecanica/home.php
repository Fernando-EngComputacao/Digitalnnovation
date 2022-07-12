<!DOCTYPE html>
<html lang="pt-br">
  <head>
	<meta charset='utf-8'>
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<title>SGOM</title>
	<link rel='stylesheet' href='style.css'>
	<link rel="stylesheet" type="text/css" href="modal.css">
	<link rel="shortcut icon" href="fotos/icon.png" />

	<style>
	li{margin-bottom: 2%;}
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
	if(isset($_GET['num']) and $_GET['num'] == 3){
     echo "<div id='openModal' class='modalDialog'>";
     echo "<div id='divdiv' style='height: 40%;'>";
     echo "<a href='#close' title='Close' class='closeModal'></a>";
     echo "<center>";
     echo "<!-- Conteúdo do Modal -->";
     echo "<h1 id='h1'>Aviso:</h1><br>";
     echo "<h2 id='h2'>Você não é mais um administrador!</h2>";
     echo "</center>";
     echo "<!-- Conteúdo do Modal -->";
     echo "</div>";
     echo "</div>";
 
	}
    
    else if(isset($_GET['num']) and $_GET['num'] == 4){
     echo "<div id='openModal' class='modalDialog'>";
     echo "<div id='divdiv' style='height: 40%;'>";
     echo "<a href='#close' title='Close' class='closeModal'></a>";
     echo "<center>";
     echo "<!-- Conteúdo do Modal -->";
     echo "<h1 id='h1'>Aviso:</h1><br>";
     echo "<h2 id='h2'>Você agora é um administrador!</h2>";
     echo "</center>";
     echo "<!-- Conteúdo do Modal -->";
     echo "</div>";
     echo "</div>";
 
		}
    ?>
		<header class='cabecalho'>
		<a href='inicio.php' target="iframe"> <img class='logo' src="fotos/imagem.png"> </a>
		<button class='btn-menu'><img height="40px" width="30px" src="fotos/menu.png" class="fa fa-bars fa-lg" aria-hidden="true"></i></button>
		<nav class='menu'>
			<a class='btn-close'><img height="50px" width="50px" src="fotos/x.png" class='fa fa-times'></img></a>
			<ul>
				<li><a target="iframe" href="perfil.php">Meu Perfil</a></li>
				<li><a target='iframe' href='entre.php'>Cadastro</a></li>
        <?php
          if ($_SESSION["PAPEL"] == 2){
            echo "<li><a target='iframe' href='usuarios.php'>Usuários</a></li>";
          }
         ?>
				<li><a href="sair.php">Sair</a></li>
			</ul>
		</nav>
	</header>
	  <div id="divisao">
	<center><iframe id="iframe" src='inicio.php' name="iframe"></iframe></center>
	</div>
	<!-- JQUERY-->
	<script src="java.min.js"></script>
	<script>
		$(".btn-menu").click(function(){
			$(".menu").show();
		});
		$(".btn-close").click(function(){
			$(".menu").hide();
		});
		
	</script>

	  </body>

</html>
