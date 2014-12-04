
public abstract class snack extends food
{
	public snack(String string) {

	}
	@Override
	public void eat()
		{
		System.out.println("A " + name + " is eaten.");
		}
	
	@Override
	public void serve()
		{
		System.out.println("A " + name + " is served.");
		
		}
	}
