<!DOCTYPE html>
<html lang="pt-br">
  <head>
	<meta http-equiv="refresh" content="3000">
	<meta charset='utf-8'>
	<meta name='viewport' content='width=device-width, initial-scale=1'>
	<script src="bibliotecas/jquery/external/jquery/jquery.js" type="text/javascript"></script>
	
	<title>Automação</title>

	<style type="text/css">

    .interruptor{
      height: 60px;
      width: 60px;
      margin-left: 1% !important;
      margin-bottom: -1%; !important;
    }
    font{
		font-weight: bold;
		font-size: 30px;
		color: orange;
		}

		a{
			text-decoration: none;


			}
		div{
			height: 100% !important;
			width: 100% !important;
			}

@media screen and (max-width: 500px){
	font{font-size: 25px;}
    .interruptor{
      height: 60px;
      width: 60px;
      margin-left: 1% !important;
      margin-bottom: -4%; !important;
    }
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

	function UrlImage(){
				$.ajax({
					url: "urlImage.php",
					dataType: "html",
					success: function(retorno){
            aux = 0;
            retorno1 = "";
            retorno2 = "";
            retorno3 = "";

            for(x=0; x < (retorno).length; x++){
              //document.write(x+" "+retorno[x]+" "+aux+"<br>");
              if(aux == 0){
                if(retorno[x] != ","){
                  retorno1 += retorno[x];
                }
                else{
                  aux = 1;
                }
              }

              else if(aux == 1){
                if(retorno[x] != ","){
                  retorno2 += retorno[x];
                }
                else{
                  aux = 2;
                }
              }

              else if(aux == 2){
                if(retorno[x] != "," && aux == 2){
                  retorno3 += retorno[x];
                }
              }
            }
            //document.write(retorno1+" 1<br>");
            //document.write(retorno2+" 2<br>");
            //document.write(retorno3+" 3");
            document.getElementById("lamp1").src = retorno1;
            document.getElementById("lamp2").src = retorno2;
            document.getElementById("lamp3").src = retorno3;
					}
				});
        setTimeout("UrlImage()",0100);
			}

		function UpdateImage1(id){
			var update1 = id.src;

			$.ajax({
				url: "updateImage1.php",
				type: "post",
				data: {"update": update1},
				dataType: "html",
			});
		}

      function UpdateImage2(id){
        var update2 = id.src;

        $.ajax({
          url: "updateImage2.php",
          type: "post",
          data: {"update": update2},
          dataType: "html",
        });
      }

      function UpdateImage3(id){
        var update3 = id.src;

        $.ajax({
          url: "updateImage3.php",
          type: "post",
          data: {"update": update3},
          dataType: "html",
        });
      }
      
	</script>
  </head>
  <body bgcolor="#fcfcff" onload="UrlImage(), verifica();">
	  <br>
	<center>
    <div>
		<?php include "session.php"?>
		<font>Lâmpadas 1:</font>
		<img id="lamp1" class="interruptor" onClick="UpdateImage1(this);" src='' style='cursor: pointer;'>
    </div><br><br>

	<div>
		<font>Lâmpadas 2:</font>
		<img id="lamp2" class="interruptor" onClick="UpdateImage2(this);" src='' style='cursor: pointer;'>
    </div><br><br>

	<div>
		<font>Lâmpadas 3:</font>
		<img id="lamp3" class="interruptor" onClick="UpdateImage3(this);" src='' style='cursor: pointer;'>
    </div><br><br>


    </center>
  </body>
</html>
