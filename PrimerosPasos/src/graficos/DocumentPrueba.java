package graficos;

import java.awt.*; 
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.Document;

public class DocumentPrueba {

	public static void main(String[] args) {
		
		DocFrame docFrame = new DocFrame();
		
		docFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class DocFrame extends JFrame{
	
	public DocFrame() {
		
		setBounds(450, 300, 650, 400);
		
		setVisible(true);
		
		setTitle("Document Test");
		
		DocPanel docpanel =new DocPanel();
		
		add(docpanel);
		
	}
	
}

class DocPanel extends JPanel{
	
	private JTextField myfield;
	
	TextListen textListen = new TextListen();
	
	public DocPanel() {
				
		myfield = new JTextField(20);
		
		add(myfield);
		
		Document myFieldDoc = myfield.getDocument();
		
		myFieldDoc.addDocumentListener(textListen);
		
	}
	
	private class TextListen implements DocumentListener{

			public void removeUpdate(DocumentEvent e) {
				
				System.out.println("Has Borrado Texto");
			}

			
			public void insertUpdate(DocumentEvent e) {

				System.out.println("Has Introducido Texto");
			}

			
			public void changedUpdate(DocumentEvent e) {

				
			}
		
	}
}
