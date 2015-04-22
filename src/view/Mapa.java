package view;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import modelo.Maze;

public class Mapa {

	private BufferedImage tileSet;
	private BufferedImage mapa;
	private BufferedImage sombra;
	private final int TAMANHO = 13;

	private final static int tamanhoTileX = 32;
	private final static int tamanhoTileY = 32;
	private static int matriz[][];

	public Mapa() {
		matriz = Maze.createMaze(TAMANHO);
//		print(matriz);
//		try {
//			tileSet = ImageIO.read(this.getClass().getClassLoader()
//					.getResource("TileSet.png"));
//			sombra = ImageIO.read(this.getClass().getClassLoader()
//					.getResource("sombra.png"));
//		} catch (IOException e) {
//			System.out
//					.println("Erro ao buscar imagem do mapa.\nEncerrando aplicação");
//			System.exit(0);
//		}
		
	}
	private void print(int[][] maze)
    {
        int height = maze.length;
        int width = maze[0].length;

        for (int i = 0; i < height; i++)
        {
            for (int j = 0; j < width; j++)
            {
                System.out.print(maze[i][j] + "  ");
            }
            System.out.println();
        }
    }
	
	public void transformar(){
		for (int i = 0; i < TAMANHO; i++) {
			for (int j = 0; j < TAMANHO; j++) {
				if (matriz[i][j]==1) {
					matriz[i][j]=0;
				}
			}
		}
	}

	public void montarMapa() {

		mapa = new BufferedImage(TAMANHO * tamanhoTileX,
				TAMANHO * tamanhoTileY, BufferedImage.TYPE_4BYTE_ABGR);

		int posX = 0;
		int posY = 0;
		for (int i = 0; i < TAMANHO; i++) {
			for (int j = 0; j < TAMANHO; j++) {
				mapa.getGraphics().drawImage(tileSet, posX, posY,
						posX + tamanhoTileX, posY + tamanhoTileY,
						(matriz[i][j] % 3) * tamanhoTileX, 0,
						(matriz[i][j] % 3) * tamanhoTileX + tamanhoTileX,
						tamanhoTileY, null);
				posX += tamanhoTileX;
			}
			posY += tamanhoTileY;
			posX = 0;
		}
	}

	public BufferedImage getMapa() {
		return mapa;
	}

	public BufferedImage getSombra() {
		return sombra;
	}

	public static int[][] getMatriz() {
		return matriz;
	}

}
