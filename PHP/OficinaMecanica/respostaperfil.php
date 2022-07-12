
<?php
	include "session.php";
	if($var != 0){
	if(!isset($_GET['var'])){
		$nome = $_POST['nome'];
		$sexo = $_POST['sexo'];
		$cpf = $_POST['cpf'];
		$data = $_POST['data'];
		$rg = $_POST['rg'];
		$telefone = $_POST['telefone'];
		$endereco = $_POST['endereco'];
		$senhaatual = $_POST['senhaatual'];
		$novasenha = $_POST['novasenha'];
		$confirmarnovasenha = $_POST['confirmarnovasenha'];


		include "conexao.php";

		$sql = "select senha, foto from funcionario where id = ?";
		$stmt = mysqli_prepare($conexao, $sql);
		mysqli_stmt_bind_param($stmt, 'i', $_SESSION['ID']);
		mysqli_stmt_execute($stmt);
		mysqli_stmt_bind_result($stmt, $senhabdd, $fotobdd);
		mysqli_stmt_fetch($stmt);

		if ($senhaatual != $senhabdd and strlen($senhaatual) > 0){
			header("Location: update.php?varsa=1&#openModal");
		}
		
		elseif ($novasenha != $confirmarnovasenha){
			header("Location: update.php?varsn=1&#openModal");
		}

		else{
			$pasta = "img_perfil/";
			
			if(pathinfo($_FILES['imagem']['name'], PATHINFO_BASENAME) != ""){
				$extensao = "." . pathinfo($_FILES['imagem']['name'], PATHINFO_EXTENSION);
				$novoNome = time() . md5(sha1(uniqid()));

				$arquivoServidor = $pasta . $novoNome . $extensao;
					
				unlink($fotobdd);
			}
			else{
				$arquivoServidor = $fotobdd;
			}
			mysqli_stmt_close($stmt);

			if ($senhaatual != "" and $novasenha == ""){
				header("Location: update.php?varfns=1&#openModal");
			}
			else if ($senhaatual == "" and $novasenha != ""){
				header("Location: update.php?varfsa=1&#openModal");
			}
			else if ($senhaatual == "" or $novasenha == ""){
				$sql = "UPDATE funcionario SET FOTO = ?, NOME = ?, SEXO = ?, CPF = ?, DATA_NASC = ?, RG = ?, TELEFONE = ?, ENDERECO = ? WHERE ID = ?";
				$stmt = mysqli_prepare($conexao, $sql);
				mysqli_stmt_bind_param($stmt, 'ssssssssi', $arquivoServidor, $nome, $sexo, $cpf,  $data, $rg, $telefone, $endereco, $_SESSION['ID']);
			}

			else{
				$sql = "UPDATE funcionario SET FOTO = ?, NOME = ?, SEXO = ?, CPF = ?, DATA_NASC = ?, RG = ?, TELEFONE = ?, ENDERECO = ?, SENHA = ? WHERE ID = ?";
				$stmt = mysqli_prepare($conexao, $sql);
				mysqli_stmt_bind_param($stmt, 'sssssssssi', $arquivoServidor, $nome, $sexo, $cpf,  $data, $rg, $telefone, $endereco, $novasenha, $_SESSION['ID']);
			}

			if(mysqli_stmt_execute($stmt)){
				mysqli_stmt_close($stmt);
				if(pathinfo($_FILES['imagem']['name'], PATHINFO_BASENAME) != ""){
					move_uploaded_file($_FILES['imagem']['tmp_name'], $arquivoServidor);
				}
				header("Location: perfil.php?varda=1&#openModal");
			}
		}
	}

	else{
		header("perfil.php?vardna=1&#openModal");

	}
}
?>
