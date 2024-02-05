import java.util.Scanner;

public class Ex2
{
  public void start()
  {
    int guess = 0;
    int range = 100;
    int min   = 1;
    int guessAmount  = 0;


    int ranNum = (int)(Math.random() * range) + min;
    System.out.println(ranNum);
    Scanner input = new Scanner(System.in);

    System.out.println("Welcome to the Number Guessing Game!");
    System.out.println("I have selected a number between 1 and 100. Try to guess it.");

    while(true)
    {
      ++guessAmount;
      System.out.print("Enter your guess: ");
      guess = Integer.parseInt(input.nextLine());
      if(guess < ranNum)
      {
        System.out.println("Too low, try again");
      }
      else if(guess > ranNum)
      {
        System.out.println("Too high, try again");
      }
      else
      {
        System.out.printf("Congratulations! You guessed the number in %d attempts.\n", guessAmount);
        break;
      }
    }

    input.close();
  }
}
