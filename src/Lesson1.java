import java.util.Scanner;

/* Lesson1 - Given two natural numbers (both not greater than 200),
   each number in the separate line, please print the sum of them.
*/
public class Lesson1 {
    public static void main (String[] args)
    {
        int num1, num2, sum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give two natural numbers (both not greater than 200)");
        System.out.print("num1=");
        num1 = scanner.nextInt();
        // Check if num1 is natural or greater than 200
        if(num1<1)
            System.out.println("It's not a natural number");
        else if(num1 > 200)
            System.out.println("Number is greater than 200");
        else {
            System.out.print("num2=");
            num2 = scanner.nextInt();
            // Check if num2 is natural or greater than 200
            if (num2 < 1)
                System.out.println("It's not a natural number");
            else if (num2 > 200)
                System.out.println("Number is greater than 200");
                // Print sum if both given numbers meet the range
                // test gita
            else {
                sum = num1 + num2;
                System.out.println("sum=" + sum);
            }
        }
    }
}
