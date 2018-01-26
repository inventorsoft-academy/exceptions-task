import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    private static void readFromFile(String filePath){

        try {
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

                String line = br.readLine();

                if (line == null){
                    throw new EmptyLineException("line is empty");
                } else if (line.contains("  ")) {
                    throw new DoubleSpaceException();
                }

            } catch (FileNotFoundException e) {
                System.out.println(e.getMessage());

            } catch (DoubleSpaceException e) {
                System.out.println("double space error");
            }

        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFromFile("src/text.txt");
    }
}
