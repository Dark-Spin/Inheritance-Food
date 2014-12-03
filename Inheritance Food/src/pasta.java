
public class pasta extends meal 
{

	@Override
	public void eat()
		{
		name = "Spagetti";
		System.out.println(name + " is eaten.");
		}
	
	@Override
	public void serve()
		{
		System.out.println(name + " is served.");
		}
		
	public pasta() {
		super("Splat");
		System.out.println("Foods make lots of noise when dropped.");
		System.out.println();
	}

}

