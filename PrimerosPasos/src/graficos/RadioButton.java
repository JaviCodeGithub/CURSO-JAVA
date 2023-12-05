package graficos;

import java.awt.*;

import javax.swing.*;

public class RadioButton {

	public static void main(String[] args) {

		RadioFrame radioFrame = new RadioFrame();
		
		
	}

}

class RadioFrame extends JFrame{
	
	public RadioFrame() {
		
		Toolkit screen = Toolkit.getDefaultToolkit();
		
		Dimension screenSize = screen.getScreenSize();
		
		int screenWidth = screenSize.width;
		
		int screenHeight = screenSize.height;
		
		setBounds(screenWidth/3, screenHeight/3, 600, 450);
		
		setVisible(true);
		
		setTitle("RadioButton");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		RadioPanel radioPanel = new RadioPanel();
		
		add(radioPanel);
		
	}
}

class RadioPanel extends JPanel{
	
	public RadioPanel() {
		
		ButtonGroup group = new ButtonGroup();
		
		ButtonGroup group2 = new ButtonGroup();
		
		JRadioButton button1 = new JRadioButton("Blue", false);
		
		JRadioButton button2 = new JRadioButton("Red", false);
		
		JRadioButton button3 = new JRadioButton("Green", false);
		
		JRadioButton button4 = new JRadioButton("Man", false);
		
		JRadioButton button5 = new JRadioButton("Woman", false);
		
		group.add(button1);
		
		group.add(button2);
		
		group.add(button3);
		
		group2.add(button4);
		
		group2.add(button5);
		
		add(button1);
		
		add(button2);
		
		add(button3);
		
		add(button4);
		
		add(button5);
		
		
	}
}