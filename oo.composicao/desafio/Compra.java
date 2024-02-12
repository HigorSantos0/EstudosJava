package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;


public class Compra {
	List<Item> itens = new ArrayList<>();
	
	void adicionarItem(Produto produto, int quantidade) {
		this.itens.add(new Item(produto, quantidade));
	}

	void adicionarItem(String nome, double preco, int quantidade) {
		this.itens.add(new Item(new Produto(nome, preco), quantidade));
	}

	double obterValorTotal() {
		double total = 0;
		
		for(Item item: this.itens) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
