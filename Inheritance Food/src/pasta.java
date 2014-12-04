public class pasta extends meal
	{

	public pasta(String string) {
		super(string);
		name = "Spagetti";
	}

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

	@Override
	public void foodColor() {
		
		
	}
	


	}
