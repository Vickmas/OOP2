package ControlStructures;

public class NumberTwo {
    public static void main(String[] args) {
        int[] numbers = new int[31]; 
        // Creation of an array of size 31 i.e (0 to 30)

        // Initialization of the array with numbers from 0 to 30
        for (int i = 0; i <= 30; i++) 
        {numbers[i] = i;}
        
        // Initialization of the first set of numbers (0 to 3)
        int startIndex = 0;
        int endIndex = 3; 
        // Initialization of the total sum of fourth integers
        int total = 0; 

        while (startIndex <= 24) 
        {
            // Calculation of addition of all fourth integers in the current set
            int fourthInteger = numbers[endIndex];
            total += fourthInteger;

            // Displays the current set and the fourth integer
            System.out.print("Set: ");
            for (int i = startIndex; i <= endIndex; i++) 
            { System.out.print(numbers[i] + " ");}
            System.out.println("Fourth Integer: " + fourthInteger);

            // Updates on the start and end indices for the next set
            startIndex = endIndex + 1;
            endIndex = Math.min(endIndex + 4, 30); 
            // Ensure endIndex doesn't exceed 30
        }

        // Display of the total sum of all fourth integers
        System.out.println("The Total Sum of Fourth Integers: " + total);
    }
}
