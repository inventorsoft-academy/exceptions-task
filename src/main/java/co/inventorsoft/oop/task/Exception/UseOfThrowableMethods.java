package co.inventorsoft.oop.task.Exception;

public class UseOfThrowableMethods {

    private static Throwable throwable = new Throwable("message", new Exception());

    public static void main(String[] args) {
        Throwable[] throwables = throwable.getSuppressed();
        Throwable exception = throwable.getCause();
        throwable.printStackTrace();
        //etc.
    }



}