package TrabalhoSistemaDeControleDeEstoque;

abstract class Peca  {
	protected String descricao;
	protected int quantidade;
	protected int estoqueMaximo;
	protected int estoqueMinimo;
	public Peca(String descricao, int quantidade, int estoqueMaximo, int estoqueMinimo) {
		super();
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.estoqueMaximo = estoqueMaximo;
		this.estoqueMinimo = estoqueMinimo;
	}
	
	
	public void venda(int qtdVendas) {
		
	}
	
	public void reposicaoDoEstoque() {
		if(quantidade < estoqueMinimo) {
			quantidade = estoqueMaximo;
			System.out.println("Reposição foi feita para o máximo da " + descricao);
		}
		
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getEstoqueMaximo() {
		return estoqueMaximo;
	}

	public void setEstoqueMaximo(int estoqueMaximo) {
		this.estoqueMaximo = estoqueMaximo;
	}

	public int getEstoqueMinimo() {
		return estoqueMinimo;
	}

	public void setEstoqueMinimo(int estoqueMinimo) {
		this.estoqueMinimo = estoqueMinimo;
	}


	
	
	
}
