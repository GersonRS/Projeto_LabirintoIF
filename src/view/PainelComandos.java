package view;

import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import control.TrataMousePainelComandos;
import control.TrataMousePainelComandosBotaoSe;

public class PainelComandos{

	public JLabel fundo;
	public ArrayList<Comando> acoes;
	public JPanel painel;
	public ArrayList<Comando> comandos;
	public ArrayList<ImageIcon> imagens;
	public Comando arrastar;
	public Comando se;
	public boolean pressionouAcao;
	public TrataMousePainelComandos tratar;
	public TrataMousePainelComandosBotaoSe tratarBotaoSe;
	public PainelConsole console;

	public PainelComandos() {
		painel = new JPanel();
		painel.setSize(358, 640);
		painel.setPreferredSize(new Dimension(358, 640));
		painel.setLayout(null);
		acoes = new ArrayList<Comando>();
		comandos = new ArrayList<Comando>();
		arrastar = new Comando();
		painel.add(arrastar);
		fundo = new JLabel(new ImageIcon(getClass().getClassLoader()
				.getResource("metodos.png")));
		painel.add(fundo);
		fundo.setBounds(0, 0, 358, 540);

		carregarAcoes();

		acoes.add(new Comando(imagens.get(0), "", "frente"));
		acoes.add(new Comando(imagens.get(4), "", "esquerda"));
		acoes.add(new Comando(imagens.get(8), "", "direita"));
		acoes.add(new Comando(imagens.get(12), "", "pisca"));
		se = new Comando(new ImageIcon(getClass().getClassLoader().getResource(
				"Se.png")), "", "se");

		int inc = 36;
		int x = 92;
		int y = 10;
		int j = 0;
		int incY = 0;

		painel.add(se);
		se.setBounds(x + inc * 4, y + incY, 32, 32);

		for (int i = 0; i < acoes.size(); i++) {
			painel.add(acoes.get(i));
			acoes.get(i).setBounds(x + inc * j, y + incY, 32, 32);
			j++;
		}
		tratar = new TrataMousePainelComandos(this);
		tratarBotaoSe = new TrataMousePainelComandosBotaoSe(this);
		painel.addMouseListener(tratar);
		painel.addMouseMotionListener(tratar);
		se.addMouseListener(tratarBotaoSe);
		addPosicoes();
	}

	public void carregarAcoes() {
		imagens = new ArrayList<ImageIcon>();

		imagens.add(new ImageIcon(getClass().getClassLoader().getResource(
				"Frente.png")));
		imagens.add(new ImageIcon(getClass().getClassLoader().getResource(
				"Frente(Amarelo).png")));
		imagens.add(new ImageIcon(getClass().getClassLoader().getResource(
				"Frente(Azul).png")));
		imagens.add(new ImageIcon(getClass().getClassLoader().getResource(
				"Frente(Vermelho).png")));
		imagens.add(new ImageIcon(getClass().getClassLoader().getResource(
				"Esquerda.png")));
		imagens.add(new ImageIcon(getClass().getClassLoader().getResource(
				"Esquerda(Amarelo).png")));
		imagens.add(new ImageIcon(getClass().getClassLoader().getResource(
				"Esquerda(Azul).png")));
		imagens.add(new ImageIcon(getClass().getClassLoader().getResource(
				"Esquerda(Vermelho).png")));
		imagens.add(new ImageIcon(getClass().getClassLoader().getResource(
				"Direita.png")));
		imagens.add(new ImageIcon(getClass().getClassLoader().getResource(
				"Direita(Amarelo).png")));
		imagens.add(new ImageIcon(getClass().getClassLoader().getResource(
				"Direita(Azul).png")));
		imagens.add(new ImageIcon(getClass().getClassLoader().getResource(
				"Direita(Vermelho).png")));
		imagens.add(new ImageIcon(getClass().getClassLoader().getResource(
				"Pisca.png")));
		imagens.add(new ImageIcon(getClass().getClassLoader().getResource(
				"Pisca(Amarelo).png")));
		imagens.add(new ImageIcon(getClass().getClassLoader().getResource(
				"Pisca(Azul).png")));
		imagens.add(new ImageIcon(getClass().getClassLoader().getResource(
				"Pisca(Vermelho).png")));

	}

