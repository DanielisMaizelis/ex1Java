import java.util.Objects;
import java.util.Scanner;

public class Ex4
{
  public void start()
  {
    String grade;
    int gradeNum;
    int sum         = 0;
    int gradeAmount = 0;

    System.out.println("Grade Average Calculator\n");
    System.out.println("Enter the grades (U, 3, 4, 5). Enter -1 to finish.\n");
    Scanner input = new Scanner(System.in);

    while(true)
    {
      ++gradeAmount;
      System.out.printf("Grade %d: ",gradeAmount);
      grade = input.nextLine();
      if(!Objects.equals(grade, "U"))
      {
        gradeNum = Integer.parseInt(grade);
        if(gradeNum == -1)
        {
          gradeAmount-=1;
          break;
        }
        else if(gradeNum < -1 ||( gradeNum >= 0 && gradeNum < 3 )|| gradeNum > 5)
        {
          System.out.println("Invalid grade! Please enter U, 3, 4, or 5.");
          gradeAmount -= 1;
        }
        else
        {
          sum += gradeNum;
        }
      }

    }

    double avg = (double)(sum)/(double)(gradeAmount);

    System.out.printf("\nGrade average is: %.1f:\n",avg);
    input.close();
  }
}
