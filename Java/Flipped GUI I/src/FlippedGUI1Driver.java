import javax.swing.*;
	
public class FlippedGUI1Driver
{
	public static void main(String[] args) 
	{
		JFrame JFwindow = new JFrame("Lupoli’s Simple Calculator");
		JFwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                        // close window when someone hit’s "x"
			
		JFwindow.getContentPane().add(new FlippedGUI1()); 
                        // get’s Calc, and places it into THIS window/frame
		JFwindow.pack();
		JFwindow.setVisible(true);
	}
}
