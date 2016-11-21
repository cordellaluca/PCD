package vue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import Controller.Controller;
import modele.Plateau;

import java.awt.GridLayout;
import java.util.Observable;
import java.util.Observer;

public class PlateauView extends JFrame implements Observer{
	private Plateau plateau;
	//private Controller controller;
	private GridLayout jeu;

	private JMenu menu=new JMenu();
	private JMenuBar menuBarre=new JMenuBar();
	private JMenuItem reset=new JMenuItem("Recommencez");
	
	private JLabel clicLab= new JLabel(); 
	private JPanel pan=new JPanel();
	
	public PlateauView(Plateau plateau) {
		this.plateau=plateau;
		jeu=new GridLayout(5,5);
		for(int i=0;i<25;i++){
			
		}
		
		
	}
	@Override
	public void update(Observable arg0, Object arg1) {
		this.repaint();
		
	}

}
