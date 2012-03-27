package exercicio1;

import java.util.LinkedList;
import java.util.List;

public class GerenteVeiculo {
	
	private List<Veiculo> veiculos;
	
	public GerenteVeiculo(){
		this.veiculos = new LinkedList<Veiculo>();
	}
	
	public void cadastrarVeiculo(Veiculo v){
		//TODO		
	}
	
	public Veiculo pesquisarVeiculo(String placa){
		//TODO		
		return null;
	}
	
	public void excluirVeiculo(Veiculo v){
		//TODO
	}
	
	public void atualizarVeiculo(Veiculo v){
		//TODO
	}
	
	public List<Veiculo> getVeiculosNoEstacionamento(){
		//TODO
		return null;
	}
	
	public boolean liberarVeiculo(Veiculo v){
		//TODO
		return false;
	}
	
	/**
	 * modificar a descrição da funcionalidade no caso de uso
	 */
	public void registrarEntradaVeiculo(Veiculo v){
		//TODO
		System.out.println("entrada do veiculo ("+v.getPlaca()+") registrada");
	}
	
	
	
	
}
