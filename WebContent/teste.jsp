<%@ page language="java" contentType="text/html; charset=UTF-8" 
	pageEncoding="UTF-8"%>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<title>Agenda</title>
<link rel="stylesheet" type="text/css" href="agenda.css">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="index.html">Sair
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="teste.jsp">Contatos</a></li></li>
				<li class="nav-item"><a class="nav-link" href="adiciona-contato.html">Cadastre-se</a></li></li>
			</ul>
		</div>
	</nav>

	<h1>Contatos</h1>
	<br>

	<table class="table">
	<tr>
		<th>Nome</th>
		<th>Senha</th>
		<th>E-mail</th>
		<th>Telefone</th>
		<th>Endereço</th>
	</tr>

	<c:forEach var="pessoa" items="${contatos}">
		<tr>
			<td>${pessoa.nome}</td>
			<td>${pessoa.senha}</td>
			<td>${pessoa.email}</td>
			<td>${pessoa.telefone}</td>
			<td>${pessoa.endereco}</td>
		</tr>
	</c:forEach>
</table>

	<button id="button" type="button" class="btn btn-dark">
		<a href="adiciona-contato.html">Voltar</a>
	</button>
</body>
</html>