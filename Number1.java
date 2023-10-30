package ClassObjects;

import javax.swing.JOptionPane;

class Rectangle 
{
    //The Private Instance variables
	private double length;
    private double width;

    //Declaration of the Constructors
    public Rectangle() 
    {
        // Constructor with no parameters, initializes length and width to 0.
        length = 0;
        width = 0;
    }

    public Rectangle(double length, double width) 
    {
        // Constructor with parameters to set length and width.
        this.length = length;
        this.width = width;
    }

    public double computeArea() 
    {
    	// Method used to calculate the Area of the Rectangle
    	return length * width;
    }
}

//Main Area of Show casing the Values input & Area
public class Number1 {
    public static void main(String[] args) 
    {
        // Input values for the first rectangle
        double length1 = Double.parseDouble(JOptionPane.showInputDialog("Enter length of the First Rectangle:"));
        double width1 = Double.parseDouble(JOptionPane.showInputDialog("Enter width of the First Rectangle:"));

        // Input values for the second rectangle
        double length2 = Double.parseDouble(JOptionPane.showInputDialog("Enter length of the Second Rectangle:"));
        double width2 = Double.parseDouble(JOptionPane.showInputDialog("Enter width of the Second Rectangle:"));

        // Create two Rectangle objects
        Rectangle rectangle1 = new Rectangle(length1, width1);
        Rectangle rectangle2 = new Rectangle(length2, width2);

        // Calculate the areas
        double area1 = rectangle1.computeArea();
        double area2 = rectangle2.computeArea();

        // Display results in dialog boxes
        JOptionPane.showMessageDialog(null, "Area of the First Rectangle: " + area1);
        JOptionPane.showMessageDialog(null, "Area of the Second Rectangle: " + area2);
    }
}
