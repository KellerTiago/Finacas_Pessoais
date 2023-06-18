package br.com.fiap.bean;
import java.util.Calendar;

public class Usuario {

	private int idUsuario;
	private int usuarioGrupo = new UsuarioGrupo().getIdGrupo();
	private String nmUsuario;
	private String email;
	private String senha;
	private Calendar dtInclusao;
	private boolean status;

	public Usuario() {
	}

	public Usuario(int idUsuario, int usuarioGrupo, String nmUsuario, String email, String senha,
			Calendar dtInclusao, boolean status) {
		super();
		this.idUsuario = idUsuario;
		this.usuarioGrupo = usuarioGrupo;
		this.nmUsuario = nmUsuario;
		this.email = email;
		this.senha = senha;
		this.dtInclusao = dtInclusao;
		this.status = status;
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public int getUsuarioGrupo() {
		return usuarioGrupo;
	}

	public void setUsuarioGrupo(int usuarioGrupo) {
		this.usuarioGrupo = usuarioGrupo;
	}

	public String getNmUsuario() {
		return nmUsuario;
	}

	public void setNmUsuario(String nmUsuario) {
		this.nmUsuario = nmUsuario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Calendar getDtInclusao() {
		return dtInclusao;
	}

	public void setDtInclusao(Calendar dtInclusao) {
		this.dtInclusao = dtInclusao;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

}
