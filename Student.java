package ClassObjects;

public class Student 
{
    private int my_age;
    private char my_grade;
    private int your_age;

    // Constructor to initialize My Details
    public Student(int myAge, char myGrade) 
    {
        my_age = myAge;
        my_grade = myGrade;
    }

    // Overloaded constructor to initialize Your Details
    public Student(int yourAge) 
    {
        your_age = yourAge;
    }

    // Method to print My Details
    public void my_details() 
    {
    	System.out.println("My Details " );
    	System.out.println("My Age: " + my_age);
        System.out.println("My Grade: " + my_grade);
    }

    // Method to return Your Details
    public int your_details() 
    {    
    	return your_age;
    }

    public static void main(String[] args) {
        // Create an instance of the Student class
        Student student1 = new Student(20, 'A');
        Student student2 = new Student(35);

        // Call methods to display and retrieve information
        student1.my_details();
        System.out.println("Your Details " );
        System.out.println("Your Age: " + student2.your_details());
    }
}
