<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta name='viewport' content='width=device-width, initial-scale=1'>
		<script type="text/javascript">
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
		function relogio(){
			var data = new Date();
			var hora = data.getHours();
			var minuto = data.getMinutes();
			var segundo = data.getSeconds();
			
			
			if (hora < 10){
				hora = "0"+hora;
				}
			if(minuto < 10){
				minuto = "0"+minuto;
				}
			
			if (segundo < 10){
				segundo = "0"+segundo;
				}

			
			var horas = hora+":"+minuto+":"+segundo;
			var aux = data.getDate() + "/" + "0"+data.getMonth() + "/" + data.getFullYear();
			
			document.getElementById("rel").value=horas;
			document.getElementById("rel1").value=aux;			
			}

			var tempo = setInterval(relogio, 1000);
		</script>
		<style type="text/css">
			.style{
				height: auto;
				width: 90%;
				margin-left: 5%;
				margin-right: 5%;
				}
				
			input{
				background-color: #fcfcff;
				border-style: none;
				}
			font, input{
				font-size: 18px;
				color: green;
				font-weight: bold;
				}
				
			#videoC{
				height: 50% ;
				width: 95%;
				margin-left: 2.5%;
				margin-right: 2.5%;
				display: block;
				border: 3px solid green;
				}

		@media screen and (min-width: 650px){
			#videoC{
				height: 50% ;
				width: 70%;
				margin-left: 15%;
				margin-right: 15%;
				display: block;
				border: 3px solid green;
				}
			.style{
				height: auto;
				width: 50%;
				margin-left: 25%;
				margin-right: 25%;
				}
				
			input{
				background-color: #fcfcff;
				border-style: none;
				}
			font, input{
				font-size: 25px;
				color: green;
				font-weight: bold;
				}
	
			}
		@media screen and (min-width: 900px){
			#videoC{
				height: 50% ;
				width: 45%;
				margin-left: 27.5%;
				margin-right: 27.5%;
				display: block;
				border: 3px solid green;
				}
			.style{
				height: auto;
				width: 50%;
				margin-left: 25%;
				margin-right: 25%;
				}
				
			input{
				background-color: #fcfcff;
				border-style: none;
				}
			font, input{
				font-size: 25px;
				color: green;
				font-weight: bold;
				}
	
			}
				
		</style>

	</head>
	<body bgcolor="#fcfcff" ondragstart="return false">
	<?php
		include "session.php";
	?>
	


<img id="videoC" name="videoC" hspace="0" vspace="0" src="http://192.168.0.123:99/videostream.cgi?user=admin&amp;pwd=">


	<br>
	<center>
	<font>Data:</font>
	<input type="submit" id="rel1" value="">
	<font>|&nbsp</font>
	<font>Hora:</font>
	<input type="submit" id="rel" value="">
	</center>
	</body>
</html>
