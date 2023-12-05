package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class RadioButton2 {

	public static void main(String[] args) {

		RadioFrame2 radioFrame2 = new RadioFrame2();
	}

}

class RadioFrame2 extends JFrame{
	
	public RadioFrame2() {
		
		Toolkit screen = Toolkit.getDefaultToolkit();
		
		Dimension screenSize = screen.getScreenSize();
		
		int screenWidth = screenSize.width;
		
		int screenHeight = screenSize.height;
		
		setBounds(screenWidth/3, screenHeight/3, 600, 450);
		
		setVisible(true);
		
		setTitle("RadioButton");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		RadioPanel2 radioPanel2 = new RadioPanel2();
		
		add(radioPanel2);
		
	}
}

class RadioPanel2 extends JPanel{
	
	private JLabel text;
	
	private ButtonGroup myGroup = new ButtonGroup();
	
	JPanel RadioPanel = new JPanel();
	
	public RadioPanel2() {
		
		setLayout(new BorderLayout());
		
		text = new JLabel("EN UN LUGAR DE LA MANCHA DE CUYO NOMBRE NO QUIERO ACORDARME...", JLabel.CENTER);
		
		text.setFont(new Font("Little", Font.PLAIN, 12));
		
		add(text, BorderLayout.CENTER);		
		
		putButton("Small", true, 15);
		
		putButton("Medium", false, 20);
		
		putButton("Big", false, 25);
		
		putButton("Huge", false, 30);
		
		add(RadioPanel, BorderLayout.SOUTH);
		
	}	
	
	public void putButton(String name, boolean selection, int size) {
		
		JRadioButton radioButton = new JRadioButton(name, selection);		
		
		myGroup.add(radioButton);
		
		RadioPanel.add(radioButton);
		
		ActionListener myEvent = new ActionListener(){
			
		public void actionPerformed(ActionEvent e) {
			
			text.setFont(new Font("Little", Font.PLAIN, size));
			
		}
		
		};
		
		radioButton.addActionListener(myEvent);
	}

	}
		
	



