
public class apple extends snack implements Plantable
{

	@Override
	public void eat()
		{
		name = "red apple";
		System.out.println("A " + name + " is eaten.");
		}
	
	@Override
	public void serve()
		{
		System.out.println("A " + name + " is served.");
		
		}
	@Override
	public void plant()
		{
		System.out.println("An " + name + " is planted.");
		}

}
