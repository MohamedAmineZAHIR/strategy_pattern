/**
 * @date   20.12.2015
 * @author Mohamed Amine ZAHIR.
 */

package behavior;

public class MuteQuack implements QuackBehavior 
{
	
	@Override
	public void quack() {
		System.out.println("Mute quack!");
	}
}