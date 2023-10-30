package ControlStructures;

public class NumberThree {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) 
        {
            //Checks whether the number is even
        	if (i % 2 == 0) 
            //If the number is even it skips to the next value
        	{continue;}
        	//Displays the values that were not skipped (The Odd Numbers)
            System.out.println(i);
        }
    }
}
