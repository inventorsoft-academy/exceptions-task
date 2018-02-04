package co.inventorsoft.oop.task.shapes;

import co.inventorsoft.oop.task.Exception.NotCorrectValueOfShapeException;
import co.inventorsoft.oop.task.Exception.NullValueException;
import co.inventorsoft.oop.task.area.Shape;

// TODO: 1/10/2018 This class need to define height and width and expose method to calculate the area
public class Rectangle implements Shape{

    private int a,b;

    public Rectangle (int a, int b) {
        this.a = a;
        this.b = b;

        if (a == b) {
            try {
                throw new NotCorrectValueOfShapeException("Your rectangle is equilateral and it's a Square!");
            } catch (NotCorrectValueOfShapeException e) {
                System.out.println("length a = " + a + " length b = " + b);
            }
        }

        if (a <= 0 || b <= 0) {
                throw new NullValueException("Rectangle values " + "a = " + a + " b = " + b);
            //I will show you specially without try/catch because this is RunTimeException
        }
    }

    @Override
    public double calculateArea() {
        return a * b;
    }
}
