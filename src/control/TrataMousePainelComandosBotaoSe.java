package control;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import view.PainelComandos;

public class TrataMousePainelComandosBotaoSe extends MouseAdapter {

	private PainelComandos comandos;
	private int iteracao = 0;

	public TrataMousePainelComandosBotaoSe(PainelComandos comandos) {
		this.comandos = comandos;
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == MouseEvent.BUTTON1) {
			iteracao++;
			if (iteracao > 3) {
				iteracao = 0;
			}
		} else if (e.getButton() == MouseEvent.BUTTON3) {
			iteracao--;
			if (iteracao < 0) {
				iteracao = 3;
			}
		}

		if (iteracao == 0) {
			comandos.acoes.get(0).setIcon(comandos.imagens.get(0));
			comandos.acoes.get(1).setIcon(comandos.imagens.get(4));
			comandos.acoes.get(2).setIcon(comandos.imagens.get(8));
			comandos.acoes.get(3).setIcon(comandos.imagens.get(12));
			for (int i = 0; i < comandos.acoes.size(); i++) {
				comandos.acoes.get(i).setCor("");
			}
		} else if (iteracao == 1) {
			comandos.acoes.get(0).setIcon(comandos.imagens.get(1));
			comandos.acoes.get(1).setIcon(comandos.imagens.get(5));
			comandos.acoes.get(2).setIcon(comandos.imagens.get(9));
			comandos.acoes.get(3).setIcon(comandos.imagens.get(13));
			for (int i = 0; i < comandos.acoes.size(); i++) {
				comandos.acoes.get(i).setCor("Amarelo");
			}
		} else if (iteracao == 2) {
			comandos.acoes.get(0).setIcon(comandos.imagens.get(2));
			comandos.acoes.get(1).setIcon(comandos.imagens.get(6));
			comandos.acoes.get(2).setIcon(comandos.imagens.get(10));
			comandos.acoes.get(3).setIcon(comandos.imagens.get(14));
			for (int i = 0; i < comandos.acoes.size(); i++) {
				comandos.acoes.get(i).setCor("Azul");
			}
		} else if (iteracao == 3) {
			comandos.acoes.get(0).setIcon(comandos.imagens.get(3));
			comandos.acoes.get(1).setIcon(comandos.imagens.get(7));
			comandos.acoes.get(2).setIcon(comandos.imagens.get(11));
			comandos.acoes.get(3).setIcon(comandos.imagens.get(15));
			for (int i = 0; i < comandos.acoes.size(); i++) {
				comandos.acoes.get(i).setCor("Vermelho");
			}
		}
	}

}
