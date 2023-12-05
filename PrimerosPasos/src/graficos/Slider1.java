package graficos;


import java.awt.*;

import javax.swing.*;

public class Slider1 {

	public static void main(String[] args) {

		SliderFrame sliderFrame = new SliderFrame();
	}

}

class SliderFrame extends JFrame{
	
	public SliderFrame() {
		
		setVisible(true);
		
		setBounds(Toolkit.getDefaultToolkit().getScreenSize().width/4, Toolkit.getDefaultToolkit().getScreenSize().height/4, 600, 450);
		
		setTitle("JSlider1");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new SliderPanel());
	}
}

class SliderPanel extends JPanel{
	
	public SliderPanel() {
		
		JSlider control = new JSlider(/*SwingConstants.VERTICAL,*/0,100,75);
		
		//control.setOrientation(JSlider.VERTICAL);
		
		control.setMajorTickSpacing(25);
		
		control.setMinorTickSpacing(8);
		
		control.setPaintTicks(true);
		
		control.setFont(new Font("Little", Font.BOLD, 14));
		
		control.setPaintLabels(true);
		
		control.setSnapToTicks(true);
		
		add(control);
	}
}
