package HangmanGUI;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public  class option_Game extends JFrame implements ActionListener {
	
JFrame optionFrm=new JFrame();

	public option_Game() {
		optionFrm.setLayout(new FlowLayout());
		optionFrm.setSize(500,300);
		optionFrm.setTitle("Game Options");
		optionFrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		optionFrm.setVisible(true);
		optionFrm.setResizable(false);
		pack();
		// TODO Auto-generated constructor stub
	}

	
	
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

}
