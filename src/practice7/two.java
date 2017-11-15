package practice7;

import com.practice2.TextIO;

import java.util.ArrayList;

public class two {
    public static void main(String[] args) {


        ArrayList<Athlete> humansList = new ArrayList<>();


        while (true) {
            System.out.println("Please enter a name and a result");

            String input = TextIO.getlnString();


            if (input.equals(""))
                break;
            else {


                String[] inputArray = input.split(" ");


                humansList.add(new Athlete(inputArray[0], Double.parseDouble(inputArray[1])));
            }
            for (Athlete person : humansList) {

                System.out.println(person.getName() + " " + person.getResult());


            }


        }
    }
}
