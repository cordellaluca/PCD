package modele;

import java.util.Observable;

public class Plateau extends Observable {
	 private Case tab[][];
	 private int nbClic;
	 
	 public Plateau(){
		 this.tab=new Case[5][5];
		 for(int i=0;i<5;i++){
			 for(int j=0;j<5;j++){
				 tab[i][j]=new Case();
			 }
		 }
		 this.nbClic=0;
	 }

	public Case[][] getTab() {
		return tab;
	}

	public void setTab(Case[][] tab) {
		this.tab = tab;
	}

	public int getNbClic() {
		return nbClic;
	}

	public void setNbClic(int nbClic) {
		this.nbClic = nbClic;
	}
	
	public void incClic(){
		this.nbClic++;
		setChanged();
		notifyObservers();
	}
	
	@Override
	public String toString() {
		String res="";
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				res=res+tab[i][j].toString();
			}
			res=res+"\n";
		}
		return res;
	}
	 
}
