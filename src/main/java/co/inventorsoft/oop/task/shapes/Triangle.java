package co.inventorsoft.oop.task.shapes;

import co.inventorsoft.oop.task.Exception.NotCorrectValueOfShapeException;
import co.inventorsoft.oop.task.Exception.NullValueException;
import co.inventorsoft.oop.task.area.Shape;
import static java.lang.Math.sqrt;

// TODO: 1/10/2018 This class need to define base and height and eapose method to calculate the area
public class Triangle implements Shape{

    private int a,b,c;

    public Triangle (int a, int b, int c) {
        try {
            this.a = a;
            this.b = b;
            this.c = c;
            if (!checkLengthSides(a, b, c)) {
                throw new NotCorrectValueOfShapeException("Your triangle sides not correct!");
            }
        }
        catch (NotCorrectValueOfShapeException e) {
            System.out.println("length a = " + a + " length b = " + b + " length c = " + c);
        }


        if (a <= 0 || b <= 0 || c <= 0) {
            throw new NullValueException("length a = " + a + " length b = " + b + " length c = " + c);
        }
        //I will show you specially without try/catch because this is RunTimeException
    }

    private boolean checkLengthSides (int a, int b, int c) {
        return a + b >= c && a + c >= b && b + c >= a;
    }

    @Override
    public double calculateArea() {
        double p = (a + b + c) / 2;
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
