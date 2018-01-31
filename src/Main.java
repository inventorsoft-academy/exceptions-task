import java.io.*;
import java.util.List;


/**
 * Created by Komatoz on 25.01.2018.
 */
public class Main {
    public static void main(String[] args) throws MyIOException {

        // firs my Exception
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println(reader.readLine());
        } catch (IOException e) {
            throw new MyIOException();
        }

        //second my Exception
       myException(null);




    }


    static void myException(List list){

        if (list == null) {
            throw new MyByRTEException("to method myException comes bug");
        }

    }


    static void individualTask() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please write a number");
        try {
            int x = Integer.parseInt(reader.readLine());
            System.out.printf("ok, %d is number", x);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException ex) {
            System.out.println("entered characters are not the number");
        }

    }


    static void thirdTask() {
        try {

            try {
                int z = 5 / 0;
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }


            int x = Integer.parseInt("fd12");
        } catch (NumberFormatException e) {
            System.out.println("error in method thirdTask");
        }

    }


    static void firstAndSecondTask() {
        try (FileReader fr = new FileReader("wrongName")) {
            fr.read();
        } catch (IOException e) {
            System.out.println(1);
            e.printStackTrace();
            System.out.println(2);
            System.out.println(e.getLocalizedMessage());
            System.out.println(3);
            e.addSuppressed(new NullPointerException());
            e.printStackTrace();
        }
    }


}
