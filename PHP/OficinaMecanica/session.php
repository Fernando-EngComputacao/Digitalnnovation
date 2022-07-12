<?php	$var = 1;
    session_start();
    if(!isset($_SESSION['CPF'])){		$var = 0;
        header("Location: inter.php?tent=4");
    }

if (isset( $_SESSION["sessiontime"] ) ) {
	if ($_SESSION["sessiontime"] < time() ) {
		$var = 0;
		session_unset();
	    session_destroy();

    header("Location: inter.php?tent=2");}

     else {
		$_SESSION["sessiontime"] = time() + 140;
	}}

if(isset($_SESSION['CPF'])){
	include "conexao.php";

	$sql = "select CPF, PAPEL from FUNCIONARIO where CPF = ?";

	$stmt = mysqli_prepare($conexao, $sql);
	mysqli_stmt_bind_param($stmt, 'i', $_SESSION['CPF']);
	mysqli_stmt_execute($stmt);
	mysqli_stmt_bind_result($stmt, $CPF, $PAPEL);
	mysqli_stmt_fetch($stmt);
	mysqli_stmt_close($stmt);

	if($CPF == " "){
		$var = 0;
		session_destroy();
		header("Location: inter.php?tent=3");}

	if($PAPEL == 1 and $_SESSION['PAPEL'] == 2){
		$var = 0;
		$_SESSION['PAPEL'] = $PAPEL;
		header("Location: inter.php?papel=1&num=3");}

	if($PAPEL == 2 and $_SESSION['PAPEL'] == 1){
		$_SESSION['PAPEL'] = $PAPEL;
		header("Location: inter.php?papel=1&num=4");}


}
?>
