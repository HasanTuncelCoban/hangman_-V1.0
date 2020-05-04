package HangmanGUI;
//import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;  
public class open_Game  extends JFrame implements ActionListener{
	/**
	 * 
	 */
	public open_Game(){
		// TODO Auto-generated method stub
		JButton open=new JButton();
		JFileChooser fileCH=new JFileChooser();
		fileCH.setCurrentDirectory(new java.io.File("src/HangmanGUI/resource"));
		fileCH.setDialogTitle("New Game");
		fileCH.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		if(fileCH.showOpenDialog(open)== JFileChooser.APPROVE_OPTION) {
			
		}
		System.out.println("You Chose"+fileCH.getSelectedFile().getAbsolutePath());
		pack();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	

}
