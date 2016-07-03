package guessTheNumber;
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumber 
{

	public static void main (String[] args)
	{
		int num, max, guess;
		Random rand;
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter the maximum number:");
		max=keyboard.nextInt();
		rand=new Random();
		num=rand.nextInt(max);
		System.out.println("Guess the number:");
		guess=keyboard.nextInt();
		while(guess!=num)
		{
			if(guess>num)
			{
				System.out.println("Guess was too high. Guess again:");
				guess=keyboard.nextInt();
			}
			else
			{
				System.out.println("Guess was too low.  Guess again:");
				guess=keyboard.nextInt();
			}
		}
		System.out.println("You win!");
	}
}
