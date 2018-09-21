<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta charset="UTF-8">
<title>FAPI - Orientação a Objetos II - Servlets - Listagem
	Alunos</title>
</head>
<body>
	Alunos cadastrados:
	<br />
	<ul>
		<c:forEach var="aluno" items="${alunos}">
			<li>Nome: ${aluno.nome} - (${aluno.matricula})</li>
		</c:forEach>
	</ul>

	<br />
	<div id="voltarMain">
		<a href="/fapi-poo-servlets-redirect/controller?acao=voltar_main">Voltar</a>
	</div>
</body>
</html>
