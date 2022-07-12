<?php    
    if(isset($_GET['tent']) and $_GET['tent'] == 2){
    echo("<script language=\"javascript\">");
    echo("top.location.href = \"login.php?tent=2\";");
    echo("</script>");
     }
    
    else if(isset($_GET['tent']) and $_GET['tent'] == 3){
    echo("<script language=\"javascript\">");
    echo("top.location.href = \"login.php?tent=3\";");
    echo("</script>"); }  
   
    else if(isset($_GET['tent']) and $_GET['tent'] == 4){
    echo("<script language=\"javascript\">");
    echo("top.location.href = \"login.php?tent=4\";");
    echo("</script>"); } 
    
    else if(isset($_GET['papel']) and $_GET['papel'] == 1){
	if(isset($_GET['num']) and $_GET['num'] == 3){
	echo("<script language=\"javascript\">");
    echo("top.location.href = \"home.php?num=3&#openModal\";");
    echo("</script>"); } 
    
    else if(isset($_GET['num']) and $_GET['num'] == 4){
	echo("<script language=\"javascript\">");
    echo("top.location.href = \"home.php?num=4&#openModal\";");
    echo("</script>"); } }
?>
