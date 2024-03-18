package corridaa;

public class Corrida {
	 private Veiculo veiculo1;
	    private Veiculo veiculo2;
	    private int distanciaMaxima;

	    public Corrida() {
	    	this.veiculo1 = new Veiculo("Fusca");
	        this.veiculo2 = new Veiculo("Opala");
	        this.distanciaMaxima = 110;
	    }

	    public void iniciar() {
	        while (veiculo1.getDistancia() < distanciaMaxima && veiculo2.getDistancia() < distanciaMaxima) {
	            veiculo1.atualizar();
	            veiculo2.atualizar();
	            exibirCorrida();
	        }

	        
	        if (veiculo1.getDistancia() >= distanciaMaxima && veiculo2.getDistancia() >= distanciaMaxima) {
	            System.out.println("É um empate!");
	        } else if (veiculo1.getDistancia() >= distanciaMaxima) {
	            System.out.println(veiculo1.getNome() + " venceu a corrida!");
	        } else {
	            System.out.println(veiculo2.getNome() + " venceu a corrida!");
	        }
	    }

	    public void exibirCorrida() {
	        System.out.println("-------------------------------------------------------------------------------------------------------------------");
	        exibirVeiculo(veiculo1);
	        exibirVeiculo(veiculo2);
	        System.out.println("--------------------------------------------------------------------------------------------------------------------");
	    }

	  

	    public void exibirVeiculo(Veiculo veiculo) {
	        StringBuilder espacos = new StringBuilder();
	        for (int i = 0; i < veiculo.getDistancia(); i++) {
	            espacos.append(" ");
	        }
	        System.out.println(espacos + veiculo.getNome());
	    }
}
