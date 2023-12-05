package graficos;

import javax.swing.*;
import java.awt.event.*;

public class SeveralListeners {

	public static void main(String[] args) {

		Frame1 mainFrame = new Frame1();
		
	}

}

class Frame1 extends JFrame{
	
	public Frame1() {
		
		setVisible(true);
		
		setTitle("Main Frame");
		
		setBounds(400,250,500,300);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new Panel1());
		
	}
	
}

class Panel1 extends JPanel{
	
	public Panel1() {
		
		JButton newButton = new JButton("New Frame");
		
		closeButton = new JButton("Close all");
		
		add(newButton);
		
		add(closeButton);
		
		newButton.addActionListener(new ListenerFrame2());		
		
	}	
	
	JButton closeButton;
	
	class ListenerFrame2 implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			new Frame2(closeButton);
			
		}
		
	}
	
}



class Frame2 extends JFrame{
	
	private static int count = 0;
	
	public Frame2(JButton closebutton) {
		
		count++;
		
		setVisible(true);
		
		setBounds(50*count, 50*count, 300,200);
		
		setTitle("Secondary Frame " + count);
		
		closebutton.addActionListener(new CloseFrame2());
		
	}
	
	class CloseFrame2 implements ActionListener{
		
		
		public void actionPerformed(ActionEvent e) {
			
			dispose();
			
		}
		
	}
	
}