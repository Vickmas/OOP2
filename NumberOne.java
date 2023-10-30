package ControlStructures;

import java.util.Scanner;

public class NumberOne {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompts the user to input a value/number
        System.out.println("Enter a number: ");
        double number = scanner.nextDouble();
        // Used printIn to allocate the inputed value to the next line for accuracy

        // Number Checking Process
        if (number > 0) 
        {System.out.println("The number is positive.");} 
        // Checks & Reports whether the Number is positive
        
        else if (number == 0) 
        {System.out.println("The number is zero.");} 
        // Checks & Reports whether the Number is zero 
        
        else 
        {System.out.println("The number is negative.");}
        // Checks & Reports whether the Number is negative
                
        scanner.close();
    }
}
