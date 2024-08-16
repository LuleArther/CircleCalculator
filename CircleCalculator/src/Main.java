import java.util.Scanner; // Import the Scanner class for user input

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object for input
        
        // Prompt the user to enter the radius of the circle
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        
        // Create a Circle object using the radius provided by the user
        Circle circle = new Circle(radius);
        
        // Display the calculated area and circumference of the circle
        System.out.println("The area of the circle is: " + circle.getArea());
        System.out.println("The circumference of the circle is: " + circle.getCircumference());
        
        scanner.close(); // Close the scanner to prevent resource leaks
    }
}
