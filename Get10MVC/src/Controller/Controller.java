package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modele.Plateau;
import vue.PlateauView;

public class Controller implements ActionListener{
		private Plateau plat;
		private PlateauView view;

		public Controller(Plateau model,PlateauView view){
	        this.plat = model;
	        this.view=view;

	                          
	    }
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==view.getBoutonTab()){
			plat.incClic();
		}
	}
	
    public Plateau getPlat() {
		return plat;
	}
	public void setPlat(Plateau plat) {
		this.plat = plat;
	}
	public PlateauView getView() {
		return view;
	}
	public void setView(PlateauView view) {
		this.view = view;
	}
}
