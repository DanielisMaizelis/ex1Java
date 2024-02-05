import java.util.Scanner;

import static java.lang.Math.pow;

public class Ex1
{
  public void start()
  {
    Scanner input = new Scanner(System.in);

    double pAmount;
    double interestRate;
    int numYears;

    System.out.println("Compound Interest Calculator");
    System.out.print("Enter the principal amount: ");
    pAmount = Float.parseFloat(input.nextLine());
    System.out.print("Enter the interest rate (in percentage): ");
    interestRate = Float.parseFloat(input.nextLine());
    System.out.print("Enter the number of years: ");
    numYears = Integer.parseInt(input.nextLine());

    double currentAmount = pAmount * pow(1 + (interestRate / 100), numYears);
    double compoundInterest = currentAmount - pAmount;

    for(int i = 1; i <= numYears; i++)
    {
      currentAmount = pAmount * pow(1 + (interestRate / 100), i);
      compoundInterest = currentAmount - pAmount;
      System.out.printf("Year %d Current Amount: %,.2f, Compound Interest: %,.2f \n", i, currentAmount, compoundInterest);
    }

    input.close();
  }

}
