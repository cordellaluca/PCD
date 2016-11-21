package modele;

import java.util.Random;

public class Case {
		private int value;
		private Random rand=new Random();
		
		public Case(){
			this.value= rand.nextInt((4-1)+1)+1;
		}

		public int getValue() {
			return value;
		}

		public void setValue() {
			this.value=rand.nextInt(4-1)+1;
		}

		@Override
		public String toString() {
			return "|" + value + "|";
		}
		
		
		
		
		
}
