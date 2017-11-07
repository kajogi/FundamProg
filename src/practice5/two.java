package practice5;

import com.practice2.TextIO;


public class two {
    public static void main(String[] args) {

        System.out.println(getNumber("Please insert a number", 5, 8));
    }

    public static int getNumber(String question, int min, int max) {
        while (true) {


            System.out.println(question);
            int number = TextIO.getlnInt();

            if (number < min)
                System.out.println("Sorry your number was less than min.");
            else if (number > max)
                System.out.println("Sorry your number was more than max.");
            else
                return number;


        }
    }


}
