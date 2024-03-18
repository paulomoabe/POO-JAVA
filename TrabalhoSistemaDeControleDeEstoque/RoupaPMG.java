package TrabalhoSistemaDeControleDeEstoque;

import java.util.Scanner;

public class RoupaPMG implements Item{
	private String descricao;
	private int quantidadeP;
	private int quantidadeM;
	private int quantidadeG;
	private int estoqueMinimo;
	private int estoqueMaximo;
	
	
	

	public RoupaPMG(String descricao, int quantidadeP, int quantidadeM, int quantidadeG, int estoqueMinimo,
			int estoqueMaximo) {
		super();
		this.descricao = descricao;
		this.quantidadeP = quantidadeP;
		this.quantidadeM = quantidadeM;
		this.quantidadeG = quantidadeG;
		this.estoqueMinimo = estoqueMinimo;
		this.estoqueMaximo = estoqueMaximo;
	}
	public void vendas() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o tamanho (P, M , G: " + descricao);
		String tamanho = scan.nextLine();
		System.out.println("Digite a quantidade de Peças: ");
		int quantidade = scan.nextInt();
		
		switch(tamanho){
			case "P":
				if(quantidadeP > 0 && quantidadeP >= quantidade) {
					quantidadeP -= quantidade ;
					System.out.println("Item vendido");
				}
				break;
			case "M":
				if(quantidadeM > 0 && quantidadeM >= quantidade) {
					quantidadeM-= quantidade;
					System.out.println("Item vendido");
				}
				break;
			case "G":
				if(quantidadeG > 0 && quantidadeG >= quantidade) {
					quantidadeG-= quantidade;
					System.out.println("Item vendido");
				}
				break;
				default:
					System.out.println("Escolha invalida ");
				
		}
			
	
	}
	public void reposicaoDoEstoque() {
		if(quantidadeP < estoqueMinimo) {
			quantidadeP = estoqueMaximo;
			System.out.println("Reposição foi feita para o máximo da " + descricao);
		}
		
			if(quantidadeM < estoqueMinimo) {
				quantidadeM = estoqueMaximo;
				System.out.println("Reposição foi feita para o máximo da " + descricao);
			}
			if(quantidadeG < estoqueMinimo) {
				quantidadeG = estoqueMaximo;
				System.out.println("Reposição foi feita para o máximo da " + descricao);
			}
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public int getQuantidadeP() {
		return quantidadeP;
	}
	public void setQuantidadeP(int quantidadeP) {
		this.quantidadeP = quantidadeP;
	}
	public int getQuantidadeM() {
		return quantidadeM;
	}
	public void setQuantidadeM(int quantidadeM) {
		this.quantidadeM = quantidadeM;
	}
	public int getQuantidadeG() {
		return quantidadeG;
	}
	public void setQuantidadeG(int quantidadeG) {
		this.quantidadeG = quantidadeG;
	}
	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}
	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}
	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}
	public void setEstoqueMaximo(int estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}

	
}


