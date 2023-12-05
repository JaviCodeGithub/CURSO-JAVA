package graficos;

import java.awt.*;

import javax.swing.*;
import javax.swing.event.*;

public class Slider2 {

	public static void main(String[] args) {

		SliderFrame2 sliderFrame2 = new SliderFrame2();
	}

}

class SliderFrame2 extends JFrame{
	
	public SliderFrame2() {
		
		setTitle("Slider 2");
		
		setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/4, Toolkit.getDefaultToolkit().getScreenSize().height/4,600,450);
		
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new SliderPanel2());
	}
}

class SliderPanel2 extends JPanel{
	
	private JLabel rotulo;
	
	JSlider control;
	
	private static int contador;
	
	public SliderPanel2() {
		
		setLayout(new BorderLayout());
		
		rotulo = new JLabel("IN A PLACE IN LA MANCHA WHOSE NAME I DON'T WANT TO REMEMBER...", JLabel.CENTER);
		
		add(rotulo, BorderLayout.CENTER);
		
		control = new JSlider(10,50,10);
		
		control.setMajorTickSpacing(10);
		
		control.setMinorTickSpacing(5);
		
		control.setPaintTicks(true);
		
		control.setPaintLabels(true);
		
		control.setFont(new Font("Little", Font.ITALIC, 15));
		
		control.setSnapToTicks(true);
		
		JPanel panel2 = new JPanel();
		
		add(panel2, BorderLayout.NORTH);
		
		panel2.add(control);
		
		control.addChangeListener(new ChangeListener() {
			
			public void stateChanged(ChangeEvent e) {				
				
				rotulo.setFont(new Font("Little", Font.ITALIC, control.getValue()));
			}
		});
	}
	
	
}