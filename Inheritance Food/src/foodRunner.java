
public class foodRunner 
{
	public static void main(String[] args)
		{
		orange o = new orange(null);
		apple a = new apple(null);
		pasta p = new pasta(null);
		food f = new orange(null);

		f.serve();
		o.eat();
		o.serve();
		o.plant();
		a.eat();
		a.serve();
		a.plant();
		p.eat();
		p.serve();
	}
}