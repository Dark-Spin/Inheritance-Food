
public class foodRunner 
{
	public static void main(String[] args)
		{
		food food = new food();
		snack snack = new snack();
		meal meal = new meal();
		apple apple = new apple();
		pasta pasta = new pasta();
		
		food.eat();
		food.serve();
		
		
		apple.eat();
		apple.serve();
		
		pasta.eat();
		pasta.serve();
		}
	}
