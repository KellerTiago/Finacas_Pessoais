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
	<div class="container-fluid">
		<%@ include file="tabs.jsp"%>
		<div class="row justify-content-md-center">
			<div class="col-lg-10 ">
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
								<td><fmt:formatDate value="${o.dtInicio}" pattern="dd/MM/yyyy" /></td>
								<td><fmt:formatDate value="${o.dtFim}" pattern="dd/MM/yyyy" /></td>
								<td><c:url value="objetivo" var="link">
										<c:param name="acao" value="abrir-alterar" />
										<c:param name="codigo" value="${o.idObjetivo}" />
									</c:url> <a href="${link}">Editar</a></td>
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