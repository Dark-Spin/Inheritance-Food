
public class orange extends food implements Plantable

{
	@Override
	public void eat()
		{
		name = "orange";
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
