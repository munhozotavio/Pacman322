package com.unicamp.mc322.pacman.posicionamento;

public class Quadrado {
	Ponto topoEsquerdo;
	Ponto valeDireito;
	
	public Quadrado(Ponto topoEsquerdo, Ponto valeDireito) {
		super();
		this.topoEsquerdo = topoEsquerdo;
		this.valeDireito = valeDireito;
	}
	
	public Ponto getTopoEsquerdo() {
		return topoEsquerdo;
	}
	
	public void setTopoEsquerdo(Ponto topoEsquerdo) {
		this.topoEsquerdo = topoEsquerdo;
	}
	
	public Ponto getValeDireito() {
		return valeDireito;
	}
	
	public void setValeDireito(Ponto valeDireito) {
		this.valeDireito = valeDireito;
	}
}
