package oo.composicao.desafio;

public class Item {
	int quantidade;
	Produto produto;
	
	Item(Produto produto, int quant){
		this.produto = produto;
		this.quantidade = quant;
	}

}
