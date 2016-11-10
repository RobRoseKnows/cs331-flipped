import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; // for JOptionPane

public class FlippedGUI1 extends JPanel
{

	private JPanel controlPanel = new JPanel();
	// ADD YOUR GUI COMPONENTS HERE
	private JButton jbLeft = new JButton("LEFT");
	private JButton jbRight = new JButton("RIGHT");
	private JButton jbUp = new JButton("UP");
	private JButton jbStop = new JButton("STOP");
	private JButton jbDown = new JButton("DOWN");
	
	private JLabel jl1 = new JLabel("");
	private JLabel jl2 = new JLabel("");
	private JLabel jl3 = new JLabel("");
	private JLabel jl4 = new JLabel("");

	
	JPanel commRow = new JPanel();
	JPanel optionsRow = new JPanel();
	
	JPanel commPanel = new JPanel();
	JPanel colorPanel = new JPanel();
	
	JLabel commChannelLabel= new JLabel("Communication Channels");
	JRadioButton rbUHF = new JRadioButton("UHF");
	JRadioButton rbVHF = new JRadioButton("VHF");
	JRadioButton rbAM = new JRadioButton("AM");
	JRadioButton rbFM = new JRadioButton("FM");

	JLabel titleLabel= new JLabel("Color of Control Window");
	JRadioButton rbRed = new JRadioButton("Red");
	JRadioButton rbBlue = new JRadioButton("Blue");
	JRadioButton rbGreen = new JRadioButton("Green");	
	// ADD YOUR CONSTRUCTOR HERE
	
	FlippedGUI1() {
		this.commPanel.setLayout(new GridLayout(2,1));
		this.controlPanel.setLayout(new GridLayout(3,3));
		this.colorPanel.setLayout(new GridLayout(2,1));

		this.setLayout(new GridLayout(3,1));
		
		this.commPanel.add(commChannelLabel);
		this.commPanel.add(commRow);
		
		commRow.add(rbUHF);
		commRow.add(rbVHF);
		commRow.add(rbAM);
		commRow.add(rbFM);
		
		
		this.controlPanel.setBackground(Color.GRAY);
		
		this.controlPanel.add(jl1);
		this.controlPanel.add(jbUp);
		this.controlPanel.add(jl2);
		
		this.controlPanel.add(jbLeft);
		this.controlPanel.add(jbStop);
		this.controlPanel.add(jbRight);
		
		this.controlPanel.add(jl3);
		this.controlPanel.add(jbDown);
		this.controlPanel.add(jl4);
		
		
		this.setBackground(Color.CYAN);
		titleLabel.setForeground(Color.GREEN);	
		rbRed.setForeground(Color.RED);
		rbBlue.setForeground(Color.BLUE);
		rbGreen.setForeground(Color.GREEN);
		

		this.optionsRow.setLayout(new FlowLayout());
		this.colorPanel.add(titleLabel);
		this.colorPanel.add(optionsRow);
		
		optionsRow.add(rbRed);
		optionsRow.add(rbBlue);
		optionsRow.add(rbGreen);
				
		rbUHF.addActionListener(new ButtonListener());
		rbVHF.addActionListener(new ButtonListener());
		rbAM.addActionListener(new ButtonListener());
		rbFM.addActionListener(new ButtonListener());

		jbUp.addActionListener(new ButtonListener());
		jbLeft.addActionListener(new ButtonListener());
		jbStop.addActionListener(new ButtonListener());
		jbRight.addActionListener(new ButtonListener());
		jbDown.addActionListener(new ButtonListener());

		rbRed.addActionListener(new ButtonListener());
		rbBlue.addActionListener(new ButtonListener());
		rbGreen.addActionListener(new ButtonListener());

		this.add(commPanel);
		this.add(controlPanel);
		this.add(colorPanel);
	}

	// move the robot methods here
	private void move_left() { JOptionPane.showMessageDialog(null, "The robot is moving left"); }
	private void move_right() { JOptionPane.showMessageDialog(null, "The robot is moving right"); }
	private void move_up() { JOptionPane.showMessageDialog(null, "The robot is moving up"); }
	private void move_down() { JOptionPane.showMessageDialog(null, "The robot is moving down"); }
	private void move_stop() { JOptionPane.showMessageDialog(null, "The robot stopping"); }

	// communication with the robot
	void comm_UHF() { JOptionPane.showMessageDialog(null, "Use channel UHF"); }
	void comm_VHF() { JOptionPane.showMessageDialog(null, "Use channel VHF"); }
	void comm_AM() { JOptionPane.showMessageDialog(null, "Use channel AM"); }
	void comm_FM() { JOptionPane.showMessageDialog(null, "Use channel FM"); }

	// ADD YOUR ACTIONLISTENER HERE
	
	private class ButtonListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String actionCommand = e.getActionCommand();
			
			switch(actionCommand) {
				case "UP": 		
					move_up();
					break;
				case "LEFT": 	
					move_left();
					break;
				case "STOP":	
					move_stop();
					break;
				case "RIGHT":	
					move_right();
					break;
				case "DOWN":	
					move_down();
					break;
			case "UHF": 		
				comm_UHF();
				break;
			case "VHF": 	
				comm_VHF();
				break;
			case "AM":	
				comm_AM();
				break;
			case "FM":	
				comm_FM();
				break;
			case "Red": 	
				colorPanel.setBackground(Color.RED);
				break;
			case "Blue": 	
				colorPanel.setBackground(Color.BLUE);
				break;
			case "Green":
				colorPanel.setBackground(Color.GREEN);
				break;
			}
		}
		
	}
	
}
