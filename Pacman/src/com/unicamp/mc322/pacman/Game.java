package com.unicamp.mc322.pacman;

import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import com.unicamp.mc322.pacman.funcionalities.*;
import com.unicamp.mc322.pacman.posicionamento.Ponto;

public class Game implements Runnable {
	private Display display;
    private boolean running;
    private Graphics g;
    private Thread t;
    
    Imagem img;
    
    public synchronized void start() {
        if (running) {
        	return;
        }
        
        running = true;
        t = new Thread(this);
        t.start();
    }

    public synchronized void stop() {
        if (!running) {
            return;
        }
        
        running = false;
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
	
	@Override
    public void run() {
        init();
        while (running) {
        	tick();
            render();
        }
        stop();
    }
	
	private void render() {
	    BufferStrategy bs = display.getCanvas().getBufferStrategy();

        if (bs == null) {
            System.out.println("bs is null....");
            display.getCanvas().createBufferStrategy(3);
            return;
        }


        g = display.getCanvas().getGraphics();
        img.draw(g);
    }
	
	private void tick() {
    	try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			System.err.println("Erro no sleep maroto");
			e.printStackTrace();
		}
    }
	
	private void init() {
		img = new Imagem("/home/cc2018-ceb/ra214777/Downloads/7b000e9a5060837b7e018c42bf166486e66ed44cr1-1150-2048v2_128.jpg", new Ponto(0,0), new Ponto(6.25f,6.25f));
        display = new Display("draw image", 800, 800);
    }
}
