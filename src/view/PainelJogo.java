package view;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class PainelJogo extends JPanel{
	private static final long serialVersionUID = 1L;

	private Mapa mapa;
	private Graphics2D g2d;
	
	public PainelJogo() {
		setSize(668, 440);
		setPreferredSize(new Dimension(668, 440));
		setBorder(BorderFactory.createBevelBorder(1));
		
		mapa = new Mapa();
		
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g2d = (Graphics2D) g;
//		g2d.drawImage(mapa.getMapa(), 0, 0, null);
	}
}
