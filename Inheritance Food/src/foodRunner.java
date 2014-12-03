
public class foodRunner 
{
	public static void main(String[] args)
		{
		food [] food = new food [3];
		food[0] = new apple();
		food[1] = new pasta();
		food[2] = new orange();
		
		for (int i = 0; i < food.length; i++)
			{	
			food[i].eat();
			food[i].serve();
			if(food[i] instanceof Plantable)
				{
				food[i].plant();
				}
			System.out.println();
		}
	}
}