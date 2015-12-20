/**
 * @date   20.12.2015
 * @author Mohamed Amine ZAHIR.
 */

package behavior;

public class Quack implements QuackBehavior 
{

	@Override
	public void quack() {
		System.out.println("Quack !");	
	}
	
}
