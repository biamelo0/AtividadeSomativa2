package Desafios;

public class PrincipalLivro {

	public static void main(String[] args) {
		Livro Livro = new Livro("Crepusculo","Ana Paula",500);
		System.out.println("Produto:");
		System.out.println("Nome: " + Livro.getNome());
		System.out.println("Autor: " + Livro.getAutor());
		System.out.println("Paginas: " + Livro.getPaginas());
		

	}

}
