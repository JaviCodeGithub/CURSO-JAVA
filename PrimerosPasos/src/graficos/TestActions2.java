package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class TestActions2 {

	public static void main(String[] args) {
		
		ActTestFrame myframe = new ActTestFrame();

	}

}

class ActTestFrame extends JFrame{
	
	public ActTestFrame() {
		
		setBounds(500,300,600,450);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new ActTestPanel());
	}
	
}

class ActTestPanel extends JPanel{
	
	JButton redButton;
	
	JButton blueButton;
	
	JButton yellowButton;
	
	
	
	public ActTestPanel() {
		
		AbstAct red = new AbstAct("Red", new ImageIcon("src/graficos/rojo.png"), Color.red);
		
		AbstAct yellow = new AbstAct("Yellow", new ImageIcon("src/graficos/amarillo.png"), Color.yellow);
		
		AbstAct blue = new AbstAct("Blue", new ImageIcon("src/graficos/azul.png"), Color.blue);
		
		
		
		redButton = new JButton(red);
		
		yellowButton = new JButton(yellow);
		
		blueButton = new JButton(blue);
		
		add(redButton);
		
		add(yellowButton);
		
		add(blueButton);
		
		InputMap inputMap = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		ActionMap actionMap = getActionMap();
		
		inputMap.put(KeyStroke.getKeyStroke("ctrl R"), "backgroundRed");
		
		actionMap.put("backgroundRed", red);
		
		inputMap.put(KeyStroke.getKeyStroke("ctrl Y"), "yellowBackground");
		
		actionMap.put("yellowBackground", yellow);
		
		inputMap.put(KeyStroke.getKeyStroke("ctrl B"), "blueBackground");
		
		actionMap.put("blueBackground", blue);		
		
		
	}
	


class AbstAct extends AbstractAction{
	
	Color backColor;

	public AbstAct(String name, ImageIcon image, Color color ) {
		
		putValue(Action.NAME, name);
		
		putValue(Action.SMALL_ICON, image);
		
		putValue(Action.SHORT_DESCRIPTION, "Cambia el fondo a " + name);
		
		putValue("backgroundColor", color);
		
	}
	
	public void actionPerformed(ActionEvent e) {

		backColor = (Color)getValue("backgroundColor");
		
		setBackground(backColor);
	}
	
}
}
