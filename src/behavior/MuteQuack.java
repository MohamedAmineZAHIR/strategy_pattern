package behavior;

public class MuteQuack implements QuackBehavior 
{
	
	@Override
	public void quick() {
		System.out.println("Mute quack!");
	}
}