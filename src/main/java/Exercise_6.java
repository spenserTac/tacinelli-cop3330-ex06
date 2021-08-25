/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinlli
 */

import java.util.Calendar;
import java.util.Scanner;

public class Exercise_6{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your current age? ");
        String temp1 = scanner.nextLine();
        int age = Integer.parseInt(temp1);

        System.out.print("At what age would you like to retire? ");
        String temp2 = scanner.nextLine();
        int retire_age = Integer.parseInt(temp2);

        System.out.println("You have " + (retire_age - age) + " years left until you can retire.");

        int year = Calendar.getInstance().get(Calendar.YEAR);


        System.out.println("It's " + year + ", so you can retire in " + (year + (retire_age - age)) + ".");
    }
}
