public class food {
	protected String name;
	protected int calories;
	protected String noise;
	protected void Animal(String noise) {
	this.noise = noise;
	}

	public void eat() {
		System.out.println("Food is eaten...");
	}

	public void serve() {
		System.out.println("Food is served...");
	}

	public void makeNoise() {
		System.out.println(noise);
	}
	
	public void plant()
		{
		System.out.println("Food is planted...");
		}
}
