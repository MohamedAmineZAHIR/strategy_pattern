/**
 * @date   20.12.2015
 * @author Mohamed Amine ZAHIR.
 */

package duck_land;

import behavior.FlyNoWay;
import behavior.MuteQuack;

public class DecoyDuck extends Duck 
{
	
	//  Constructor.
	public DecoyDuck() {
		super(new FlyNoWay(), new MuteQuack());
	}
	
	@Override
	public void display() {
		System.out.println("looks like a decoyDuck");
	}

}
