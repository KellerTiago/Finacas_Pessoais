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
	<%@ include file="menu.jsp" %>
	
		<c:if test="${not empty msg }">
		<div class="alert alert-success">${msg}</div>
	</c:if>
	
	<c:if test="${not empty erro }">
		<div class="alert alert-danger">${erro}</div>
	</c:if>
<div class="container-fluid">
	<%-- O action produto referencia a Servlet e o metodo no method --%>
	<form action="objetivo" method="post">
	
		<input type="hidden" value="cadastrar" name="acao">
		
		<%-- o name do input e pego pela servlet pelo getparameter --%>
			<div class="form-group">
				<label for="id-nome">Objetivo</label>
				<input type="text" name="nome" id="id-nome" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="id-valor">Valor</label>
				<input type="text" name="valor" id="id-valor" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="id-quantidade">Data inicio</label>
				<input type="text" name="quantidade" id="id-quantidade" class="form-control">
			</div>
			
			<div class="form-group">
				<label for="id-fabricacao">Data fim</label>
				<input type="text" name="fabricacao" id="id-fabricacao" class="form-control">
			</div>
			<div class="container-fluid d-flex justify-content-end">
			<div class="btn-group justify-content-end p-3" role="group" aria-label="Basic example">
				<input type="submit" value="Salvar" class="btn btn-warning">
				<input type="submit" value="Cancelar" class="btn btn-warning">
			</div>
			</div>
		</form>
</div>
	
	<%@ include file="footer.jsp" %>
</body>
</html>