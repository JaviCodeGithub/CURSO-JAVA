package graficos;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ComboBox {

	public static void main(String[] args) {

		ComboFrame comboFrame = new ComboFrame();
		
		String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		Boolean exist=false;
		
		for (String font: fonts) {
			
			System.out.println(font);
			
			if(font.equalsIgnoreCase("Playpen Sans")) {
				
				exist=true;
				
			}
			
		};
		
		if(exist) {
			
			JOptionPane.showMessageDialog(null, "The font is available");
		}else {
			
			JOptionPane.showMessageDialog(null,  "The font is NOT available");
		}
		
		
	}

}

class ComboFrame extends JFrame{
	
	public ComboFrame() {
		
		Toolkit screen = Toolkit.getDefaultToolkit();
		
		Dimension screenSize = screen.getScreenSize();
		
		int screenWidth = screenSize.width;
		
		int screenHeight = screenSize.height;
		
		setBounds(screenWidth/3, screenHeight/3, 600, 450);
		
		setTitle("ComboBox");
		
		setVisible(true);
		
		add(new ComboPanel());
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

class ComboPanel extends JPanel{
	
	private JComboBox myCombo;
	
	private JLabel text;
	
	public ComboPanel() {
		
		setLayout(new BorderLayout());
		
		text = new JLabel("EN UN LUGAR DE LA MANCHA DE CUYO NOMBRE NO QUIERO ACORDARME...", JLabel.CENTER);
		
		text.setFont(new Font("Verdana", Font.PLAIN, 18));
		
		add(text, BorderLayout.CENTER);
		
		JPanel northPanel = new JPanel();
		
		add(northPanel, BorderLayout.NORTH);
		
		myCombo = new JComboBox();
		
		myCombo.setEditable(true);
		
		myCombo.addItem("Serif");
		
		myCombo.addItem("Wide Latin");
		
		myCombo.addItem("Playbill");
		
		myCombo.addItem("Vivaldi");
		
		northPanel.add(myCombo);
		
		myCombo.addActionListener(new ActionListener() {
				
			public void actionPerformed(ActionEvent e) {

				text.setFont(new Font((String)myCombo.getSelectedItem(), Font.PLAIN, 18));			
			}
		});
		
		
	}
}
