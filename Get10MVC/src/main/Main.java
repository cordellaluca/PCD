package main;

import Controller.Controller;
import modele.Plateau;
import vue.PlateauView;

public class Main {
	
	public static void main(String[] args){
		Plateau plateau =new Plateau();
		PlateauView view=new PlateauView(plateau);
		Controller control= new Controller(plateau,view);
		
		
	}

}
