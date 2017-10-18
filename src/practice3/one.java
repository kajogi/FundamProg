package practice3;
import java.util.Scanner;

public class one {
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter one number");
        a = input.nextInt();

        if (a % 2 == 0)
            System.out.println("This is an even number");
        else
            System.out.println("This is an odd number");
    }
}
