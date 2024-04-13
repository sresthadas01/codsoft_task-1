import java.util.*;
class RandomNumberGenerator 
{
	public static void main(String args[]) 
	{
                Scanner input = new Scanner(System.in);
                int attempts = 0;
                int score = 0;
                int minRange = 1; 
                int maxRange = 100;
                Random random = new Random();
                boolean number = true;
                while (number)
                {
                        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
                        boolean correctguess = false;
                        while (!correctguess)
                        {
                                System.out.println("Guess a number between " + minRange + " and " + maxRange );
                                int inputnumber = input.nextInt();
                                attempts++;
                                if  (inputnumber == randomNumber)
                                {
                                        System.out.println("Congratulations! You guess right number.");
                                        correctguess = true;
                                        score++;
                                }
                                else if (inputnumber > randomNumber)
                                {
                                        System.out.println("Your guess is too high.");
                                }
                                else
                                {
                                        System.out.println("Your guess is too low.");
                                }
                                if (attempts >= 5)
                                {
                                        System.out.println("You have reached maximum number of attempts.");
                                        System.out.println("Correct number = "+ randomNumber);
                                        break;
                                }
    	                }
                        System.out.println("Your score = "+ score);
                        System.out.println("Do you want to play again? (yes/no)");
                        String answer = input.next();
                        number = answer.equalsIgnoreCase("yes");
                }
        }
}
