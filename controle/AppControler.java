package controle;

public class AppControler {

	public static void main(String[] args) {
		ControleRemoto c = new ControleRemoto();
		c.ligar();
		c.maisVolume();
		c.play();
		c.abrirMenu();
		
	}

}
