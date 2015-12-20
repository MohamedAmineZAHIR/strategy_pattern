/**
 * @date   20.12.2015
 * @author Mohamed Amine ZAHIR.
 */

package duck_land;

import behavior.FlyBehavior;
import behavior.QuackBehavior;

public class RedheadDuck extends Duck 
{
	
	//  Constructor.
	public RedheadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}
	
	@Override
	public void display() {
		System.out.println("looks like a red head");
	}
	
}
