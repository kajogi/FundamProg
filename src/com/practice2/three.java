package com.practice2;
import java.util.Scanner;


public class three {
    public static void main(String[] args){

        int numPeople, groupSize, groupsCreated, leftOver;
                Scanner scan = new Scanner(System.in);
        System.out.println("How many people?");
        numPeople = scan.nextInt();
        System.out.println("What is the group size?");
        groupSize = scan.nextInt();
        groupsCreated = numPeople / groupSize;
        leftOver = numPeople % groupSize;
        System.out.println(groupsCreated + "  groups were created and the leftover was " + leftOver);




    }
}
