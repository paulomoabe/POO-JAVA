package ExPolimorfismo;

public class AppAnimais {

	public static void main(String[] args) {
		Mamifero m = new  Mamifero();
		Reptil r = new Reptil();
		Peixe p = new Peixe();
		Ave a = new Ave();
		Canguru can = new Canguru();
		Cachorro cr = new Cachorro();
		Cobra co = new Cobra();
		Tartaruga t= new Tartaruga();
		GoldFish g = new GoldFish();
		Arara a1 = new Arara();
		
		can.locomover();
		cr.locomover();
		cr.emitirSom();
		
	}

}
