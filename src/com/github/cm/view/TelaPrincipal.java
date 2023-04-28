package com.github.cm.view;

import javax.swing.JFrame;

import br.com.minhaempresa.cm.modelo.Tabuleiro;
import br.com.minhaempresa.cm.visao.PainelTabuleiro;
import br.com.minhaempresa.cm.visao.TelaPrincipal;

@SuppressWarnings("serial")
public class TelaPrincipal extends JFrame{

	public TelaPrincipal() {
		Tabuleiro tabuleiro = new Tabuleiro(16, 30, 50);
		
		add(new PainelTabuleiro(tabuleiro));
		
		setTitle("Campo Minado");
		setSize(630, 438);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TelaPrincipal();
	}
}