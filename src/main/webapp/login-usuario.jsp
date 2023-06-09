<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Bem vindo, Login</title>
<link rel="stylesheet" href="resources/css/stylesheet.css">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.2/font/bootstrap-icons.css">
</head>
<body class="bg-image"
	style="background-image: url(resources/img/background.jpg);">
	<div class="container-fluid">
		<header class="row">
			<img class="rounded mx-auto d-block w-25"
				src="resources/img/Logo Foto.svg" alt="Logo">
			<p>Bem vindo(a) ao Financial Project</p>
		</header>
		<form>
			<div class="rounded mx-auto d-block w-50 py-2 px-5">
				<div class="input-group">
					<span class="input-group-text opacity-50"> <i
						class="bi bi-person-circle "></i>
					</span> <input type="text" class="form-control opacity-50"
						placeholder="Usuário" required>
				</div>
			</div>
			<div class="rounded mx-auto d-block w-50 py-2 px-5">
				<div class="input-group">
					<span class="input-group-text opacity-50"> <i
						class="bi bi-lock-fill"></i>
					</span> <input type="password" class="form-control opacity-50"
						placeholder="Senha" required>
				</div>
			</div>
			<div class="row py-4">
				<button type="submit"
					class="btn btn-outline-warning text-white rounded mx-auto d-block w-25">Login</button>
			</div>
		</form>
		<footer class="text-center">
			<a href="cadastro-usuario.jsp" class="link-warning"> Não tem uma
				conta? Cadastre-se</a>
		</footer>

	</div>
	<script src="js/bootstrap.bundle.min.js"></script>
</body>
</html>