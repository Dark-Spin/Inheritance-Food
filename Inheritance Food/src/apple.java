
public class apple extends snack implements Plantable
{

	public apple(String string) {
		super(string);
		name = "red apple";
	}

	@Override
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
		System.out.println("A " + name + " is planted.");
		}

}
