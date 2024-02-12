package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 10, 20);
		compra1.adicionarItem(new Produto("Pc", 20), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Lapis", 10, 15);
		compra2.adicionarItem(new Produto("Monitor", 20), 1);
		
		Cliente cliente = new Cliente("Higor Nascimento");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		
		System.out.println(cliente.obterTotal());
	}
}
