/**
 * @date   20.12.2015
 * @author Mohamed Amine ZAHIR.
 */

package duck_land;

import behavior.FlyBehavior;
import behavior.QuackBehavior;

public class DecoyDuck extends Duck 
{
	
	//  Constructor.
	public DecoyDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void display() {
		System.out.println("looks like a decoyDuck");
	}

}
