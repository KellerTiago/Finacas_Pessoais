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
					<ul class="nav nav-tabs">
						
						<li class="nav-item"><a class="nav-link text-warning"
							href="${pageContext.request.contextPath}/objetivo?acao=listar">Listar
								Objetivos</a></li>

						<li class="nav-item"><a class="nav-link text-warning" aria-current="page"
							href="cadastro-objetivo.jsp">Cadastro de Objetivo</a></li>
							
						<li class="nav-item"><a class="nav-link active disabled">Editar</a>
						</li>
					</ul>
					<form action="objetivo" method="post">

						<input type="hidden" value="editar" name="acao"> <input
							type="hidden" value="${objetivo.idObjetivo}" name="codigo">

						<div class="form-group">
							<label for="id-nome-objetivo">Objetivo</label> <input type="text"
								name="nome-objetivo" id="id-nome-objetivo" class="form-control"
								value="${objetivo.dsObjetivo}">
						</div>

						<div class="form-group">
							<label for="id-valor">Valor</label> <input type="text"
								name="valor" id="id-valor" class="form-control"
								value="${objetivo.vrObjetivo}">
						</div>

						<div class="form-group">
							<label for="id-data-inicio">Data inicio</label> <input
								type="date" name="data-inicio" id="id-data-inicio"
								class="form-control" value="${objetivo.dtInicio}"
								pattern="dd/MM/yyyy">
						</div>

						<div class="form-group">
							<label for="id-data-fim">Data fim</label> <input type="date"
								name="data-fim" id="id-data-fim" class="form-control"
								value="${objetivo.dtFim}" pattern="dd/MM/yyyy">
						</div>
						<div class="d-grid gap-2 d-md-flex justify-content-md-end p-3">

							<input type="submit" value="Salvar" class="btn btn-warning">
							<a href="objetivo?acao=listar" class="btn btn-warning">Cancelar</a>

						</div>
					</form>
				</div>
				<c:if test="${not empty msg }">
					<div class="alert alert-success">${msg}</div>
				</c:if>
				<c:if test="${not empty erro }">
					<div class="alert alert-danger">${erro}</div>
				</c:if>
				<%@include file="alerts.jsp" %>
				<%@ include file="footer.jsp"%>
			</div>
		</div>
	</div>

</body>
</html>