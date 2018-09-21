<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>FAPI - Orientação a Objetos II - Servlets - Cadastro
	Aluno</title>
</head>
<body>
	<div id="formCadastro">
		<form action="/fapi-poo-servlets-redirect/cadastrarAluno" method="post">
			<label>Nome:</label> <input type="text" name="nome"> <label>Curso:</label><input
				type="text" name="curso"> <input type="submit"
				value="Enviar">
		</form>
	</div>
	<br />
	<div id="voltarMain">
		<a href="/fapi-poo-servlets-redirect/controller?acao=voltar_main">Voltar</a>
	</div>
</body>
</html>
