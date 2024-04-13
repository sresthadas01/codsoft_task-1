# codsoft_task-1

TASK 1 
(NUMBER GAME)
1. Generate a random number within a specified range, such as 1 to 100.
2. Prompt the user to enter their guess for the generated number.
3. Compare the user's guess with the generated number and provide feedback on whether the guess is correct, too high, or too low.
4. Repeat steps 2 and 3 until the user guesses the correct number. You can incorporate additional details as follows:
5. Limit the number of attempts the user has to guess the number.
6. Add the option for multiple rounds, allowing the user to play again.
7. Display the user's score, which can be based on the number of attempts taken or rounds won.

# ans:

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

# instruction:

	1. copy full code.
	2. save the code: RandomNumberGenerator.java
	3. combine the code: javac RandomNumberGenerator.java
	4. run the code: java RandomNumberGenerator
