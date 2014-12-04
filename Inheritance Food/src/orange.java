
public class orange extends snack implements Plantable
{
	
	public orange(String string) {
		super(string);
		name = "orange";
	}

	
	public void eat()
		{
		super.eat();
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
