package SistemaDeGerenciamentoDeEmpregados;

public class Funcionario implements Empregado{
	private String nome;
	private String cargo;
	private double salarioBase;
	
	
	
	public Funcionario(String nome, String cargo, double salarioBase) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.salarioBase = salarioBase;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	@Override
	public double calcularSalario() {
		return salarioBase;
	}
	@Override
	public void exibirDetalhes() {
		System.out.println("Nome: " + this.getNome());
		System.out.println("Cargo: " + this.getCargo());
	}
	
	

}
