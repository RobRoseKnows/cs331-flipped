import javax.swing.*;
	
public class FlippedGUI2Driver
{
	public static void main(String[] args) 
	{
		JFrame JFwindow = new JFrame("Willscape GUI");
		JFwindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
                        // close window when someone hit’s "x"
			
		JFwindow.getContentPane().add(new FlippedGUI2()); 
                        // get’s Calc, and places it into THIS window/frame
		JFwindow.pack();
		JFwindow.setVisible(true);
	}
}
