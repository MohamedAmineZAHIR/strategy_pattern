/**
 * @date   20.12.2015
 * @author Mohamed Amine ZAHIR.
 */

package duck_land;

import behavior.FlyNoWay;
import behavior.Squeak;

public class RubberDuck extends Duck 
{
	
	//  Constructor.
	public RubberDuck() {
		super(new FlyNoWay(), new Squeak());
	}

	
	@Override
	public void display() {
		System.out.println("looks like a rubberDuck");
	}
}
