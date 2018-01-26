package co.inventorsoft.oop.task.area;
import java.util.List;

// TODO: 1/10/2018 Implement area calculation for underlying shapes
public class ComplexShape {

    private List<Shape> shapes;

    private double totalArea = 0;

    public ComplexShape(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public double area () {
        for (Shape shape: shapes)
            totalArea += shape.calculateArea();
        return totalArea;
    }
}
