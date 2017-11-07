package practice5;
import java.util.Scanner;


public class one {
    public static void main(String[] args) {


        System.out.println(xCharacters('c', 5) + " " + xCharacters('p', 9));

    }

    private static String xCharacters(char inputCharacter, int inputNumber) {
        String result = "";
        for(int start = 0; start < inputNumber; start++){
            result += inputCharacter;
        }
        return result;

    }
}
