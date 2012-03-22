package exercicio1;

import java.util.List;

public class Fachada {

	private GerenteVeiculo gerenteVeiculo;
	private GerenteCliente gerenteCliente;
	private GerenteFuncionario gerenteFuncionario;
	
	
	public Fachada(){
		this.gerenteVeiculo = new GerenteVeiculo();
		this.gerenteCliente = new GerenteCliente();
		this.gerenteFuncionario = new GerenteFuncionario();
	}
	
	public void cadastrarVeiculo(Veiculo v){
		gerenteVeiculo.cadastrarVeiculo(v);
	}
	
	public Veiculo pesquisarVeiculo(String placa){		
		return gerenteVeiculo.pesquisarVeiculo(placa);
	}
	
	public void excluirVeiculo(Veiculo v){
		gerenteVeiculo.excluirVeiculo(v);
	}
	
	public void atualizarVeiculo(Veiculo v){
		gerenteVeiculo.atualizarVeiculo(v);
	}
	
	public List<Veiculo> getVeiculosNoEstacionamento(){
	
		return gerenteVeiculo.getVeiculosNoEstacionamento();
	}
	
	public boolean liberarVeiculo(Veiculo v){
		
		return gerenteVeiculo.liberarVeiculo(v);
	}
	
	public void registrarEntradaVeiculo(Veiculo v){
		gerenteVeiculo.registrarEntradaVeiculo(v);
	}

	public boolean efetuarPagamento(Veiculo v){
		
		return gerenteCliente.efetuarPagamento(v);
	}
	
	public Funcionario CriarConta(Funcionario f){
		
		return gerenteFuncionario.CriarConta(f);
	}
	
	public boolean Logar(String login, String Senha){
		
		return gerenteFuncionario.Logar(login, Senha);
	
}
	
}
