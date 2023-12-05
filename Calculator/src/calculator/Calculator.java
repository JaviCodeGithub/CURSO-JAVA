package calculator;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.LineBorder;



public class Calculator {
	public static void main(String[] args) {

		CalcFrame3 calcFrame = new CalcFrame3();
		
		//probando cagandome en el chat gpt
		
		/*String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		String selectedFont = "Comic Sans MS";
		
		boolean existe = true;
		
		for(String font : fonts) {
			
			System.out.println(font);
		}
		
		for(int i=0; i<fonts.length; i++) {
			
			if (selectedFont.equalsIgnoreCase(fonts[i])) {
				
				existe=true;
				
				break;
				
			}else {
				existe=false;
			}
		}
		
		if(existe==true) {
			
			JOptionPane.showMessageDialog(null, "La fuente seleccionada esta disponible");
		}
		if(existe==false){
			
			JOptionPane.showMessageDialog(null, "La fuente seleccionada NO esta disponible");
		}*/
	}

}
class CalcFrame3 extends JFrame{
	
	public CalcFrame3()	{		
		
		Toolkit screen = Toolkit.getDefaultToolkit();
		
		Dimension screenSize = screen.getScreenSize();
		
		int screenWidth = screenSize.width;
		
		int screenHeight = screenSize.height;
		
		setBounds(screenWidth/3, screenHeight/3, 350, 500);
		
		setVisible(true);
		
		setTitle("CALCULATOR");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new CalcPanel2());
		
		Image icon = Toolkit.getDefaultToolkit().getImage("src/calculator/calculator.png");
		
		setIconImage(icon);
	}
}

class CalcPanel2 extends JPanel{
	
	JPanel panel2;
	
	JButton screenButton;
	
	 JButton button2;
	 
	 String lastOperation = "=";
	
	private boolean count=false;
	
	private double result;
	
	Font font;
	
	Font font2;
	
	private LineBorder lineBorder;
	
	public CalcPanel2() {
		
		ButtonAct buttonAct = new ButtonAct();
		
		ButtonOpAct buttonOpAct = new ButtonOpAct();
		
		setLayout(new BorderLayout());
		
		screenButton = new JButton("0");
		
		screenButton.setBackground(new Color(247, 133, 72));

		UIManager.put("Button.disabledText", java.awt.Color.BLACK);		//CAMBIAR EL COLOR DE LOS BOTONES DESABILITADOS

		lineBorder = new LineBorder(Color.GRAY, 3);
		
		screenButton.setBorder(lineBorder);
		
		font = new Font("Comic Sans MS", Font.BOLD, 18);	
		
		font2 = new Font("Comic Sans MS", Font.BOLD, 22);	
		
		screenButton.setFont(font2);
		
		screenButton.setEnabled(false);
		
		add(screenButton, BorderLayout.NORTH);
		
		panel2 = new JPanel();
		
		panel2.setLayout(new GridLayout(4,4));
		
		String[] buttons2 = {
			"1","2","3","+","4","5","6","-","7","8","9",".","x","÷","=","C"
		};
		
		for(int i=0; i<3; i++) {
			
			putButton2(buttons2[i], buttonAct, new Color(87, 175, 242));
			
			
		}
		
		putButton2(buttons2[3],buttonOpAct, new Color(58, 199, 107));
		
		for(int i=4; i<7; i++) {
			
			putButton2(buttons2[i], buttonAct, new Color(87, 175, 242));
		}
		
		putButton2(buttons2[7],buttonOpAct, new Color(58, 199, 107));
		
		for(int i=8; i<11; i++) {
			
			putButton2(buttons2[i], buttonAct, new Color(87, 175, 242));
		}
		
		putButton2(buttons2[11], buttonAct, new Color(58, 199, 107));
		
		for(int i=12; i<14; i++) {
			
			putButton2(buttons2[i], buttonOpAct, new Color(58, 199, 107));
		}
		
		putButton2(buttons2[14], buttonOpAct, new Color(242, 220, 92));
		
		putButton2(buttons2[15], new ButtonC(), new Color(207, 27, 45));
		
		add(panel2, BorderLayout.CENTER);
	}
	
	private void putButton2(String b, ActionListener al, Color color) {
		
		button2 = new JButton(b);
		
		panel2.add(button2);
		
		button2.addActionListener(al);
		
		button2.setBackground(color);
		
		button2.setFont(font);
		
		button2.setBorder(new LineBorder(Color.GRAY, 2));
		
		
	}
	
	private class ButtonAct implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			String pressedButton = e.getActionCommand();
			
			if(count==false) {
				
				screenButton.setText("");
				
				count = true;
			}
			
			screenButton.setText(screenButton.getText()+pressedButton);
		}
	}
	
	private class ButtonC implements ActionListener{
	
		public void actionPerformed(ActionEvent e) {
			
			result=0;
			
			screenButton.setText(""+0);
	}
	}
	
	private class ButtonOpAct implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			count=false;
			
			calculation(Double.parseDouble(screenButton.getText()));
			
			lastOperation = e.getActionCommand();					
			
			screenButton.setText(""+result);		
			
		}
		
		private void calculation(double x) {
			
			if(lastOperation == "=") {
				
				result=x;
			}
			
			if(lastOperation == "+") {
				
				result+=x;
			}
			
			if(lastOperation == "-") {
				
				result-=x;
			}
			
			if(lastOperation == "x") {
				
				result*=x;
			}
			
			if(lastOperation == "÷") {
				
				result/=x;
			}
			
		}
			
			
		}
		
		
	}
	
	




