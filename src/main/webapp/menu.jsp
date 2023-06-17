<nav class="navbar navbar-expand-lg bg-body-tertiary"
	data-bs-theme="dark">

	<!-- Imagem principal -->

	<div class="container-fluid">
		<span class="border"><a class="navbar-brand text-muted"
			href="#"> <img src="resources/img/Logo Foto.svg" alt="logo"
				width="54" height="54"> Financial Project
		</a></span>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">

			<!-- Primeira linha do menu -->

			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" role="button"
					data-bs-toggle="dropdown" aria-expanded="false">Menu</a>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="#">Registrar
								Lancamento</a></li>
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item" href="#">Consultar
								Lancamentos</a></li>
					</ul></li>
				<!-- Botao drop down -->
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" role="button"
					data-bs-toggle="dropdown" aria-expanded="false">Informações</a>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item nav-link" href="${pageContext.request.contextPath}/objetivo?acao=listar">Objetivo</a></li>
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item" href="cadasto-objetivo">Meta</a></li>
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item" href="#">Categoria
								Lançamento</a></li>
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item" href="#">Conta Bancária</a></li>
						<li><hr class="dropdown-divider"></li>
						<li><a class="dropdown-item" href="#">Cartão de Crédito</a></li>
					</ul></li>
			</ul>
		</div>
		<form class="d-flex" role="search" >
			<input class="form-control me-2" type="search" placeholder="Search"
				aria-label="Search">
			<button class="btn btn-outline-warning" type="submit" >Search</button>
		</form>

	</div>
</nav>