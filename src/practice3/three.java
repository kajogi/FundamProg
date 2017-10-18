package practice3;
import java.util.Scanner;

public class three {
    public static void main(String[] args) {
        int womenAge, menAge, ageDiffrence;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter women age...");
        womenAge = input.nextInt();
        System.out.println("Enter men age...");
        menAge = input.nextInt();


        // Swiches to bigger number
        if(womenAge < menAge){
            int temp = womenAge;
            womenAge = menAge;
            menAge = temp;

        }
        ageDiffrence = (womenAge - menAge);



        if(ageDiffrence < 5){
            System.out.println("Very nice");}
        else if(ageDiffrence > 5 && ageDiffrence <= 10){
            System.out.println("Quite okay");}
        else if(ageDiffrence > 11 && ageDiffrence <= 15){
            System.out.println("Not that okay");}
        else if(ageDiffrence > 15){
            System.out.println("Thats not okay");}




    }
}
