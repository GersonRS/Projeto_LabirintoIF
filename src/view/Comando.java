package view;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Comando extends JLabel{
	
	private String nomeComando="";
	private String cor="";
	
	public Comando() {
	
	}
	
	public Comando(ImageIcon image, String cor, String comando) {
		super(image);
		this.cor = cor;
		this.nomeComando = comando;
	}

	public String getNomeComando() {
		return nomeComando;
	}

	public void setNomeComando(String nomeComando) {
		this.nomeComando = nomeComando;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
