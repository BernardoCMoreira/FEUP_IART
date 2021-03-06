import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
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
			this.board[1][1] = 1;		
			break;
			
		case 2:
			this.board=new int[4][4];
			this.board[0][0] = 1;
			this.board[3][3] = 2;
			break;
			
		case 3:
			this.board=new int[4][5];
			this.board[0][0] = 1;
			this.board[0][4] = 2;
			this.board[3][0] = 3;
			break;
			
		case 4:
			this.board = new int [3][6];
			this.board[0][0] = 1;
			this.board[2][0] = 4;
			this.board[0][3] = 2;
			this.board[1][2] = 2;
			this.board[2][3] = 2;
			this.board[0][5] = 3;
			this.board[1][4] = 3;
			this.board[2][5] = 3;
			
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
			
		case 7:
			this.board=new int[8][8];
			this.board[0][0] = 1;
			this.board[7][7] = 2;
			this.board[7][0] = 3;
			break;

		case 8:
			this.board=new int[8][6];
			this.board[0][3] = 1;
			this.board[0][4] = 1;
			this.board[0][5] = 1;
			this.board[1][5] = 1;
			this.board[6][0] = 2;
			this.board[7][0] = 2;
			this.board[7][1] = 2;
			this.board[7][2] = 2;
			this.board[2][3] = 3;
			this.board[5][3] = 4;
			break;
	
		case 9:
			this.board = new int [10][8];
			this.board[1][3] = 1;
			this.board[9][7] = 2;
			this.board[7][7] = 3;
			this.board[1][4] = 4;
			break;
		case 10:
			this.board=new int[8][8];
			this.board[2][2] = 1;
			this.board[4][5] = 2;
			this.board[5][1] = 3;

			break;
		case 11:
			this.board=new int[10][9];
			this.board[0][0] = 1;
			this.board[0][8] = 2;
			this.board[9][8] = 3;
			this.board[9][0] = 4;
			this.board[7][2] = 5;
			break;
		}
		
		
		board_sizeY = this.board.length;
		board_sizeX = this.board[0].length;
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
					g.setColor(chooseColor(board[j][i]));
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
		case 4:
			color = Color.ORANGE;
			break;
		case 5:
			color = Color.LIGHT_GRAY;
			break;
		case 6:
			color = Color.RED;
			break;
		case 7:
			color = Color.PINK;
			break;
		case 8:
			color = Color.YELLOW;
			break;
		case 9:
			color = Color.BLACK;
		}
		
		return color;
	}

	public int getLevel_sizeY() {
		return board_sizeY;
	}
	
	public int getLevel_sizeX() {
		return board_sizeX;
	}
	
	public int[][] get_board() {
		return this.board;
	}

	public int getBoardSize(){
		return this.board_sizeX * this.board_sizeY;
	}

	public void update_board(int[][] mat){
		this.board=mat;
	}
	
	public int getNumberPieces() {
		int numberPieces = 0;
		
		switch(this.num_level) {
			case 1:
				numberPieces=1;
				break;
			case 2:
				numberPieces=2;
				break;
			case 3:
				numberPieces=3;
				break;
			case 4:
				numberPieces=4;
				break;
			case 5:
				numberPieces=3;
				break;
			case 6:
				numberPieces=3;
				break;
			case 7:
				numberPieces=3;
				break;
			case 8:
				numberPieces=4;
				break;
			case 9:
				numberPieces = 4;
				break;
			case 10:
				numberPieces = 3;
				break;
			case 11:
				numberPieces = 5;
				break;			

		}
		return numberPieces;
	}

	public int getLevel(){
		return this.num_level;
	}

}

