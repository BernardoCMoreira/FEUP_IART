import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		JFrame obj = new JFrame();
		obj.setBounds(10, 10, 700, 600);
		Game game = new Game();
		obj.setTitle("Folding Blocks");
		obj.setResizable(false);	
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		obj.add(game);
		obj.setVisible(true);
	}
}
