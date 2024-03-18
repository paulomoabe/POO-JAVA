package corridaa;
import java.util.Random;
public class Veiculo {
	 private String nome;
	    private int velocidade;
	    private int distancia;

	    public Veiculo(String nome) {
	        this.nome = nome;
	        this.velocidade = 0;
	        this.distancia = 0;
	    }

	    public void atualizar() {
	        Random rand = new Random();
	        int novaVelocidade = rand.nextInt(3) + 1; // Sorteia uma nova velocidade entre 1 e 3.
	        this.velocidade = novaVelocidade;
	        this.distancia += novaVelocidade;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public int getDistancia() {
	        return distancia;
	    }
	}

