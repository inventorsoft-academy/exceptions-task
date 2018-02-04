package co.inventorsoft.oop.task;

import co.inventorsoft.oop.task.area.ComplexShape;
import co.inventorsoft.oop.task.area.Shape;
import co.inventorsoft.oop.task.shapes.Circle;
import co.inventorsoft.oop.task.shapes.Rectangle;
import co.inventorsoft.oop.task.shapes.Square;
import co.inventorsoft.oop.task.shapes.Triangle;

import java.io.*;
import java.util.Arrays;
import java.util.Date;
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

        //nested try-catch example
        try {
            int[] array1 = {1,2,3};
            System.out.println(array1[10]);
            try {
                File file = new File("some.txt");
                FileReader fr = new FileReader(file);
                try {
                    int[] array2 = {1,4,5};
                    System.out.println(array1[10]);
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("third try block");
                }
            }
            catch (FileNotFoundException e) {
                System.out.println("second try block");
            }
        }
        catch (RuntimeException e) {
            System.out.println("first try block");
        }
    }
}
