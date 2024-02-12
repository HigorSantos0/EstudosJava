package oo.composicao;

public class Carro {

// Relacão Bidirecional	
//	Motor m; 
//	
//	Carro(){
//		this.m = new Motor(this);
//	}
	
	
	Motor m = new Motor();
		
	void acelerar() {
		if(m.fatorInjecao < 2.6) {
			
			m.fatorInjecao += 0.4;
		}
	}
		
	void frear() {
		if(m.fatorInjecao > 0.5)
		{
			m.fatorInjecao -= 0.4;
		}
		
	}
	
	void ligar() {
		m.ligado = true;
	}
	
	void desligar() {
		m.ligado = false;
	}
	
	boolean estarLigado() {
		return m.ligado;
	}
}
