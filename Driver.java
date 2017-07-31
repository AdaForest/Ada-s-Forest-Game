package swingtutorial;

import javax.swing.*;

public class Driver {
	public static void main(String[] args){
		try{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch(Exception e){
			
		}
		
		
		JFrame frame = new JFrame("Swing Demo");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this closes the panel when I click the x
		frame.setSize(1000, 700); //sets the size of window
		frame.setVisible(true); //sets window visible
		MyCustomPanel MyCustomPanel = new MyCustomPanel();
		
		frame.add(MyCustomPanel);
		frame.remove(MyCustomPanel);
		frame.setVisible(true);
	}
}
