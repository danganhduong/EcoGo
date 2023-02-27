import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class WelcomePage
{
	JFrame frame = new JFrame();
	JLabel welcomeLabel = new JLabel("Welcome to EcoGo!");
	
	WelcomePage(String userUsername) {
		
		welcomeLabel.setBounds(0,0,500,35);
		welcomeLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		welcomeLabel.setText("Welcome to EcoGo" + " " + userUsername + "!");
		
		frame.add(welcomeLabel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(420, 420);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
