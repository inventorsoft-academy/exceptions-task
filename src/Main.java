import java.io.*;


/**
 * Created by Komatoz on 25.01.2018.
 */
public class Main {
    public static void main(String[] args) {

            try{
                throw new IOException();
            }catch (IOException e){
      //          throw new MyIOException();
            }



    }






    public static void individualTask() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Please write a number");
        try {
            int x = Integer.parseInt(reader.readLine());
            System.out.printf("ok, %d is number",x);
        } catch (IOException e) {
            e.printStackTrace();
        }catch (NumberFormatException ex){
            individualTask();
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


    void firstAndSSecondTask() {
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
