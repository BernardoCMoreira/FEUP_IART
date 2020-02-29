import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;
import javax.swing.Timer;

import Levels.Level1;

@SuppressWarnings("serial")
public class Game extends JPanel implements KeyListener, ActionListener {
	
	private Timer timer;
	
	public Game() {
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer = new Timer(8, this);
		timer.start();
		
	}
	
	public void paint(Graphics g) {
			
		//Paint background
		g.setColor(Color.black);
		g.fillRect(1,1,692,592);
		
		//Game Level
		new Level1(g);
			
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		timer.start();
		repaint();
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
