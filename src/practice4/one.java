package practice4;

public class one {
    public static void main(String[] args) {


        // Print out numbers on one line from 10 to 1
        for (int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        }

        // Print out even numbers on one line from 0 to 10 (0,2,4 etc)

        System.out.println("\n -------------------");
        for (int i = 0; i < 10; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n -------------------");

        // Print out numbers that are divisble by 3 from 30 to 0 on one line (30, 27, 24, 21 etc)
        for (int i = 30; i > 0; i -= 3) {
            System.out.print(i + " ");
        }

        System.out.println("\n -------------------");


        // Use loops to print out a table like that:

        int input = 5;
        for (int row = 0; row <= input; row++) {
            for (int column = 0; column <= input; column++) {
                if (row == column) //if row and column are equal
                    System.out.print(1 + " ");
                else // if not equal
                    System.out.print(0 + " ");
            }
            System.out.println(); // Prints as a table
        }

        System.out.println("\n -------------------");

        int input1 = 6;
        int linestart = 0;
        while (linestart <= input1 + 2) {

            System.out.print("--");
            linestart++;

        }
        System.out.println();

        for (int row = 0; row <= input1; row++) {
            System.out.print("| ");
            for (int column = 0; column <= input1; column++) {


                if (row == column || row + column == input)
                    System.out.print("x ");
                else
                    System.out.print(0 + " ");
            }
            System.out.println("| ");
        }
        linestart = 0;
        while (linestart <= input1 + 2) {
            System.out.print("- ");
            linestart++;
        }





        }


    }




