package control;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import view.Comando;
import view.PainelComandos;

public class TrataMousePainelComandos extends MouseAdapter {

	private PainelComandos comando;

	public TrataMousePainelComandos(PainelComandos comando) {
		this.comando = comando;
	}

	public void mouseDragged(MouseEvent e) {

		if ((e.getX() > 8 && e.getX() < comando.painel.getWidth() - 7))
			comando.arrastar.setBounds(e.getX() - 16, comando.arrastar.getY(),
					32, 32);

		if (e.getY() < comando.painel.getHeight() - 30 && e.getY() > 8)
			comando.arrastar.setBounds(comando.arrastar.getX(), e.getY() - 16,
					32, 32);

	}

	public void mousePressed(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			verificarCliqueParaArrastar(e, comando.acoes);

			int k = verificarCliqueParaArrastar(e, comando.comandos);
			if (k >= 0) {
				comando.comandos.get(k).setIcon(null);
				comando.comandos.get(k).setNomeComando("");
			}

			// k = comando.verificarCliqueParaArrastar(e, comando.comandos);
			// if(k >= 0) {
			// comando.comandos.get(k).setIcon(null);
			// comando.comandos.get(k).setNomeComando("");
			// }
		} else if (e.getButton() == MouseEvent.BUTTON3) {
			int k = verificarClique(e, comando.comandos);
			if (k >= 0) {
				comando.comandos.get(k).setNomeComando("");
				comando.comandos.get(k).setIcon(null);
			}
			// k = verificarClique(e, sequenciaFuncao);
			// if(k >= 0) {
			//
			// sequenciaFuncao.get(k).setMovimento("");
			// sequenciaFuncao.get(k).setIcon(null);
			// }

			k = verificarClique(e, comando.acoes);
			if (k >= 0) {
				for (int i = 0; i < comando.comandos.size(); i++) {
					if (comando.comandos.get(i).getNomeComando().equals("")) {

						comando.comandos.get(i).setIcon(
								comando.acoes.get(k).getIcon());
						comando.comandos.get(i).setNomeComando(
								comando.acoes.get(k).getNomeComando());
						break;
					}
				}
			}
		}
	}

	public void mouseReleased(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			verificarSoltar(e, comando.comandos);
			// verificarSoltar(e, sequenciaFuncao);
			comando.pressionouAcao = false;
		}
		comando.arrastar.setIcon(null);
		System.gc();
	}
	
	public void verificarSoltar(MouseEvent e, ArrayList<Comando> a) {
		for (int i = 0; i < a.size(); i++)
			if (comando.pressionouAcao
					&& (e.getX() > a.get(i).getX() && e.getX() < a.get(i)
							.getX() + 32)
					&& (e.getY() > a.get(i).getY() && e.getY() < a.get(i)
							.getY() + 32)) {
				a.get(i).setIcon(comando.arrastar.getIcon());
				a.get(i).setNomeComando(comando.arrastar.getNomeComando());
				a.get(i).setCor(comando.arrastar.getCor());
			}
		comando.console.update();
	}
	
	public int verificarClique(MouseEvent e, ArrayList<Comando> a) {

		for (int i = 0; i < a.size(); i++) {
			if ((e.getX() > a.get(i).getX() && e.getX() < a.get(i).getX() + 32)
					&& (e.getY() > a.get(i).getY() && e.getY() < a.get(i)
							.getY() + 32)) {
				comando.console.update();
				return i;
			}
		}
		return -1;

	}
	
	public int verificarCliqueParaArrastar(MouseEvent e, ArrayList<Comando> a) {

		for (int i = 0; i < a.size(); i++) {
			if ((e.getX() > a.get(i).getX() && e.getX() < a.get(i).getX() + 32)
					&& (e.getY() > a.get(i).getY() && e.getY() < a.get(i)
							.getY() + 32)) {

				comando.arrastar.setIcon(a.get(i).getIcon());
				comando.arrastar.setNomeComando(a.get(i).getNomeComando());
				comando.arrastar.setCor(a.get(i).getCor());
				comando.arrastar.setBounds(e.getX() - 16, e.getY() - 16, 32, 32);
				comando.pressionouAcao = true;

				return i;
			}
		}
		return -1;

	}
}