	public void addPosicoes() {
		int inc = 36;
		int j = 0;
		int incY = 0;
		for (int i = 0; i < 130; i++) {
			if (i > 0 && i % 10 == 0) {
				incY += inc;
				j = 0;
			}
			comandos.add(new Comando());
			fundo.add(comandos.get(i));
			comandos.get(i).setBounds(1 + inc * j, 75 + incY, 32, 32);
			j++;
		}
	}

	public void update() {
		for (int i = 0; i < comandos.size(); i++) {
			comandos.get(i).setCor("");
			comandos.get(i).setNomeComando("");
			comandos.get(i).setIcon(null);
		}
		ArrayList<String> lista = (ArrayList<String>) console.listCMD;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).equalsIgnoreCase("frente")) {
				comandos.get(i).setIcon(imagens.get(0));
				comandos.get(i).setNomeComando("frente");
				comandos.get(i).setCor("");				
			} else if (lista.get(i).equalsIgnoreCase("frenteAmarelo")) {
				comandos.get(i).setIcon(imagens.get(1));
				comandos.get(i).setNomeComando("frente");
				comandos.get(i).setCor("amarelo");
			} else if (lista.get(i).equalsIgnoreCase("frenteAzul")) {
				comandos.get(i).setIcon(imagens.get(2));
				comandos.get(i).setNomeComando("frente");
				comandos.get(i).setCor("azul");
			} else if (lista.get(i).equalsIgnoreCase("frenteVermelho")) {
				comandos.get(i).setIcon(imagens.get(3));
				comandos.get(i).setNomeComando("frente");
				comandos.get(i).setCor("vermelho");
			} else if (lista.get(i).equalsIgnoreCase("esquerda")) {
				comandos.get(i).setIcon(imagens.get(4));
				comandos.get(i).setNomeComando("esquerda");
				comandos.get(i).setCor("");
			} else if (lista.get(i).equalsIgnoreCase("esquerdaAmarelo")) {
				comandos.get(i).setIcon(imagens.get(5));
				comandos.get(i).setNomeComando("esquerda");
				comandos.get(i).setCor("amarelo");
			} else if (lista.get(i).equalsIgnoreCase("esquerdaAzul")) {
				comandos.get(i).setIcon(imagens.get(6));
				comandos.get(i).setNomeComando("frente");
				comandos.get(i).setCor("azul");
			} else if (lista.get(i).equalsIgnoreCase("esquerdaVermelho")) {
				comandos.get(i).setIcon(imagens.get(7));
				comandos.get(i).setNomeComando("esquerda");
				comandos.get(i).setCor("vermelho");
			} else if (lista.get(i).equalsIgnoreCase("direita")) {
				comandos.get(i).setIcon(imagens.get(8));
				comandos.get(i).setNomeComando("direita");
				comandos.get(i).setCor("");
			} else if (lista.get(i).equalsIgnoreCase("direitaAmarelo")) {
				comandos.get(i).setIcon(imagens.get(9));
				comandos.get(i).setNomeComando("direita");
				comandos.get(i).setCor("amarelo");
			} else if (lista.get(i).equalsIgnoreCase("direitaAzul")) {
				comandos.get(i).setIcon(imagens.get(10));
				comandos.get(i).setNomeComando("direita");
				comandos.get(i).setCor("azul");
			} else if (lista.get(i).equalsIgnoreCase("direitaVermelho")) {
				comandos.get(i).setIcon(imagens.get(11));
				comandos.get(i).setNomeComando("direita");
				comandos.get(i).setCor("vermelho");
			} else if (lista.get(i).equalsIgnoreCase("pisca")) {
				comandos.get(i).setIcon(imagens.get(12));
				comandos.get(i).setNomeComando("pisca");
				comandos.get(i).setCor("");
			} else if (lista.get(i).equalsIgnoreCase("piscaAmarelo")) {
				comandos.get(i).setIcon(imagens.get(13));
				comandos.get(i).setNomeComando("pisca");
				comandos.get(i).setCor("amarelo");
			} else if (lista.get(i).equalsIgnoreCase("piscaAzul")) {
				comandos.get(i).setIcon(imagens.get(14));
				comandos.get(i).setNomeComando("pisca");
				comandos.get(i).setCor("azul");
			} else if (lista.get(i).equalsIgnoreCase("piscaVermelho")) {
				comandos.get(i).setIcon(imagens.get(15));
				comandos.get(i).setNomeComando("pisca");
				comandos.get(i).setCor("vermelho");
			}
		}
	}
}
