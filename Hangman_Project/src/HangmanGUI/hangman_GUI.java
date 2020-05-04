package HangmanGUI;

import java.awt.FlowLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class hangman_GUI extends JFrame  {
	
	JFrame form= new JFrame();
	JButton a = new JButton("A");
    JButton b = new JButton("B");
    JButton c = new JButton("C");
    JButton d = new JButton("D");
    JButton e = new JButton("E");
    JButton f = new JButton("F");
    JButton g = new JButton("G");
    JButton h = new JButton("H");
    JButton ý = new JButton("I");
    JButton j = new JButton("J");
    JButton k = new JButton("K");
    JButton l = new JButton("L");
    JButton m = new JButton("M");
    JButton n = new JButton("N");
    JButton o = new JButton("O");
    JButton p = new JButton("P");
    JButton q = new JButton("Q");
    JButton r = new JButton("R");
    JButton s = new JButton("S");
    JButton t = new JButton("T");
    JButton u = new JButton("U");
    JButton v = new JButton("V");
    JButton w = new JButton("W");
    JButton x = new JButton("X");
    JButton y = new JButton("Y");
    JButton z = new JButton("Z");
    JLabel chancecontainer = new JLabel("New label");
    FlowLayout fllw=new FlowLayout();
    JMenuBar menuBAR = new JMenuBar();
    JMenu files = new JMenu("Files");
    JMenuItem newgame = new JMenuItem("New Game");
    JMenuItem loadgame = new JMenuItem("Load Game");
    JMenuItem savegame = new JMenuItem("Save Game");
    JMenuItem exit = new JMenuItem("Exit");
    JMenu optionmenu = new JMenu("Options");
    JMenuItem options = new JMenuItem("Options");
    JButton guessBTN = new JButton("Guess");
    
    JPanel panel=new JPanel();
    JPanel panelin=new JPanel();
    JPanel panelinin=new JPanel();
    JPanel panel1=new JPanel();
    JPanel panel2=new JPanel();
    JPanel panelfooter=new JPanel();
    JLabel lbltxt = new JLabel("Remaining Chance :");
    JLabel wordcontainer = new JLabel("New label");
    JTextField textField = new JTextField();
    open_Game f2=null;
    save_Game f3=null;
    load_Game f5=null;
    option_Game f4=null;
	public hangman_GUI() {
		 menuBAR.add(files); 
	        files.add(newgame);
	        newgame.addActionListener(new ActionListener() {
	        	@Override
				public void actionPerformed(final ActionEvent e) {
					 f2=new open_Game();
					 f2.setVisible(true);
					
				}
			});
	        files.add(loadgame);
	        loadgame.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(final ActionEvent e) {
					// TODO Auto-generated method stub
					f5=new load_Game();
					f5.setVisible(true);
				}
	        	
	        });
	        files.add(savegame);
	        savegame.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(final ActionEvent e) {
					// TODO Auto-generated method stub
					f3=new save_Game();
					f3.setVisible(true);
				}
	        	
	        });
	        files.add(exit);
	        exit.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					int dialogButton = JOptionPane.YES_NO_OPTION;
		            JOptionPane.showConfirmDialog (null, "Are You Sure You Want To Exit Game","Exit Game", dialogButton);
		            if(dialogButton == JOptionPane.YES_OPTION) {
		                System.exit(0);
		            if(dialogButton == JOptionPane.NO_OPTION) {
		                  remove(dialogButton);
		                }
		              }
				}
			});
	        menuBAR.add(optionmenu);
	        optionmenu.add(options);
	        options.addActionListener(new ActionListener() {
				public void actionPerformed(final ActionEvent e) {
					
					f4=new option_Game();
					f4.setVisible(true);
				}
			});
	        form.setJMenuBar(menuBAR);
	        
	        
	        panel2.add(wordcontainer);
	        form.add(panel2);
			form.add(panel);
			panel.setLayout(fllw);
						panel.add(a);
					    panel.add(b);
						panel.add(c);
						panel.add(d);
						panel.add(e);
						panel.add(f);
						panel.add(g);
						panel.add(h);
						panel.add(ý);
						panel.add(j);
						panel.add(k);
					    panel.add(l);
		  form.add(panelin);
		  panelin.setLayout(fllw);
						panelin.add(m);
					    panelin.add(n);
						panelin.add(o);
						panelin.add(p);
						panelin.add(q);
						panelin.add(r);
						panelin.add(s);
		panelinin.setLayout(fllw);
		form.add(panelinin);
						panelinin.add(t);
						panelinin.add(u);
						panelinin.add(v);
						panelinin.add(w);
						panelinin.add(x);
						panelinin.add(y);
						panelinin.add(z);
			
						form.add(panelfooter);
			panelfooter.setLayout(fllw);
			panelfooter.setLocation(100, 50);
			
			panelfooter.add(lbltxt);
			panelfooter.add(chancecontainer);
			panelfooter.add(textField);
			 textField.setColumns(10);
			 panelfooter.add(guessBTN);
			 guessBTN.addActionListener(new ActionListener() {
					public void actionPerformed(final ActionEvent e) {
						
						
					}
				});
			 		 
			pack();
		form.setLayout(new FlowLayout());
		form.setSize(620,320);
		form.setTitle("Hangman Game Project");
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		form.setVisible(true);
		form.setResizable(false);
		
		
		// TODO Auto-generated constructor stub
	}

	public static void main(final String[] args) {
		// TODO Auto-generated method stub
		new hangman_GUI();

	}

	

}
