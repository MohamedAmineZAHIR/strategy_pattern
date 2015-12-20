package duck_land;

import behavior.FlyBehavior;
import behavior.QuackBehavior;

public class MallardDuck extends Duck 
{
	
	//  Constructor.
	public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}

	@Override
	public void display() {
		System.out.println("looks like a mallard");
	}
}
