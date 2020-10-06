import java.util.Scanner;

public class Conditionals
{
    public static void main(String[] args)
    {
        int num = 5;
        int num2 = 3;
        boolean n = false;

        System.out.println(n);

        // if(n = true) // WRONG
        if(n == true)  // CORRECT
        {
            System.out.println(n);
        }

        System.out.println(n);

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a, b, and c.");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if(b * b - 4 * a * c < 0)  // two complex
        {
            // code
        }
        if(b * b - 4 * a * c == 0)  // one real
        {
            // code
        }
        if(b * b - 4 * a * c > 0)  // two real
        {
            // code
        }
    }
}


