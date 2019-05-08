package com.unicamp.mc322.pacman.personagem;

import java.awt.Graphics;

import com.unicamp.mc322.pacman.funcionalities.*;
import com.unicamp.mc322.pacman.posicionamento.*;

public abstract class Personagem {
	Quadrado colider;
	Imagem skin;
		
	public Personagem(Ponto posicaoInicial, String pathPraSkin, Ponto escala) {
		this.posicao = posicaoInicial;
		this.skin = new Imagem(pathPraSkin, posicaoInicial, escala);
	}
	
	public void mover(int variacaoEixoX, int variacaoEixoY) {
		this.moverEixoX(variacaoEixoX);
		this.moverEixoY(variacaoEixoY);
	}
	
	public void moverEixoX(int variacaoEixoX) {
		this.posicao.addX(variacaoEixoX);
	}
	
	public void moverEixoY(int variacaoEixoY) {
		this.posicao.addY(variacaoEixoY);
	}
	
	public void draw(Graphics g) {
		this.skin.draw(g);
	}
	
	public boolean colidiuCom(Personagem outro) {
		if () {
			
		}
	}
	
}
