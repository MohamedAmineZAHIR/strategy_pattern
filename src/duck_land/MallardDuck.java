package duck_land;


import behavior.FlyWithWings;
import behavior.Quack;

public class MallardDuck extends Duck 
{
	
	//  Constructor.
	public MallardDuck() {
		super(new FlyWithWings(), new Quack());
	}

	@Override
	public void display() {
		System.out.println("looks like a mallard");
	}
}
