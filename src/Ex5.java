import java.util.Scanner;

public class Ex5
{
  public void start()
  {
    System.out.println("Enter a string: ");
    Scanner input = new Scanner(System.in);

    char[] word = input.next().toCharArray();
    int[] charFrequency = new int[26];


    for(char c: word)
    {
      if(Character.isLetter(c))
      {
        c = Character.toLowerCase(c);
        // Convert char alphabet to index (0-25)
        int index = c - 'a';
        charFrequency[index]++;
      }
    }
    System.out.println("Character frequency: ");

    for (int i = 0; i < charFrequency.length; i++)
    {
      if (charFrequency[i] > 0)
      {
        char currentChar = (char) ('a' + i);
        System.out.println(currentChar + ": " + charFrequency[i]);
      }
    }
    input.close();
  }

}
