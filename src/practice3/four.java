package practice3;
import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        String password = "guessit123";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter password...");
        String passwordInput = scanner.nextLine();
        if(passwordInput.equals(password)){
            System.out.println("Access granted!");
        } else {
            System.out.println("Wrong password, try again");
        }
    }
}
