<!DOCTYPE html>
<html lang="pt-br">
  <head>
	<meta charset='utf-8'>
	<link rel="stylesheet" type="text/css" href="modal.css">
	<meta name='viewport' content='width=device-width, initial-scale=1'>

  <style type="text/css">

@media screen and (max-width: 610px){
#table{
	display: none;
	}
.divres{
	display: block !important;
	border-style: solid;
	border-color: green;
	line-height: 200%;
	font-size: 18px;
	margin-top: 4%;
}
.subtitulo{
	color: green;
	}

#excluir{
	margin-bottom: -10px;
	}
#foto{
	margin-top: -50px;
	}
a:link{
  text-decoration: none;
  color: orange;
}

a:visited{
  text-decoration: none;
  color: orange;
}
a:hover{
  text-decoration: none;
  color: blue;
}
}

h1{
  color: green;
  }

@media screen and (min-width: 611px){
	  h1{
		  color: green;
		  }

    td{
      font-size: 18px;
      text-align: center;
    }
    #table{
      border-collapse: collapse;


  }
a:link{
  text-decoration: none;
  color: green;
}

a:visited{
  text-decoration: none;
  color: green;
}
a:hover{
  text-decoration: none;
  color: orange;
}
.divres{display: none;} }
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
    <center>
	<table id="table" border=1>
	<?php
		include "session.php";
		include "conexao.php";
      

			$sql = "select NOME, ID, TELEFONE, CPF, FOTO, SEXO from funcionario where cpf != ?";

			$stmt = mysqli_prepare($conexao, $sql);
      mysqli_stmt_bind_param($stmt, 's', $_SESSION['CPF']);
			mysqli_stmt_execute($stmt);
      $aux = 0;
      $ii = 0;
      mysqli_stmt_bind_result($stmt, $NOME, $ID, $TELEFONE, $CPF, $FOTO, $SEXO);
	   
	 
	 echo "<div id='openModal2' class='modalDialog'>";
	 echo "<div id='divdiv' style='margin-top: 5%;'>";
	 echo "<a href='#close' title='Close' class='closeModal' style='color: white;'></a>";
	 echo "<center>";
	 echo "<!-- Conteúdo do Modal -->";
	 echo "<h1 id='h1' style='font-size: 25px'>Aviso:</h1>";
	 echo "<h2 id='h2'style='font-size: 20px'>Você realmente deseja excluir este usuário do sistema?</h2><br>";
	 echo "<a id='aaaa'</a>";
	 echo "<a href='#close' class='a' style='color: red; margin-left: 15%; padding: 3%;'>Não</a><br><br>";
	 echo "</center>";
	 echo "<!-- Conteúdo do Modal -->";
	 echo "</div>";
	 echo "</div>";	 

      while(mysqli_stmt_fetch($stmt)){
		if($FOTO == "" and $SEXO == "Masculino"){
				$FOTO = "img_perfil/man.jpg";
			}
			else if($FOTO == "" and $SEXO == "Feminino"){
				$FOTO = "img_perfil/women.jpg";
			}
			
		$ii += 1;
        if ($aux == 0){
            echo "<tr>";
            echo "<td><b>Nome:</b></td>";
            echo "<td><b>Telefone:</b></td>";
            echo "<td><b>CPF::</b></td>";
            echo "<td><b>Foto:</b></td>";
            echo "<td><b>Excluir Usuário:</b></td>";
            echo "</tr>";
            $aux = 1;


        }


				echo "
					<tr>
						<td>".$NOME."</td>
						<td>".$TELEFONE."</td>
						<td>".$CPF."</td>
						<td><img style='margin-top: 0px; margin-bottom: -3px;' height='80px' width='80px'src='".$FOTO."' ></td>
            <td><a onclick='idmodal2($ID)' href='#openModal2'><img src='fotos/excluir.png' height='40px' width='40px'></a></td>
					</tr>";
				echo "<div class='divres'>
				<font class='subtitulo'>Nome: </font>" . $NOME . "<br>" .
				"<font class='subtitulo'>Telefone: </font>" . $TELEFONE . "<br>" .
				"<font class='subtitulo'>CPF:: </font>" . $CPF . "<br>" .
				"<font class='subtitulo' id='foto' style='position: absolute; margin-top: 20px; margin-left: -50px;'>Foto: </font>" . "<img height='80px' width='80px'src='".$FOTO."' >" . "<br>" .
				"<font class='subtitulo'>Excluir Usuário: </font> <a onclick='idmodal2($ID)' href='#openModal2'><img id='excluir' src='fotos/excluir.png' height='40px' width='40px'></a></div>";
			}
		echo "</table>";
    if($ID == ""){
      echo "<h1>Nenhum Usuário Cadastrado!</h1>";
    }
	?>
	</table>
</center>
<script>
	function idmodal2(c){
	document.getElementById("aaaa").innerHTML = "<a href='respostausuarios.php?id=" + c + "'class='a' style='color: red; margin-right: 15%; padding: 3%;'>Sim</a>";
}
</script>

</body>
</html>
