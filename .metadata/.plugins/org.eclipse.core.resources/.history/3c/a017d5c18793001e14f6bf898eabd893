package inicio;

import java.awt.*;
import java.awt.event.*;
import java.awt.*;

import javax.swing.*;

public class AreaTests {

	public static void main(String[] args) {

		TestFrameArea areaFrame = new TestFrameArea();
		
	}

}

class TestFrameArea extends JFrame{
	
	private JPanel buttonsPanel;
	
	private JButton insert;
	
	private JButton lineBreak;
	
	private JTextArea textArea;
	
	private JScrollPane scrollArea;
	
	private int times = 1;
	
	public TestFrameArea() {
		
		setLayout(new BorderLayout());
		
		setTitle("Testing Test Area");
		
		Toolkit myScreen = Toolkit.getDefaultToolkit();
		
		Dimension Screen = myScreen.getScreenSize();
		
		int screenWidth = Screen.width;
		
		int screenHeight = Screen.height;
		
		setBounds(screenWidth/3, screenHeight/3, 600, 400);
		
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		buttonsPanel = new JPanel();
		
		add(buttonsPanel, BorderLayout.SOUTH);
		
		textArea = new JTextArea(10, 20);
		
		scrollArea = new JScrollPane(textArea);
		
		add(scrollArea);
		
		insert = new JButton("Insert");
		
		lineBreak = new JButton("Line Break");
		
		insert.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
								
				textArea.append(times + " In a place in La Mancha whose name I don't want to remember... ");
				
				times++;
			}
		});
				
		buttonsPanel.add(insert);
		
		lineBreak.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				boolean breakLine =! textArea.getLineWrap();
				
				textArea.setLineWrap(breakLine);
				
				/*if(breakLine) {
					
					lineBreak.setText("No Line Break");
				}else {
					
					lineBreak.setText("Line Break");
				}*/
				
				lineBreak.setText(breakLine ? "No Line Break" : "Line Break");
			}
		});
		
		buttonsPanel.add(lineBreak);
		
	}
}
