package com.practice2;
import java.util.Scanner;

public class five {
    public static void main(String[] args){
        String input, replaceInput;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter some text and the letter a will be replaced with i");
        input = scan.nextLine();
        replaceInput = input.replace('a' , 'i');
        System.out.println(replaceInput);


    }
}
