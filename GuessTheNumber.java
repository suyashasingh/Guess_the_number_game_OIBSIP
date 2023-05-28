import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
		
        Scanner input = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 100);
        int guess;
		int k=5;
        int attempts = 0;
		
        System.out.println();
        System.out.println("Welcome to the Guess the Number game!");
        System.out.println("I am thinking of a number between 1 and 100...");
		System.out.println();
        
        do {
            System.out.print("Enter your guess: ");
							System.out.println();
            guess = input.nextInt();
            attempts++;
            
            if (guess < randomNumber&& attempts<=k)
				{
                System.out.println("Too low! Try again.");
				System.out.println();
            } 
			else if (guess > randomNumber&&  attempts<=k) 
			{
                System.out.println("Too high! Try again.");
				System.out.println();
            } 
			else if (guess==randomNumber)
			{
                System.out.println("Congratulations, you guessed the number in " + attempts + " attempts!");
				break;
				
            }
			if(attempts==k)
			{
            System.out.println("You have Exhuasted in "+ k +" trials");
            System.out.println("The number was "+ randomNumber);
			break;
            }
        } while (guess != randomNumber);
        
        input.close();
    }
}
