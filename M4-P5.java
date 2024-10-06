// ShapeArray.java
public class ShapeArray {
    public static void main(String[] args) {
        // Create instances of Sphere, Cylinder, and Cone
        Shape sphere = new Sphere(5.0);      // Radius = 5
        Shape cylinder = new Cylinder(3.0, 7.0); // Radius = 3, Height = 7
        Shape cone = new Cone(2.5, 6.0);    // Radius = 2.5, Height = 6

        // Store the shapes in an array
        Shape[] shapeArray = {sphere, cylinder, cone};

        // Loop through the array and print details
        for (Shape shape : shapeArray) {
            System.out.println(shape.toString());
        }
    }
}
