/**
 * @date   20.12.2015
 * @author Mohamed Amine ZAHIR.
 */

package engine;


import behavior.FlyWithWings;
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
		
		//  RubberDuck flight behavior is changed dynamically. 
		rubber.setFlyBehavior(new FlyWithWings());
		rubber.performFily();

	}

}
