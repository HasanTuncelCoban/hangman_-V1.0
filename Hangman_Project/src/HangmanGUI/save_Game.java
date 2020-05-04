package HangmanGUI;
//import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
//import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;



public class save_Game extends JFrame implements ActionListener{

	/**
	 * 
	 */
	

	public save_Game() {
		// TODO Auto-generated method stub
		//JButton save=new JButton();
		JFileChooser fileCH=new JFileChooser();
		int userSelection = fileCH.showSaveDialog(null);
		fileCH.setCurrentDirectory(new java.io.File("src/HangmanGUI/resource"));
		fileCH.setDialogTitle("Save Game");
		fileCH.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		if (userSelection == JFileChooser.APPROVE_OPTION) {
		    File fileToSave = fileCH.getSelectedFile();
    System.out.println("Save as file: " + fileToSave.getAbsolutePath());
}
		pack();
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	

}
