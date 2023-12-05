package graficos;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CheckTest {

	public static void main(String[] args) {

		new CheckFrame();
		
	}

}

class CheckFrame extends JFrame{
	
	public CheckFrame() {
		
		setVisible(true);
		
		setTitle("Check Boxes");
		
		setBounds(500, 300, 600, 400);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		add(new CheckPanel());
	}
}

class CheckPanel extends JPanel{
	
	private JLabel text;
	
	private JCheckBox check1, check2;
	
	public CheckPanel() {
		
		setLayout(new BorderLayout());
		
		Font myFont = new Font("Little", Font.PLAIN, 20);
		
		text = new JLabel("EN  UN  LUGAR  DE  LA  MANCHA  DE  CUYO  NOMBRE  NO  QUIERO  ACORDARME...",JLabel.CENTER);
		
		text.setFont(myFont);
		
		JPanel textPanel = new JPanel();
		
		add(text, BorderLayout.CENTER);
		
		add(textPanel, BorderLayout.NORTH);		
		
		check1 = new JCheckBox("Bold");
		
		check2 = new JCheckBox("Italic");
		
		check1.addActionListener(new ManageCheck());
		
		check2.addActionListener(new ManageCheck());
		
		JPanel checkPanel = new JPanel();
		
		checkPanel.add(check1);
		
		checkPanel.add(check2);
		
		add(checkPanel, BorderLayout.SOUTH);
	}
	
	private class ManageCheck implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			int type=0;
			
			if(check1.isSelected()) type += Font.BOLD;
			
			if(check2.isSelected()) type += Font.ITALIC;
			
			text.setFont(new Font("Little", type, 20));
			
		}
			
		}
		
		
	}
