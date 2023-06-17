<div class="container">
	<div class="btn-group" role="group" aria-label="Basic example">
		<a href="cadastro-objetivo.jsp" class="btn btn-warning mr-2 rounded active">Cadastro Objetivos</a>
		<form action="${pageContext.request.contextPath}/objetivo" method="get">
			<input type="hidden" name="acao" value="listar">
			<input type="submit" value="Listar Objetivos">
		</form>
	</div>
</div>
