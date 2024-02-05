import java.util.Arrays;
import java.util.Scanner;

public class Ex6
{
  public void start()
  {
    String str;
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the first string: ");
    str = input.next().toLowerCase();
    char[] strOne = str.toCharArray();
    Arrays.sort(strOne);

    System.out.print("Enter the second string: ");
    str = input.next().toLowerCase();
    char[] strTwo = str.toCharArray();
    Arrays.sort(strTwo);

    if(Arrays.equals(strOne, strTwo)){
      System.out.println("The strings are anagrams");
    }
    else
    {
      System.out.println("The strings are not anagrams");
    }
    input.close();
  }

}
