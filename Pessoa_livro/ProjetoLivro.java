package Pessoa_livro;

public class ProjetoLivro {

	public static void main(String[] args) {
		Pessoa[] p = new Pessoa [2];
		Livro[] l = new Livro[3];
		
		p[0] = new Pessoa("Paulo", 20, "M");
		p[1] = new Pessoa("Gustavo", 22, "M");
		
		l[0] = new Livro("Aprendendo Java", "José da Silva", 300, p[0]);
		l[1] = new Livro("POO para Iniciantes", "Pedro Henrique", 500, p[1]);
		l[2] = new Livro("Java Avançado", "Maria Candido", 800, p[0]);
		
		l[0].abrir();
		l[0].folhear(100);
		l[0].avancarPag();
		
		System.out.println(l[0].detalhes());
		
	}

}
