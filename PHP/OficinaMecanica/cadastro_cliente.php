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
				margin-top: 300px;
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
		
		$nome = "";
		$cpf = "";
		$login = "";
		$sexo = "";
		$funcao = "";
		$sexM = "";
		$sexF = "";
		$func1 = "";
		$func2 = "";
		$data = "";
		$telefone = "";
		$rg = "";
		$endereco = "";
		
		if(isset($_GET['var'])){
		 echo "<div id='openModal' class='modalDialog'>";
		 echo "<div id='divdiv' style='height: 40%;'>";
		 echo "<a href='#close' title='Close' class='closeModal' style='color: white;'></a>";
		 echo "<center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "<h1 id='h1'>Aviso:</h1>";
		 echo "<h2 id='h2'>Cadastro efetuado com sucesso!</h2>";
		 echo "</center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "</div>";
		 echo "</div>";			}
		
		elseif(isset($_GET['vari'])){
		 echo "<div id='openModal' class='modalDialog'>";
		 echo "<div id='divdiv' style='height: 40%;'>";
		 echo "<a href='#close' title='Close' class='closeModal' style='color: white;'></a>";
		 echo "<center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "<h1 id='h1'>Aviso:</h1>";
		 echo "<h2 id='h2'>Cadastro não realizado!</h2>";
		 echo "</center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "</div>";
		 echo "</div>";			}
		 
		 elseif(isset($_GET['vars'])){
			$nome = $_GET['nome'];
			$sexo = $_GET['sexo'];
			$login = $_GET['login'];
			$sexo = $_GET['sexo'];
			$data = $_GET['data'];
			$telefone = $_GET['telefone'];
			$rg = $_GET['rg'];
			$cpf = $_GET['cpf'];
			$endereco = $_GET['endereco'];
			
			if ($sexo == "Masculino"){
				$sexM = "selected";
				$sexF = "";
			}
			else{
				$sexM = "";
				$sexF = "selected";
			}
			
			if ($funcao == "1"){
				$func1 = "selected";
				$func2 = "";
			}
			else{
				$func1 = "";
				$func2 = "selected";
			}
			
		 echo "<div id='openModal' class='modalDialog'>";
		 echo "<div id='divdiv' style='height: 40%;'>";
		 echo "<a href='#close' title='Close' class='closeModal'></a>";
		 echo "<center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "<h1 id='h1'>Aviso:</h1>";
		 echo "<h2 id='h2'>As senhas precisam ser iguais!</h2>";
		 echo "</center>";
		 echo "<!-- Conteúdo do Modal -->";
		 echo "</div>";
		 echo "</div>";			}
	?>
	<form action="respostacliente.php" method="POST" enctype="multipart/form-data" autocomplete="off">
    <div id='left'>
	<center>
        <font class="fontecadastro left">Nome:</font><br>
        <input class='input left' type="text" name="nome" id="nome" value="<?php echo $nome; ?>" required autocomplete="off"><br>
        <font class="fontecadastro left">Data de Nascimento:</font><br>  
        <input class='input left' type="date" name="data" id="data" value="<?php echo $data; ?>" required autocomplete="off"><br>      

		<font class="fontecadastro right">Telefone:</font><br>
		<input class='input left' type="text" name="telefone" id="telefone" value="<?php echo $telefone; ?>" required autocomplete="off"><br>
        <font class="fontecadastro left">Endereço:</font><br>
        <input class='input right' type="text" name="endereco" id="endereco" value="<?php echo $endereco; ?>" required autocomplete="off"><br>
		</center>

		</div>
		<div id="right">
		<center>
		<font class="fontecadastro right">CPF:</font><br>
        <input class='input right' id="cpf" type="text" name="cpf" maxlength="14" value="<?php echo $cpf; ?>" required autocomplete="off" onkeydown="javascript: fMasc( this, mCPF );"><br>
        <font class="fontecadastro left">RG:</font><br>
        <input class='input right' type="text" name="rg" id="rg" value="<?php echo $rg; ?>" required autocomplete="off"><br>

        <font class="fontecadastro right">Sexo:</font><br>
        <select class="select" name="sexo" class="right" required>
			<option value="Masculino" <?php echo $sexM; ?>>Masculino</option>
			<option value="Feminino" <?php echo $sexF; ?>>Feminino</option>
        </select><br>

	</center>

</div>
		<center><button id='button' class='ir'>Cadastrar</button></center>

</form>


<script>
	//bloqueia copiar colar
			document.getElementById('nome').onpaste = function(){
				return false;
			}
			document.getElementById('login').onpaste = function(){
				return false;
			}
			document.getElementById('senha').onpaste = function(){
				return false;
			}
			document.getElementById('confirmsenha').onpaste = function(){
				return false;
			}
			document.getElementById('email').onpaste = function(){
				return false;
			}
			
			//bloqueia arrastar e colar
			document.getElementById('nome').ondrop = function(){
				return false;
			}
			document.getElementById('login').ondrop = function(){
				return false;
			}
			document.getElementById('senha').ondrop = function(){
				return false;
			}
			document.getElementById('confirmsenha').ondrop = function(){
				return false;
			}
			document.getElementById('email').ondrop = function(){
				return false;
			}
</script>
		<script type="text/javascript">
			function fMasc(objeto,mascara) {
				obj=objeto
				masc=mascara
				setTimeout("fMascEx()",1)
			}
			function fMascEx() {
				obj.value=masc(obj.value)
			}
			function mTel(tel) {
				tel=tel.replace(/\D/g,"")
				tel=tel.replace(/^(\d)/,"($1")
				tel=tel.replace(/(.{3})(\d)/,"$1)$2")
				if(tel.length == 9) {
					tel=tel.replace(/(.{1})$/,"-$1")
				} else if (tel.length == 10) {
					tel=tel.replace(/(.{2})$/,"-$1")
				} else if (tel.length == 11) {
					tel=tel.replace(/(.{3})$/,"-$1")
				} else if (tel.length == 12) {
					tel=tel.replace(/(.{4})$/,"-$1")
				} else if (tel.length > 12) {
					tel=tel.replace(/(.{4})$/,"-$1")
				}
				return tel;
			}
			function mCNPJ(cnpj){
				cnpj=cnpj.replace(/\D/g,"")
				cnpj=cnpj.replace(/^(\d{2})(\d)/,"$1.$2")
				cnpj=cnpj.replace(/^(\d{2})\.(\d{3})(\d)/,"$1.$2.$3")
				cnpj=cnpj.replace(/\.(\d{3})(\d)/,".$1/$2")
				cnpj=cnpj.replace(/(\d{4})(\d)/,"$1-$2")
				return cnpj
			}
			function mCPF(cpf){
				cpf=cpf.replace(/\D/g,"")
				cpf=cpf.replace(/(\d{3})(\d)/,"$1.$2")
				cpf=cpf.replace(/(\d{3})(\d)/,"$1.$2")
				cpf=cpf.replace(/(\d{3})(\d{1,2})$/,"$1-$2")
				return cpf
			}
			function mCEP(cep){
				cep=cep.replace(/\D/g,"")
				cep=cep.replace(/^(\d{2})(\d)/,"$1.$2")
				cep=cep.replace(/\.(\d{3})(\d)/,".$1-$2")
				return cep
			}
			function mNum(num){
				num=num.replace(/\D/g,"")
				return num
			}
		</script>
	</body>
</html>
