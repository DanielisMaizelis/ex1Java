import java.util.Scanner;

public class Ex3
{
  public void start()
  {
    Scanner input = new Scanner(System.in);
    boolean isPrime = true;
    System.out.print("Enter a positive integer: ");
    int inputNum = Integer.parseInt(input.nextLine());

    for(int i=2; i<inputNum; i++)
    {
      if(inputNum%i == 0)
      {
        isPrime = false;
        break;
      }
    }

    if(isPrime)
    {
      System.out.printf("%d is a prime number\n", inputNum);
    }
    else
    {
      System.out.printf("%d is not a prime number\n", inputNum);
    }
    input.close();
  }

}
