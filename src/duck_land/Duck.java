package duck_land;

import behavior.FlyBehavior;
import behavior.QuackBehavior;

public abstract class Duck 
{
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	
	//Constructor.
	public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super();
		setFlyBehavior(flyBehavior);
		setQuackBehavior(quackBehavior);
	}
	
	
	public void swim(){
		System.out.println("swim");
	}
	

	public void performFily(){
		flyBehavior.fly();
	}
	
	public void performQuack(){
		quackBehavior.quack();
	}

	public abstract void display();
	
	
	//Setters.
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
