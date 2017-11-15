package practice7;

import com.practice2.TextIO;

import java.util.ArrayList;

public class one {
    public static void main(String[] args) {


        ArrayList<Human> humansList = new ArrayList<>();


        while (true) {
            System.out.println("Please enter a name, just press enter to exit");

            String input = TextIO.getlnString();


            if (input.equals(""))
                break;
            else
                System.out.println("Please enter an age");
            int age = TextIO.getlnInt();

            humansList.add(new Human(input, age));
        }
        for (Human person : humansList){

            person.greet();

    }


}
}
