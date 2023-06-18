<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<title>Principal</title>
<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
<%@ include file="header.jsp"%>
</head>
<body>
	<%@ include file="menu.jsp"%>

	<div class="container-fluid">

		<div class="row justify-content-md-center p-5">

			<div class="col col-lg-9">

				<div class="container-fluid">
					<%-- O action produto referencia a Servlet e o metodo no method --%>
					<ul class="nav nav-tabs">

						<li class="nav-item"><a class="nav-link text-warning"
							href="${pageContext.request.contextPath}/objetivo?acao=listar">Listar
								Objetivos</a></li>

						<li class="nav-item"><a class="nav-link text-warning active"
							aria-current="page" href="cadastro-objetivo.jsp">Cadastro de
								Objetivo</a></li>

						<li class="nav-item"><a class="nav-link disabled">Editar</a>
						</li>


					</ul>
					<form action="objetivo" method="post">

						<%-- <input type="hidden" value="cadastrar" name="acao">--%>
						<input type="hidden" value="cadastrar" name="acao">

						<div class="form-group">
							<label for="id-nome-objetivo">Objetivo</label> <input type="text"
								name="nome-objetivo" id="id-nome-objetivo" class="form-control">
						</div>

						<div class="form-group">
							<label for="id-valor">Valor</label> <input type="text"
								name="valor" id="id-valor" class="form-control">
						</div>

						<div class="form-group">
							<label for="id-data-inicio">Data inicio</label> <input
								type="text" name="data-inicio" id="id-data-inicio"
								class="form-control">
						</div>

						<div class="form-group">
							<label for="id-data-fim">Data fim</label> <input type="text"
								name="data-fim" id="id-data-fim" class="form-control">
						</div>

						<div class="d-grid gap-2 d-md-flex justify-content-md-end p-3">
							<input type="submit" value="Salvar" class="btn btn-warning">
						</div>

					</form>
				</div>
				<c:if test="${not empty msg }">
					<div
						class="border border-warning alert alert-dismissible fade show  alert-outline-warning text-black text-center rounded mx-auto d-block w-50"
						role="alert">${msg}</div>
				</c:if>

				<c:if test="${not empty erro }">
					<div
						class="border border-warning alert alert-dismissible fade show  alert-outline-warning text-black text-center rounded mx-auto d-block w-50"
						role="alert">${erro}</div>
				</c:if>
			</div>
		</div>
	</div>
	<%@include file="alerts.jsp"%>
	<%@ include file="footer.jsp"%>
</body>
</html>