package practice3;
import java.util.Scanner;

public class two {
    public static void main(String[] args){
        double averageGrade, diplomaGrade;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your average grade");
        averageGrade = input.nextDouble();
        System.out.println("Enter your diploma thesis grade");
        diplomaGrade = input.nextDouble();

        if((averageGrade > 4.5) && (diplomaGrade == 5))
            System.out.println("Gongrats, you have been given Cum Laude");
        else
            System.out.println("You did not recieve Cum Laude");
    }

}
