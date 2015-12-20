/**
 * @date   20.12.2015
 * @author Mohamed Amine ZAHIR.
 */

package behavior;

public class FlyNoWay implements FlyBehavior 
{

	@Override
	public void fly() {
		System.out.println("I can't fly!");
		
	}
	
}
