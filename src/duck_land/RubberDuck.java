package duck_land;

import behavior.FlyBehavior;
import behavior.QuackBehavior;

public class RubberDuck extends Duck 
{
	
	//  Constructor.
	public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}

	
	@Override
	public void display() {
		System.out.println("looks like a rubberDuck");
	}
}
