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
<link rel="stylesheet" type="text/css" href="agenda.css">
<title>Agenda</title>
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
			<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="index.html">Sair
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="lista-usuario">Contatos</a></li></li>
				<li class="nav-item"><a class="nav-link" href="adiciona-contato.jsp">Cadastre-se</a></li></li>
			</ul>
		</div>
	</nav>
	

	<br>
	<div class='container'>
		<form action="cadastro-usuario">
			<div class="form-row">
				<div class="form-group col-md-6">
					<label for="nome">Nome</label> 
					<input type="text"
						class="form-control" id="nome" name='nome' value="${param.nome}" placeholder="Nome">
						<input type="hidden"
						class="form-control"	name='idPessoa' value="${param.idPessoa}">
						<!--NO LUGAR DO VALUE ALI EM CIMA COLOCAR O NOME DO QUE ESTARÁ NO IF "cadastroUsuario-->
				</div>
				<div class="form-group col-md-6">
					<label for="password">Password</label> <input type="password"
						name='password' class="form-control" value="${param.senha}" id="password"
						placeholder="Password">
				</div>
				<div class="form-group col-md-12">
					<label for="email">Email</label> <input type="email"
						class="form-control" id="email" value="${param.email}" name='email' placeholder="Email">
				</div>
			</div>

			<div class="form-group">
				<label for="telefone">Telefone</label> <input type="text"
					class="form-control" data-mask="(99)9999-9999" value="${param.telefone}" name='telefone'
					id="telefone" placeholder="Telefone">
			</div>

			<div class="form-group">
				<label for="endereco">EndereÃ§o</label> <input type="text"
					class="form-control" name='endereco' value="${param.endereco}" id="endereco"
					placeholder="1234 Main St">
			</div>

			<button type="submit" class="btn btn-dark">Enviar</button>
			<button type="button" class="btn btn-dark">
				<a href="index.html"> Sair</a>
			</button>
			<br>
			<button id="button" type="button" class="btn btn-dark">
				<a href="lista-usuario"> Contatos</a>
			</button>
		</form>
	</div>


	<script src="js/jquery.js" type="text/javascript"></script>
	<script src="js/bootstrap.js" type="text/javascript"></script>
	<script src="js/inputMask.js"></script>
</body>
</html>