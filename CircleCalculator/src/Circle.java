/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP Elite Core-i5
 */
// Define the Circle class
public class Circle {
    // Declare instance variables for radius, area, and circumference
    private double radius;
    private double area;
    private double circumference;
    
    // Constructor to initialize the Circle object with a given radius
    public Circle(double radius) {
        this.radius = radius;
        calculateArea(); // Calculate the area of the circle
        calculateCircumference(); // Calculate the circumference of the circle
    }
    
    // Method to calculate the area of the circle
    private void calculateArea() {
        area = (22.0 / 7) * radius * radius; // Formula for area: πr^2
    }
    
    // Method to calculate the circumference of the circle
    private void calculateCircumference() {
        circumference = 2 * (22.0 / 7) * radius; // Formula for circumference: 2πr
    }
    
    // Method to get the area of the circle
    public double getArea() {
        return area;
    }
    
    // Method to get the circumference of the circle
    public double getCircumference() {
        return circumference;
    }
}
