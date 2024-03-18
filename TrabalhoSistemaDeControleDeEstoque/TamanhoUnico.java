package TrabalhoSistemaDeControleDeEstoque;

public class TamanhoUnico extends Peca implements Item{

	public TamanhoUnico(String descricao, int quantidade, int estoqueMaximo, int estoqueMinimo) {
		super(descricao, quantidade, estoqueMaximo, estoqueMinimo);
	
	}
	@Override
	public void venda(int qtdVendas) {
		quantidade --;
		reposicaoDoEstoque();
	}


}
