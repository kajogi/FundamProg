package practice6;

import com.practice2.TextIO;

import javax.xml.soap.Text;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class one {
    public static void main(String[] args) {


//        showNumberOfLetterAinName(); // third exercise
//        printTenNames(); // first exercise
//        asksTenNames(); // second exercise


    }


    private static void showNumberOfLetterAinName() {

        ArrayList<String> names = new ArrayList<>();

        while (true) {
            System.out.println("Please enter a name, just press enter to exit");

            String input = TextIO.getlnString();
            if (input.equals(""))
                break;
            else
                names.add(input);
        }
        System.out.println(names);

        for (String name : names) {
            int letterCount = 0;

            for (int i = 0; i < name.length(); i++) {

                if (name.charAt(i) == 'a' || name.charAt(i) == 'A')
                    letterCount++;
            }
            System.out.println(letterCount + " " + name);
        }

    }


    private static void asksTenNames() {
//      Array size in numb
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter 10 numbers");
            numbers[i] = TextIO.getlnInt();

        }
//      Prints out in reverse order
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + "|");

        }
//        Puts them in ascending order
//        java.util.Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

    }

    private static void printTenNames() {
//          Ask the user for an array size
        String[] mNames = new String[4];


        for (int index = 0; index < mNames.length; index++) {
            System.out.println("Please enter a name");
            mNames[index] = TextIO.getlnString();

        }


        System.out.println(Arrays.toString(mNames));
        // Picks a random name and displays it
        System.out.println(mNames[new Random().nextInt(mNames.length)]);

    }


}
