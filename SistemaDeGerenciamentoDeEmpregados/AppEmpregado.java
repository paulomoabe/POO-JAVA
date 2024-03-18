package SistemaDeGerenciamentoDeEmpregados;

public class AppEmpregado {

	public static void main(String[] args) {

		Gerente gerente1 = new Gerente("Paulo", 10000.0,2000.0);
		Atendente atendente1 = new Atendente("Jessica", 2500.0,500.0);
		System.out.println("Salário do Gerente: "+ gerente1.calcularSalario());
		gerente1.exibirDetalhes();
		
		System.out.println();
		
		System.out.println("Salário do Atendente: " + atendente1.calcularSalario());
		atendente1.exibirDetalhes();
		
	}

}
