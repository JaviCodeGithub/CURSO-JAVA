package graficos;

import java.awt.Toolkit;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class TestActions {	
	
	public static void main(String [] args)	{
		
		ActionTestFrame frame1 = new ActionTestFrame();
		
	}
}

class ActionTestFrame extends JFrame{
	
	public ActionTestFrame() {
		
		setVisible(true);
		
		setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/3, Toolkit.getDefaultToolkit().getScreenSize().height/3,500,350);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new ActionPanelTest());
	}
		
}

class ActionPanelTest extends JPanel{
	
	public ActionPanelTest() {
		
		ActionAbstractTest blue = new ActionAbstractTest("Blue", new ImageIcon("src/graficos/azul.png"), Color.blue);
		
		ActionAbstractTest red = new ActionAbstractTest("Red", new ImageIcon("src/graficos/rojo.png"), Color.red);
		
		ActionAbstractTest yellow = new ActionAbstractTest("Yellow", new ImageIcon("src/graficos/amarillo.png"), Color.yellow);
		
		JButton blueButton = new JButton(blue);
		
		JButton redButton = new JButton(red);
		
		JButton yellowButton = new JButton(yellow);
		
		InputMap inputMap = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		
		inputMap.put(KeyStroke.getKeyStroke("ctrl Y"), "yellowbackground");
		
		inputMap.put(KeyStroke.getKeyStroke("ctrl B"), "bluebackground");
		
		inputMap.put(KeyStroke.getKeyStroke("ctrl R"), "redbackground");
		
		ActionMap actionMap = getActionMap();
		
		actionMap.put("yellowbackground", yellow);
		
		actionMap.put("redbackground", red);
		
		actionMap.put("bluebackground", blue);

		add(blueButton);
		
		add(redButton);
		
		add(yellowButton);
		
	}
	
	class ActionAbstractTest extends AbstractAction{
		
		private Color backGroundColor;
		
		public ActionAbstractTest(String name, ImageIcon icon, Color backgndColor) {
			
			putValue(Action.NAME, name);
			
			putValue(Action.SMALL_ICON, icon);
			
			putValue("backgroundColor", backgndColor);
			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			backGroundColor = (Color)getValue("backgroundColor");
			
			setBackground(backGroundColor);
			
		}
		
	}
	
}


