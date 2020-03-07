

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Level extends JPanel{
	private int num_level;
	private int[][] board;
	private int board_sizeX;
	private int board_sizeY;
	
	public Level(int num_level) {
		this.num_level = num_level;
		initializeLevel(this.num_level);
	}
	
	public void initializeLevel(int num_level) {
		switch(num_level) {
		case 1:
			this.board=new int[4][4];
			this.board[0][0] = 1;
			
			break;
			
		case 2:
			this.board=new int[4][4];
			this.board[0][0] = 1;
			this.board[3][3] = 2;
			break;
			
		case 3:
			this.board=new int[4][8];
			this.board[0][0] = 1;
			this.board[0][1] = 1;
			break;
			
		case 4:
			this.board=new int[8][8];
			this.board[0][0] = 1;
			this.board[7][7] = 2;
			this.board[7][0] = 3;
			break;
			
		case 5:
			this.board=new int[8][8];
			this.board[0][0] = 1;
			this.board[0][1] = 1;
			this.board[7][7] = 2;
			this.board[7][0] = 3;
			break;
			
		case 6:
			this.board=new int[10][8];
			this.board[0][0] = 1;
			this.board[0][1] = 1;
			this.board[9][7] = 2;
			this.board[7][7] = 3;
			break;
		}
		
		board_sizeX = this.board.length;
		board_sizeY = this.board[0].length;
	}
	public void drawLevel(Graphics g) {
		int xS = 650/this.getLevel_sizeX();
		int yS = 550/this.getLevel_sizeY();
		int xE = 30/this.getLevel_sizeX();
		int yE = 30/this.getLevel_sizeY();
		int dimensionX = xS- xE;
		int dimensionY = yS -yE;
		
		for(int i=0; i<this.getLevel_sizeX(); i++) 
		{
			for(int j=0; j<this.getLevel_sizeY(); j++) 
			{		
					//draw pieces
					g.setColor(chooseColor(board[i][j]));
					g.fillRect(70+i*xS, 50+j*yS, dimensionX, dimensionY);
			}
		}
	}
	
	public Color chooseColor(int value) {
		Color color = null;
		
		switch(value) {
		case -1:
			color = Color.BLACK;
			break;
		case 0:
			color =  Color.WHITE;
			break;
		case 1:
			color = Color.CYAN;
			break;
		case 2:
			color = Color.MAGENTA;
			break;
		case 3:
			color = Color.GREEN;
			break;
		}
		
		return color;
	}

	public int getLevel_sizeY() {
		return board_sizeY;
	}
	public int getLevel_sizeX() {
		return board_sizeX;
	}
	
}