package co.inventorsoft.oop.task.shapes;

import co.inventorsoft.oop.task.Exception.NotCorrectValueOfShapeException;
import co.inventorsoft.oop.task.Exception.NullValueException;
import co.inventorsoft.oop.task.area.Shape;

// TODO: 1/10/2018 This class need to define length and expose method to calculate the area
public class Square implements Shape{

    private int a;

    public Square (int a) {


        if (a <= 0) {
            this.a = a;
            throw new NullValueException("Square length a = " + a);
        }
        //I will show you specially without try/catch because this is RunTimeException
    }


    @Override
    public double calculateArea() {
        return a*a;
    }
}
