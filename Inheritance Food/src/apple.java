
public class apple extends snack 
{

	@Override
	public void eat()
		{
		name = "red apple";
		System.out.println("A " + name + " is eaten...");
		}
	
	@Override
	public void serve()
		{
		System.out.println("A " + name + " is served...");
		
		}
	}
