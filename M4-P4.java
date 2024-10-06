// Cone.java
public class Cone extends Shape {
    private double radius;
    private double height;

    // Constructor to initialize radius and height
    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Method to calculate slant height
    private double slantHeight() {
        return Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
    }

    // Implement surfaceArea method
    @Override
    public double surfaceArea() {
        return Math.PI * radius * (radius + slantHeight());
    }

    // Implement volume method
    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    // Override toString method to display cone details
    @Override
    public String toString() {
        return "Cone [Surface Area: " + surfaceArea() + ", Volume: " + volume() + "]";
    }
}
