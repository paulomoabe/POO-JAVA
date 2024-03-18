package SistemaDeGerenciamentoDeEmpregados;

public class Atendente extends Funcionario{
	private double comisao;
	
	public Atendente(String nome, double salarioBase, double comisao) {
		super(nome, "Atendente", salarioBase);
		this.comisao = comisao;
	}
	public double calcularSalario() {
		return super.calcularSalario()+comisao;
	}

	
	
	
}
