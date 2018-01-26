package co.inventorsoft.oop.task;

import co.inventorsoft.oop.task.area.ComplexShape;
import co.inventorsoft.oop.task.area.Shape;
import co.inventorsoft.oop.task.shapes.Circle;
import co.inventorsoft.oop.task.shapes.Rectangle;
import co.inventorsoft.oop.task.shapes.Square;
import co.inventorsoft.oop.task.shapes.Triangle;

import java.util.Arrays;
import java.util.List;

public class ApplicationStarter {

    public static void main(String[] args) {
        final List<Shape> shapes = Arrays.asList(
                new Circle(4),
                new Square(8),
                new Rectangle(12,14),
                new Triangle(3,4,5)
        );
        final ComplexShape complexShape = new ComplexShape(shapes);
        System.out.printf("Complex shape area = %f", complexShape.area());
    }

}
