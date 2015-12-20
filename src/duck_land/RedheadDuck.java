/**
 * @date   20.12.2015
 * @author Mohamed Amine ZAHIR.
 */

package duck_land;

import behavior.FlyWithWings;
import behavior.Quack;

public class RedheadDuck extends Duck 
{
	
	//  Constructor.
	public RedheadDuck() {
		super(new FlyWithWings(), new Quack());
	}
	
	@Override
	public void display() {
		System.out.println("looks like a red head");
	}
	
}
