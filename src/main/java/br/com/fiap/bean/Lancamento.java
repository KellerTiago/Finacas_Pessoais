package br.com.fiap.bean;

import java.sql.Date;

public class Lancamento {
	
	private int idLancamento;
	private UsuarioGrupo usuarioGrupo = new UsuarioGrupo();
	private CategoriaLancamento categoriaLancamento = new CategoriaLancamento();
	private Recorrencia recorrencia = new Recorrencia();
	private Usuario usuario = new Usuario();
	private TipoLancamento tipoLancamento = new TipoLancamento();
	private Meta meta = new Meta();
	private ContaCorrente contaCorrente = new ContaCorrente();
	private ContaPoupanca contaPoupanca = new ContaPoupanca();
	private CartaoCredito cartaoCredito = new CartaoCredito();
	private Date dtLancamento;
	private String dsLancamento;
	private double vtTotal;
	private Date dtInclusao;
	
	public Lancamento() {
		super();
	}

	public Lancamento(int idLancamento, UsuarioGrupo usuarioGrupo, CategoriaLancamento categoriaLancamento,
			Recorrencia recorrencia, Usuario usuario, TipoLancamento tipoLancamento, Meta meta,
			ContaCorrente contaCorrente, ContaPoupanca contaPoupanca, CartaoCredito cartaoCredito, Date dtLancamento,
			String dsLancamento, double vtTotal, Date dtInclusao) {
		super();
		this.idLancamento = idLancamento;
		this.usuarioGrupo = usuarioGrupo;
		this.categoriaLancamento = categoriaLancamento;
		this.recorrencia = recorrencia;
		this.usuario = usuario;
		this.tipoLancamento = tipoLancamento;
		this.meta = meta;
		this.contaCorrente = contaCorrente;
		this.contaPoupanca = contaPoupanca;
		this.cartaoCredito = cartaoCredito;
		this.dtLancamento = dtLancamento;
		this.dsLancamento = dsLancamento;
		this.vtTotal = vtTotal;
		this.dtInclusao = dtInclusao;
	}

	public int getIdLancamento() {
		return idLancamento;
	}

	public void setIdLancamento(int idLancamento) {
		this.idLancamento = idLancamento;
	}

	public UsuarioGrupo getUsuarioGrupo() {
		return usuarioGrupo;
	}

	public void setUsuarioGrupo(UsuarioGrupo usuarioGrupo) {
		this.usuarioGrupo = usuarioGrupo;
	}

	public CategoriaLancamento getCategoriaLancamento() {
		return categoriaLancamento;
	}

	public void setCategoriaLancamento(CategoriaLancamento categoriaLancamento) {
		this.categoriaLancamento = categoriaLancamento;
	}

	public Recorrencia getRecorrencia() {
		return recorrencia;
	}

	public void setRecorrencia(Recorrencia recorrencia) {
		this.recorrencia = recorrencia;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public TipoLancamento getTipoLancamento() {
		return tipoLancamento;
	}

	public void setTipoLancamento(TipoLancamento tipoLancamento) {
		this.tipoLancamento = tipoLancamento;
	}

	public Meta getMeta() {
		return meta;
	}

	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	public ContaCorrente getContaCorrente() {
		return contaCorrente;
	}

	public void setContaCorrente(ContaCorrente contaCorrente) {
		this.contaCorrente = contaCorrente;
	}

	public ContaPoupanca getContaPoupanca() {
		return contaPoupanca;
	}

	public void setContaPoupanca(ContaPoupanca contaPoupanca) {
		this.contaPoupanca = contaPoupanca;
	}

	public CartaoCredito getCartaoCredito() {
		return cartaoCredito;
	}

	public void setCartaoCredito(CartaoCredito cartaoCredito) {
		this.cartaoCredito = cartaoCredito;
	}

	public Date getDtLancamento() {
		return dtLancamento;
	}

	public void setDtLancamento(Date dtLancamento) {
		this.dtLancamento = dtLancamento;
	}

	public String getDsLancamento() {
		return dsLancamento;
	}

	public void setDsLancamento(String dsLancamento) {
		this.dsLancamento = dsLancamento;
	}

	public double getVtTotal() {
		return vtTotal;
	}

	public void setVtTotal(double vtTotal) {
		this.vtTotal = vtTotal;
	}

	public Date getDtInclusao() {
		return dtInclusao;
	}

	public void setDtInclusao(Date dtInclusao) {
		this.dtInclusao = dtInclusao;
	}


}
