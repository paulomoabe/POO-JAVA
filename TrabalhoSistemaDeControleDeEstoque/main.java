package TrabalhoSistemaDeControleDeEstoque;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
	/*	Scanner scan = new Scanner(System.in);
		Acessorio a1 = new Acessorio("Pulseira", 7, 10, 5);
		
		System.out.println("qtdVendas: ");
		int qtdVendas = scan.nextInt();
		a1.venda(qtdVendas);
		
		System.out.println(a1.getQuantidade());*/
		
		RoupaPMG r1 = new RoupaPMG("camisa",10, 10, 10,10, 20);
		r1.vendas();
		System.out.println(r1.getQuantidadeP());
		System.out.println(r1.getQuantidadeM());
		System.out.println(r1.getQuantidadeG());
	}

}
