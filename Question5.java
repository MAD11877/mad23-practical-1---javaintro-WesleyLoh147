import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
     int a[] = new int[5];
     int n[] = new int[];
     int i = 0;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter Number of Numbers");
    no_num = sc.nextInt();

    for(int i=0;)

    if(no_num == 1) {
        System.out.println("Enter a number");
        num1 = sc.nextInt();

        int[] a1 = [num1];
    }

    if(no_num == 2) {
        System.out.println("Enter a number");
        num1 = sc.nextInt();

        System.out.println("Enter a number");
        num2 = sc.nextInt();

        int[] a1 = [num1, num2];
    }

    if(no_num == 3) {
        System.out.println("Enter a number");
        num1 = sc.nextInt();

        System.out.println("Enter a number");
        num2 = sc.nextInt();

        System.out.println("Enter a number");
        num3 = sc.nextInt();

        int[] a1 = [num1, num2, num3];
    }

    if(no_num == 4) {
        System.out.println("Enter a number");
        num1 = sc.nextInt();

        System.out.println("Enter a number");
        num2 = sc.nextInt();

        System.out.println("Enter a number");
        num3 = sc.nextInt();

        System.out.println("Enter a number");
        num4 = sc.nextInt();

        int[] a1 = [num1, num2, num3, num4];
    }

    if(no_num == 5) {
        System.out.println("Enter a number");
        num1 = sc.nextInt();

        System.out.println("Enter a number");
        num2 = sc.nextInt();

        System.out.println("Enter a number");
        num3 = sc.nextInt();

        System.out.println("Enter a number");
        num4 = sc.nextInt();

        System.out.println("Enter a number");
        num5 = sc.nextInt();

        int[] a1 = [num1, num2, num3, num4, num5];
    }

    Arrays.sort(a1);

    int i,j,frequency;

    for(i=0; i<array.length; i++){
        frequency = 1;
        for(j=i+1; j<array.length; j++){
           if(array[j] == array[i]){
              frequency++;
           } else {
              break;
           }
        }
        i=j-1;
        if(frequency > 1){
        
           //printing the output
           System.out.println(frequency);
  }
}
