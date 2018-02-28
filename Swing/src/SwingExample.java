import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class SwingExample {

	public static void main(String[] args) {

		
		JEditorPane browserPane = new JEditorPane();
		browserPane.setEditable(false);   

		try {
		  browserPane.setPage("http://graceland.brightspace.com");
		}catch (IOException e) {
			System.out.println("error loading page");
		} 

		JFrame browserWindow = new JFrame("Grant's Web Browser");
		browserWindow.add(browserPane);
		browserWindow.setSize(1200,900);
		browserWindow.setVisible(true);}
	

}
