<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>

<html lang="pt-br">

<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<link rel="stylesheet" href="resources/css/stylesheet.css">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">

<title>Registre-se</title>

</head>

<body class="bg-image"
	style="background-image: url(resources/img/background.jpg);">
	<div class="container-fluid">
	
		<header class="row">
			<div class="col-2">
				<a href="login-usuario.jsp"> <i class="bi bi-arrow-left-circle-fill"
					id="bt-voltar"></i>
				</a>
			</div>
			<div class="col-8 offset-col-2">
				<img class="rounded mx-auto d-block w-25"
					src="resources/img/Logo Foto.svg" alt="Logo">
				<p>Informe seus dados para realizar o cadastro</p>
			</div>
		</header>
		
		<form action="usuario" method="post">
		
			<div class="rounded mx-auto d-block w-50 py-2 px-4">
				<div class="input-group">
					<span class="input-group-text opacity-50"> 
					<i class="bi bi-envelope-at-fill"></i>
					</span>
					<input type="email" name ="email" id="id-email" class="form-control opacity-50" placeholder="E-mail" required>
				</div>
			</div>
			
			<div class="rounded mx-auto d-block w-50 py-2 px-4">
				<div class="input-group">
					<span class="input-group-text opacity-50"> 
						<i class="bi bi-person-circle"></i>
					</span> 
						<input type="text" name="nome-usuario" id="id-nome-usuario" class="form-control opacity-50" placeholder="Nome de usuario" required>
				</div>
			</div>
			
			<div class="rounded mx-auto d-block w-50 py-2 px-4">
				<div class="input-group">
					<span class="input-group-text opacity-50"> 
						<i class="bi bi-coin"></i>
					</span> 
						<input type="text" name="nome-grupo" id="id-nome-grupo" class="form-control opacity-50" placeholder="Nome do projeto" required>
				</div>
			</div>
			
			<div class="rounded mx-auto d-block w-50 py-2 px-4">
				<div class="input-group">
					<span class="input-group-text opacity-50"> 
						<i class="bi bi-lock-fill"></i>
					</span> 
						<input type="password" name="senha" id="id-senha" class="form-control opacity-50" placeholder="Senha" required>
				</div>
			</div>
			
			<div class="rounded mx-auto d-block w-50 py-2 px-4">
				<div class="input-group">
					<span class="input-group-text opacity-50"> 
						<i class="bi bi-lock-fill"></i>
					</span> 
						<input type="password" name="confirma-senha" id="id-confirma-senha" class="form-control opacity-50" placeholder="Confirmar Senha" required>
				</div>
			</div>
			<div class="row py-4">
				<input type="submit" value="cadastre-se" class="btn btn-outline-warning text-white rounded mx-auto d-block w-25"></input>
			</div>
		</form>

		<c:if test="${not empty msg }">
			<div class="border border-warning alert alert-outline-warning text-white text-center rounded mx-auto d-block w-50">${msg}</div>
		</c:if>

		<c:if test="${not empty erro }">
			<div class="border border-warning alert alert-outline-warning text-white text-center rounded mx-auto d-block w-50">${erro}</div>
		</c:if>
		
		<footer class="row">
			<p class="text-center">Ao se registrar você concorda com nosso
				Termo de Uso e nossa Politica de privacidade</p>
		</footer>
	</div>
<script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>
