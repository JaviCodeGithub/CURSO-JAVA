package graficos;


import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculator {

	public static void main(String[] args) {

		CalcFrame calcFrame = new CalcFrame();
		
		calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class CalcFrame extends JFrame{
	
	public CalcFrame() {
		
		setTitle("Calculator");
		
		setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/3, Toolkit.getDefaultToolkit().getScreenSize().height/3, 600, 450);
		
		setVisible(true);
		
		add(new CalcPanel());
		
		Image icon = Toolkit.getDefaultToolkit().getImage("src/graficos/calculator.png");
		
		setIconImage(icon);
		
	}
	
}
	
	class CalcPanel extends JPanel{
		
		JButton entry = new JButton("0");
		
		JPanel calcPanel2 = new JPanel();
		
		private String lastOp = "=";
		
		private double result;
		
		ActionListener listener = new ButtonList();
		
		ActionListener opListener = new OpButton();
		
		private boolean begining=true;
		
		public CalcPanel()	{
			
			setLayout(new BorderLayout());
			
			add(entry, BorderLayout.NORTH);
			
			entry.setEnabled(false);
			
			add(calcPanel2);
			
			calcPanel2.setLayout(new GridLayout(4,4));
			
		
		
		final String[] buttons= {
				
				"1","2","3","4","5","6","7","8","9","0","."
				
		};
		
		final String [] OpButtons = {
			
				"-","x","+","/","="
				
		};
		
		for(String butt: buttons) {
			
			putButton(butt, listener);
			
		}
		
		for(String OpButt: OpButtons) {
			
			putButton(OpButt, opListener);
			
		}
		
	}
		
		private void putButton(String b, ActionListener al) {
			
			JButton button = new JButton(b);
			
			calcPanel2.add(button);
			
			button.addActionListener(al);
			
		}
		
	
		
		class ButtonList implements ActionListener{
			
			public void actionPerformed(ActionEvent e) {
				
				String buttonPressed = e.getActionCommand();
				
				if(begining) {
					
					entry.setText("");
					
					begining=false;
					
				}
				
				entry.setText(entry.getText()+buttonPressed);
				
			}
			
		}
		
		class OpButton implements ActionListener{
			
			public void actionPerformed(ActionEvent e){
				
				String operation = e.getActionCommand();
				
				begining = true;
				
				calc(Double.parseDouble(entry.getText()));
				
				lastOp = operation;
				
			}
			
		}
		
		private void calc(double x) {
			
			if(lastOp.equals("+")) {
				
				result+=x;
				
			}
			
			else if(lastOp.equals("-")) {
				
				result-=x;
				
			}
			
			else if(lastOp.equals("x")) {
				
				result*=x;
			}
			
			else if(lastOp.equals("/")) {
				
				result/=x;
			}
			
			else if(lastOp.equals("=")) {
				
				result=x;
			}
			
			entry.setText("" + result);
			
		}
	
}
	
	
