package exercicio1;

public class Funcionario {
	private String nome;
	private String cpf;
	private String end;
	private String login;
	private String senha;

	
	public Funcionario(String nome, String cpf, String end, String login, String senha){
		this.nome = nome;
		this.cpf = cpf;
		this.end = end;
		this.login = login;
		this.senha = senha;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEnd() {
		return end;
	}


	public void setEnd(String end) {
		this.end = end;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
}
