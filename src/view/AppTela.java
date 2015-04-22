package view;

import java.awt.Dimension;

import javax.swing.JFrame;

import modelo.Lexico;

public class AppTela extends JFrame {
	private static final long serialVersionUID = 1L;

	private PainelJogo jogo;
	private PainelComandos comando;
	private PainelConsole console;
	
	public final Lexico lexico = new Lexico();

	public AppTela() {
		super("Projeto");
		try {
			javax.swing.UIManager
					.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (Exception e) {
			e.printStackTrace();
		}

		setLayout(null);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1033, 640);
		setPreferredSize(new Dimension(1033, 640));
		setResizable(false);
		
		jogo = new PainelJogo();
		jogo.setLocation(0, 0);
		comando = new PainelComandos();
		comando.painel.setLocation(668, 0);
		console = new PainelConsole();
		console.painel.setLocation(0, 440);

		console.comandos=comando;
		comando.console=console;
		
		add(jogo);
		add(console.painel);
		add(comando.painel);

		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		AppTela aplicacao = new AppTela();
		aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
