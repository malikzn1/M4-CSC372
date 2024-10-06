// Cylinder.java
public class Cylinder extends Shape {
    private double radius;
    private double height;

    // Constructor to initialize radius and height
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    // Implement surfaceArea method
    @Override
    public double surfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    // Implement volume method
    @Override
    public double volume() {
        return Math.PI * Math.pow(radius, 2) * height;
    }

    // Override toString method to display cylinder details
    @Override
    public String toString() {
        return "Cylinder [Surface Area: " + surfaceArea() + ", Volume: " + volume() + "]";
    }
}
