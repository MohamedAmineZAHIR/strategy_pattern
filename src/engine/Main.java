package engine;


import duck_land.Duck;
import duck_land.MallardDuck;
import duck_land.RubberDuck;

public class Main {

	public static void main(String[] args) {	
		
		Duck mallard = new MallardDuck();
		mallard.performFily();
		mallard.performQuack();
		
		
		// second case: caoutchouc duck.
		Duck rubber = new RubberDuck();
		rubber.performFily();
		rubber.performQuack();
		

	}

}
