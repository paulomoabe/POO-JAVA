package SistemaDeGerenciamentoDeEmpregados;

//Classe Gerente é uma subclasse de Funcionario que representa um gerente em uma empresa.
public class Gerente extends Funcionario{
	// Atributo específico de Gerente para armazenar o valor do bônus.
	private double bonus;

	 // Construtor da classe Gerente para inicializar os atributos específicos do Gerente.
	public Gerente(String nome, double salarioBase, double bonus) {
		 // Chamada ao construtor da classe base (Funcionario) usando super().
        // Passamos o nome, o cargo ("Gerente") e o salário base para a classe base.
		super(nome, "Gerente", salarioBase);
		// Inicializa o atributo 'bonus' com o valor fornecido como argumento.
		this.bonus = bonus;
		
	}
    // Sobrescrita do método calcularSalario para calcular o salário final do Gerente.

	public double calcularSalario() {
		// Isso retorna o salário base do Gerente.
		 // Calcula e retorna o salário final do Gerente, que inclui o bônus.
		return super.calcularSalario()+ bonus;
	}

}
