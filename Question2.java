import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Height");
    System.out.println("Enter Weight");
    double height = in.nextDouble();
    double weight = in.nextDouble();
    String readInput = in.nextLine();
    double BMI = weight / (height * height);
    System.out.println(BMI);
  }
}
