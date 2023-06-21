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

	<!-- Escrever o codigo aqui -->

	<div class="row justify-content-md-center p-5">
		<div class="col-lg-9 ">
			<div class="container-fluid">
				<ul class="nav nav-tabs">

					<li class="nav-item"><a class="nav-link text-warning active"
						href="${pageContext.request.contextPath}/objetivo?acao=listar">Listar
							Objetivos</a></li>

					<li class="nav-item"><a class="nav-link text-warning"
						aria-current="page" href="cadastro-objetivo.jsp">Cadastro de
							Objetivo</a></li>


					<li class="nav-item"><a class="nav-link disabled">Editar</a></li>


				</ul>
				<table class="table">
					<thead>
						<tr>
							<th scope="col">Id</th>
							<th scope="col">Objetivo</th>
							<th scope="col">Valor</th>
							<th scope="col">Data Inicio</th>
							<th scope="col">Data Fim</th>
							<th scope="col"></th>
						</tr>
					</thead>
					<tbody class="table-group-divider">
						<c:forEach items="${objetivos}" var="o">
							<tr>
								<th scope="row">${o.idObjetivo}</th>
								<td>${o.dsObjetivo}</td>
								<td>${o.vrObjetivo}</td>
								<td><fmt:formatDate value="${o.dtInicio}"
										pattern="dd/MM/yyyy" /></td>
								<td><fmt:formatDate value="${o.dtFim}" pattern="dd/MM/yyyy" /></td>
								<td><c:url value="objetivo" var="link">
										<c:param name="acao" value="abrir-alterar" />
										<c:param name="codigo" value="${o.idObjetivo}" />
									</c:url> <a class="btn btn-outline-warning btn-xs" href="${link}">Editar</a>
									
									<button type="button" class="btn btn-outline-warning"
										data-bs-toggle="modal" data-bs-target="#ExcluirModal"
										onclick="codigoExcluir.value = ${o.idObjetivo}">Excluir</button>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>

	<%@ include file="footer.jsp"%>

	<!-- Modal -->
	<div class="modal fade" id="ExcluirModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h1 class="modal-title fs-5" id="exampleModalLabel">Confirmação</h1>
					<button type="button" class="btn-close" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body">Deseja realmente excluir o objetivo?</div>
				<div class="modal-footer">

					<form action="objetivo" method="post">
						<input type="hidden" name="acao" value="excluir"> 
						<input type="hidden" name="codigo" id="codigoExcluir">
						<button type="button" class="btn btn-outline-warning"
							data-bs-dismiss="modal">Cancelar</button>
						<button type="submit" class="btn btn-outline-warning">Excluir</button>
					</form>

				</div>
			</div>
		</div>
	</div>

</body>
</html>