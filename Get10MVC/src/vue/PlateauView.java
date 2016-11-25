package vue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import Controller.Controller;
import modele.Plateau;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

public class PlateauView extends JFrame implements Observer{
	private Plateau plateau;
	private Controller controller;
	private GridLayout jeu;

	private JMenu menu=new JMenu();
	private JMenuBar menuBarre=new JMenuBar();
	private JMenuItem reset=new JMenuItem("Recommencez");
	private JButton boutonTab [][];
	private JLabel clicLab= new JLabel(""+0); 
	private JPanel pan=new JPanel();
	
	public PlateauView(Plateau plateau) {
		super("Get10");
		this.plateau=plateau;
		boutonTab=new JButton[5][5];
		plateau.addObserver(this);
		jeu=new GridLayout(0,5);
		
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				JButton b=new JButton(""+plateau.getTab()[i][j]);
				boutonTab[i][j]=b;
				b.addActionListener(controller);
				this.add(b);
		
			}
		}
		pan.add(clicLab);
		this.add(pan,BorderLayout.SOUTH);
		this.setLayout(jeu);
		this.setSize(800, 400);
		this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		this.pack();
		this.setVisible(true);
		
	}
	@Override
	public void update(Observable arg0, Object arg1) {

		clicLab.setText(""+plateau.incClic());
		
	}
	public JButton[][] getBoutonTab() {
		return boutonTab;
	}
	public void setBoutonTab(JButton[][] boutonTab) {
		this.boutonTab = boutonTab;
	}
	

}
