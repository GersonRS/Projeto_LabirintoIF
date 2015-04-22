package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextPane;

import modelo.Lexico;
import modelo.Token;

public class PainelConsole{

	private JTextPane console;
	public String ultima_palavra = "", palavra = "", saida = "";
	public final char CARACTER_SEPARADOR = '§';
	public final Lexico lexico = new Lexico();
	public List<String> listCMD;
	public JPanel painel;
	public PainelComandos comandos;
	public JTabbedPane abas;

	public PainelConsole() {
		painel = new JPanel();
		painel.setSize(668, 175);
		painel.setPreferredSize(new Dimension(668, 175));
		painel.setLayout(new BorderLayout());
		abas = new JTabbedPane(JTabbedPane.TOP);
		console = new JTextPane();
		console.setFont(new Font("Serif", Font.BOLD, 20));
		final JScrollPane scroll = new JScrollPane();
		abas.addTab("MAIN", scroll);
		painel.add(abas, BorderLayout.CENTER);
		scroll.setViewportView(console);
		listCMD = new ArrayList<String>();
		console.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					listCMD.removeAll(listCMD);
					saida = "";
					int flag = 0;
					palavra = console.getText();
					StringTokenizer st = new StringTokenizer(palavra, "\n");
					while (st.hasMoreTokens()) {
						String linha = (String) st.nextToken();
						StringTokenizer st1 = new StringTokenizer(linha, " ");
						while (st1.hasMoreTokens()) {
							String pal = (String) st1.nextToken();
							lexico.setInput(pal);
							try {
								Token t = null;
								while ((t = lexico.nextToken()) != null) {
									String tmp = t.getLexeme();
									if (tmp.equals("frente")) {
										flag = 1;
									} else if (tmp.equals("esquerda")) {
										flag = 2;
									} else if (tmp.equals("direita")) {
										flag = 3;
									} else if (tmp.equals("pisca")) {
										flag = 4;
									} else if (flag == 1) {
										t = lexico.nextToken();
										if (t.getLexeme().equalsIgnoreCase(
												"vermelho")) {
											listCMD.add("frenteVermelho");
										} else if (t.getLexeme()
												.equalsIgnoreCase("azul")) {
											listCMD.add("frenteAzul");
										} else if (t.getLexeme()
												.equalsIgnoreCase("amarelo")) {
											listCMD.add("frenteAmarelo");
										} else
											listCMD.add("frente");
										t = lexico.nextToken();
									} else if (flag == 2) {
										t = lexico.nextToken();
										if (t.getLexeme().equalsIgnoreCase(
												"vermelho")) {
											listCMD.add("esquerdaVermelho");
										} else if (t.getLexeme()
												.equalsIgnoreCase("azul")) {
											listCMD.add("esquerdaAzul");
										} else if (t.getLexeme()
												.equalsIgnoreCase("amarelo")) {
											listCMD.add("esquerdaAmarelo");
										} else
											listCMD.add("esquerda");
										t = lexico.nextToken();
									} else if (flag == 3) {
										t = lexico.nextToken();
										if (t.getLexeme().equalsIgnoreCase(
												"vermelho")) {
											listCMD.add("direitaVermelho");
										} else if (t.getLexeme()
												.equalsIgnoreCase("azul")) {
											listCMD.add("direitaAzul");
										} else if (t.getLexeme()
												.equalsIgnoreCase("amarelo")) {
											listCMD.add("direitaAmarelo");
										} else
											listCMD.add("direita");
										t = lexico.nextToken();
									} else if (flag == 4) {
										t = lexico.nextToken();
										if (t.getLexeme().equalsIgnoreCase(
												"vermelho")) {
											listCMD.add("piscaVermelho");
										} else if (t.getLexeme()
												.equalsIgnoreCase("azul")) {
											listCMD.add("piscaAzul");
										} else if (t.getLexeme()
												.equalsIgnoreCase("amarelo")) {
											listCMD.add("piscaAmarelo");
										} else
											listCMD.add("pisca");
										t = lexico.nextToken();
									}
								}
							} catch (Exception ex) {
							}
						}
					}
				}
				comandos.update();
			}
		});
	}

	public void update() {
		String texto = "";
		String aux = "";
		console.setText("");
		ArrayList<Comando> cmd = comandos.comandos;
		for (int i = 0; i < cmd.size(); i++) {
			texto += cmd.get(i).getNomeComando() + cmd.get(i).getCor();
			if (texto.equalsIgnoreCase("frente")) {
				aux += "frente();\n";
			} else if (texto.equalsIgnoreCase("frenteAmarelo")) {
				aux += "frente(amarelo);\n";
			} else if (texto.equalsIgnoreCase("frenteAzul")) {
				aux += "frente(azul);\n";
			} else if (texto.equalsIgnoreCase("frenteVermelho")) {
				aux += "frente(vermelho);\n";
			} else if (texto.equalsIgnoreCase("esquerda")) {
				aux += "esquerda();\n";
			} else if (texto.equalsIgnoreCase("esquerdaAmarelo")) {
				aux += "esquerda(amarelo);\n";
			} else if (texto.equalsIgnoreCase("esquerdaAzul")) {
				aux += "esquerda(azul);\n";
			} else if (texto.equalsIgnoreCase("esquerdaVermelho")) {
				aux += "esquerda(vermelho);\n";
			} else if (texto.equalsIgnoreCase("direita")) {
				aux += "direita();\n";
			} else if (texto.equalsIgnoreCase("direitaAmarelo")) {
				aux += "direita(amarelo);\n";
			} else if (texto.equalsIgnoreCase("direitaAzul")) {
				aux += "direita(azul);\n";
			} else if (texto.equalsIgnoreCase("direitaVermelho")) {
				aux += "direita(vermelho);\n";
			} else if (texto.equalsIgnoreCase("pisca")) {
				aux += "pisca();\n";
			} else if (texto.equalsIgnoreCase("piscaAmarelo")) {
				aux += "pisca(amarelo);\n";
			} else if (texto.equalsIgnoreCase("piscaAzul")) {
				aux += "pisca(azul);\n";
			} else if (texto.equalsIgnoreCase("piscaVermelho")) {
				aux += "pisca(vermelho);\n";
			}

			texto = "";
		}

		console.setText(aux);
	}
}
