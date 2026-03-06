// A simple java program showing a demo of JRadio Button
// TODO use border layout 
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class JRadioButtonDemo extends JFrame{
	JRadioButton BirdButton;
	JRadioButton DogButton; 
	JRadioButton RabbitButton;
        JRadioButton CatButton;
	JRadioButton PigButton;

	JLabel label;

	ImageIcon bird;
	ImageIcon cat;
	ImageIcon dog;
	ImageIcon rabbit;
	ImageIcon pig;

	ButtonGroup G1;

	public JRadioButtonDemo() {
		this.setLayout(new BorderLayout());		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		// panels for the radio buttons placed on the left
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(5, 1, 10, 10));

		BirdButton = new JRadioButton("Bird");
		CatButton = new JRadioButton("Cat");
		DogButton = new JRadioButton("Dog");
		RabbitButton = new JRadioButton("Rabbit");		
		PigButton = new JRadioButton("Pig");

		G1 = new ButtonGroup();

		G1.add(BirdButton);
		G1.add(CatButton);
		G1.add(DogButton);
		G1.add(RabbitButton);
		G1.add(PigButton);

		// Add buttons to the side panel
		buttonPanel.add(BirdButton);
		buttonPanel.add(CatButton);
		buttonPanel.add(DogButton);
		buttonPanel.add(RabbitButton);
		buttonPanel.add(PigButton);

		
		// Initialize the label in the center
		label = new JLabel();
	
		label.setHorizontalAlignment(JLabel.CENTER);
		this.add(label, BorderLayout.CENTER);
		this.add(buttonPanel, BorderLayout.WEST);


		
		// Action Listeners with scaling
		BirdButton.addActionListener(e -> updateImage("../bird.png"));
		CatButton.addActionListener(e -> updateImage("../cat.png"));
		DogButton.addActionListener(e -> updateImage("../dog.png"));
		RabbitButton.addActionListener(e -> updateImage("../rabbit.png"));
		PigButton.addActionListener(e -> updateImage("../pig.png"));
	}

	// Helper to resize big images to fit the label
	private void updateImage(String path) {
		ImageIcon icon = new ImageIcon(path);
		// Scale to 300x300
		Image img = icon.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
		label.setIcon(new ImageIcon(img));
	}


	public static void main(String[] args) {
	JRadioButtonDemo f = new JRadioButtonDemo();

	f.setSize(600, 450);
	f.setTitle("JRadioButton Demo");
	f.setVisible(true);
	}
}
