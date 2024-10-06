// Sphere.java
public class Sphere extends Shape {
    private double radius;

    // Constructor to initialize radius
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Implement surfaceArea method
    @Override
    public double surfaceArea() {
        return 4 * Math.PI * radius * radius;
    }

    // Implement volume method
    @Override
    public double volume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Override toString method to display sphere details
    @Override
    public String toString() {
        return "Sphere [Surface Area: " + surfaceArea() + ", Volume: " + volume() + "]";
    }
}
