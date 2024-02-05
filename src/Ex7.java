import java.util.Scanner;

public class Ex7
{
  public void start()
  {
    Scanner input     = new Scanner(System.in);
    boolean isMale;

    System.out.print("Enter a Swedish social security number: ");
    String ssn = input.next();

    this.calculateLastDigit(ssn);


    ssn = ssn.replace("-","");

    if(!this.isLenOk(ssn) || ssn.length() != 10)
    {
      System.out.println("Invalid social security number");
    }
    else
    {
      isMale = this.isMale(ssn);
      System.out.println("Valid social security number");
      System.out.print("Sex: ");
      if(isMale)
      {
        System.out.print("Male");
      }
      else
      {
        System.out.print("Female");
      }
    }
    input.close();
  }
  private boolean isMale(String ssn)
  {
    boolean isMale = false;
    int digit = Character.getNumericValue(ssn.charAt(2));
    if(digit % 2 != 0)
    {
      isMale = true;
    }
    return isMale;
  }
  private boolean isLenOk(String ssn)
  {
    return ssn.length() == 10;
  }

  private int calculateLastDigit(String ssnPart)
  {
    int sum = 0;
    int checksum;
    for (int i = 0; i < 9; i++)
    {
      int digit = Character.getNumericValue(ssnPart.charAt(i));
      if (i % 2 == 0)
      {
        digit *= 2;
        if (digit > 9)
        {
          digit -= 9;
        }
      }
      sum += digit;
    }
    checksum = (10 - (sum % 10)) % 10;
    System.out.println(checksum);
    return checksum;
  }

}
