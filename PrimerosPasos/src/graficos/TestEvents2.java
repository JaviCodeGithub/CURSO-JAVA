package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestEvents2 {

	public static void main(String[] args) {

		MyFrame frame1 = new MyFrame();
		
	}
	
}
	
class MyFrame extends JFrame{
		
		public MyFrame() {
			
			setTitle("Test Events 2");
			
			Toolkit myScreen = Toolkit.getDefaultToolkit();
			
			Dimension screenSize = myScreen.getScreenSize();
			
			int screenWidth = screenSize.width;
			
			int screenHeigth = screenSize.height;
			
			setBounds(screenWidth/3+100, screenHeigth/3+50, 500, 300);
			
			setVisible(true);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			MyPanel Panel1 = new MyPanel();
			
			add(Panel1);
			
		}
		
	}

class MyPanel extends JPanel{
	
	JButton redButton = new JButton("Rojo");
	
	JButton yellowButton = new JButton("Amarillo");
	
	JButton whiteButton = new JButton("Blanco");
	
	public MyPanel(){
		
		add(redButton);
		
		add(yellowButton); 
		
		add(whiteButton);
		
		BackColor red = new BackColor(Color.red);
		
		BackColor yellow = new BackColor(Color.yellow);
		
		BackColor white = new BackColor(Color.white);
		
		redButton.addActionListener(red);
		
		yellowButton.addActionListener(yellow);
		
		whiteButton.addActionListener(white);
		
	}
	
	private class BackColor implements ActionListener{
		
		private Color backColor;
		
		public BackColor(Color c) {
			
			backColor = c;
			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			setBackground(backColor);
			
		}
		
	}
	
}


