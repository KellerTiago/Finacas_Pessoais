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
									</c:url> <a class="text-warning" href="${link}">Editar</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>