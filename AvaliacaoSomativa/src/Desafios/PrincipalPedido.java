package Desafios;

public class PrincipalPedido {
	
	public static void main(String[] args) {
		
		Pedido Pedido = new Pedido(1,"Cadeira",23);
		System.out.println("Produto");
		System.out.println("Id: "+ Pedido.getId());
		System.out.println("Produto: "+ Pedido.getProduto());
		System.out.println("Quantidade: "+ Pedido.getQuantidade());
	}
}
