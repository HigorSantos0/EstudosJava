package oo.composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra compra1 = new Compra();
		compra1.cliente = "Higor";
		compra1.adicionarItem(new Item("Caneta", 20, 7.50)); // Perceba que funciona da mesma forma
		compra1.adicionarItem("Lapis", 10, 3.50); // Perceba
		compra1.itens.add(new Item("Caderno", 5, 20.50));
		
		System.out.println(compra1.itens.size());
		System.out.println(compra1.getValorTotal());
		
		for (Item i : compra1.itens) {
			System.out.println(i);
		}
	}
	

}
