package TrabalhoSistemaDeControleDeEstoque;

public class Acessorio extends Peca {

	
	public Acessorio(String descricao, int quantidade, int estoqueMaximo, int estoqueMinimo) {
		super(descricao, quantidade, estoqueMaximo, estoqueMinimo);

	}

	
	@Override
	
	public void venda(int qtdVendas) {
		this.quantidade=-qtdVendas;
		System.out.println("Item vendido");
		if(quantidade < estoqueMinimo) {
			reposicaoDoEstoque();
	}
	}
	
	
}

	


