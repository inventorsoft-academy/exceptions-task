package co.inventorsoft.oop.task.shapes;

import co.inventorsoft.oop.task.Exception.NotCorrectValueOfShapeException;
import co.inventorsoft.oop.task.Exception.NullValueException;
import co.inventorsoft.oop.task.area.Shape;
import static java.lang.Math.*;

// TODO: 1/10/2018 This class need to define radius and expose method to calculate the area
public class Circle implements Shape{

    private int r;

    public Circle(int r) {
            this.r = r;
            if (r <= 0)
                throw new NullValueException("r = " + r);
            //I will show you specially without try/catch because this is RunTimeException
    }


    @Override
    public double calculateArea() {
        return PI*pow(r,2);
    }
}
