import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.*; // for JOptionPane
import javax.swing.border.Border;

public class FlippedGUI2 extends JPanel
{

//	// ADD YOUR GUI COMPONENTS HERE
	/*
	private JPanel configGUI = new JPanel();
	private JPanel guiFlow = new JPanel();
	
	private JPanel configSoftware = new JPanel();
	private JPanel softwareFlow = new JPanel();
	
	private JPanel buttonPanel = new JPanel();
	private JPanel buttonFlow = new JPanel();
	
	private JButton configButton = new JButton("Configure");
	private JButton saveButton = new JButton("Save");
	private JButton relatedButton = new JButton("Related Software");
	private JButton quitButton = new JButton("Quit");

	// ADD YOUR CONSTRUCTOR HERE
	
	FlippedGUI2() {
		this.setPreferredSize(new Dimension(292, 209));
		
		this.setLayout(new GridLayout(3,1));
		
		configGUI.setLayout(new BorderLayout());
		configSoftware.setLayout(new BorderLayout());
		buttonPanel.setLayout(new BorderLayout());
				
		guiFlow.setLayout(new FlowLayout());
		configGUI.add(guiFlow, BorderLayout.CENTER);
		
		softwareFlow.setLayout(new FlowLayout());
		configSoftware.add(softwareFlow, BorderLayout.CENTER);
		
		buttonFlow.setLayout(new FlowLayout());
		buttonPanel.add(buttonFlow, BorderLayout.CENTER);
		
		
		guiFlow.add(configButton);
		guiFlow.add(saveButton);
		
		softwareFlow.add(relatedButton);
		
		buttonFlow.add(quitButton);
		
		
		Border blackline = BorderFactory.createLineBorder(Color.BLACK);
		Border titleGUI = BorderFactory.createTitledBorder(blackline, "Configure X-Bone GUI");
		
		Border titleSoftware = BorderFactory.createTitledBorder(blackline, "Configure Releated Software");
		
		configGUI.setBorder(titleGUI);
		configSoftware.setBorder(titleSoftware);
		
		this.add(configGUI);
		this.add(configSoftware);
		this.add(buttonPanel);
	}*/
	
	/*
	private JPanel formPanel = new JPanel();
	private JPanel buttonsPanel = new JPanel();
	
	private JButton onlineButton = new JButton("Players Online");
	private JButton adminButton = new JButton("Make Admin");
	private JButton modButton = new JButton("Make Mod");
	private JButton yellButton = new JButton("Yell");
	private JButton namesButton = new JButton("Names of All Players Online");
	private JButton kickButton = new JButton("Kick All Online Users");

	private JLabel onlineLabel = new JLabel("0 players online");
	
	private JTextField adminBox = new JTextField();
	private JTextField modBox = new JTextField();
	private JTextField yellBox = new JTextField();
	
	FlippedGUI2() {
		this.setPreferredSize(new Dimension(275, 263));
		this.setLayout(new FlowLayout());
		
		formPanel.setLayout(new GridLayout(4,2, 10, 5));
		buttonsPanel.setLayout(new GridLayout(2,1));
		
		formPanel.add(onlineButton);
		formPanel.add(onlineLabel);
		formPanel.add(adminButton);
		formPanel.add(adminBox);
		formPanel.add(modButton);
		formPanel.add(modBox);
		formPanel.add(yellButton);
		formPanel.add(yellBox);
		
		this.add(formPanel);
		
		buttonsPanel.add(namesButton);
		buttonsPanel.add(kickButton);
		
		this.add(buttonsPanel);
	}*/

	
	private JPanel topRow = new JPanel();
	private JPanel bottomRow = new JPanel();
	private JPanel onOffGrid = new JPanel();
	
	private JLabel imageLabel = new JLabel();
	
	private final ImageIcon akerLeftIcon = new ImageIcon("AkerLeftIcon.png"); 
	private final ImageIcon akerAbout = new ImageIcon("AkerStar.png"); 
	private final ImageIcon akerPref = new ImageIcon("AkerTools.png"); 
	private final ImageIcon akerOk = new ImageIcon("AkerCheck.png"); 
	
	
	
	private JLabel bluetoothLabel = new JLabel("Bluetooth Radio:");
	private JLabel wirelessLabel = new JLabel("Wireless Radio:");
	
	private JButton onBlueButton = new JButton("On");
	private JButton offBlueButton = new JButton("Off");
	private JButton onWirelessButton = new JButton("On");
	private JButton offWirelessButton = new JButton("Off");
	
	private JButton aboutButton = new JButton("About");
	private JButton prefButton = new JButton("Preferences");
	private JButton okButton = new JButton("Ok");
	
	FlippedGUI2() {
		this.setPreferredSize(new Dimension(400, 181));
		
		this.setLayout(new GridLayout(2,1));
		
		topRow.setLayout(new FlowLayout());
		bottomRow.setLayout(new FlowLayout());
		onOffGrid.setLayout(new GridLayout(2,3,10,5));
		
		aboutButton.setMargin(new Insets(10, 10, 10, 10));
		prefButton.setMargin(new Insets(10, 10, 10, 10));
		okButton.setMargin(new Insets(10, 10, 10, 10));
		
		imageLabel.setIcon(akerLeftIcon);
		aboutButton.setIcon(akerAbout);
		prefButton.setIcon(akerPref);
		okButton.setIcon(akerOk);
		
		onOffGrid.add(bluetoothLabel);
		onOffGrid.add(onBlueButton);
		onOffGrid.add(offBlueButton);
		onOffGrid.add(wirelessLabel);
		onOffGrid.add(onWirelessButton);
		onOffGrid.add(offWirelessButton);
		
		bottomRow.add(aboutButton);
		bottomRow.add(prefButton);
		bottomRow.add(okButton);
		
		topRow.add(imageLabel);
		topRow.add(onOffGrid);
		
		this.add(topRow);
		this.add(bottomRow);
	}
	
	// ADD YOUR ACTIONLISTENER HERE
}
