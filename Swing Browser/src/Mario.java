import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


import javax.swing.*;
public class Mario {
	public static void main(String[] args) {
		JEditorPane browserPane = new JEditorPane();
		JEditorPane browserPane2 = new JEditorPane();
		JEditorPane fullbrowser = new JEditorPane();
		JEditorPane fullbrowser2 = new JEditorPane();
		JTextField textArea = new JTextField();
		JTextField textArea2 = new JTextField();
		JTabbedPane tabbedPane = new JTabbedPane();
		
		
		textArea.setBounds(1, 1, 400, 25);
		browserPane.setBounds(5, 60, 1190, 850);
		
		
		fullbrowser.setLayout(null);
		String gu = "http://graceland.brightspace.com";
		browserPane2.setBounds(5, 60, 1190, 850);
		try {
			  browserPane2.setPage(gu);
			}catch (IOException e1) {
				System.out.println("error loading page");
			} 
		JButton button = new JButton("Enter");
		JButton button2 = new JButton("Back");
		button.setBounds(410, 1, 150, 20);
		button2.setBounds(600, 1, 150, 20);
		
		button.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) { 
				String backLink = textArea.getText();
				try {
					  browserPane.setPage(textArea.getText());
					}catch (IOException e1) {
						System.out.println("error loading page");
					} 
				button2.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) { 
						
						try {
							  browserPane.setPage(backLink);
							}catch (IOException e1) {
								System.out.println("error loading page");
							} 
					}
				});
				
			}
		});
		
		
		textArea2.setBounds(1, 1, 400, 25);
		browserPane2.setBounds(5, 60, 1190, 850);
		
		
		fullbrowser2.setLayout(null);
		
		browserPane2.setBounds(5, 60, 1190, 850);
		
		JButton enter = new JButton("Enter");
		JButton back = new JButton("Back");
		enter.setBounds(410, 1, 150, 20);
		back.setBounds(600, 1, 150, 20);
		
		enter.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) { 
				String backLink2 = textArea.getText();
				try {
					  browserPane2.setPage(textArea.getText());
					}catch (IOException e1) {
						System.out.println("error loading page");
					} 
				back.addActionListener(new ActionListener(){
					public void actionPerformed(ActionEvent e) { 
						
						try {
							  browserPane2.setPage(backLink2);
							}catch (IOException e1) {
								System.out.println("error loading page");
							} 
					}
				});
				
			}
		});
		fullbrowser.add(browserPane);
		fullbrowser.add(textArea);
		fullbrowser.add(button);
		fullbrowser.add(button2);
		
		fullbrowser2.add(browserPane2);
		fullbrowser2.add(textArea2);
		fullbrowser2.add(enter);
		fullbrowser2.add(back);
		tabbedPane.addTab("Tab 1", null, fullbrowser,
                "Does nothing");
		tabbedPane.addTab("Tab 2", null, fullbrowser2,
                "Does nothing");
		JFrame browserWindow = new JFrame("Grant's Web Browser");
		textArea.setVisible(true);
		
		browserWindow.add(tabbedPane);
		browserWindow.setSize(1200,900);
		browserWindow.setVisible(true);
		browserWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		}

}
