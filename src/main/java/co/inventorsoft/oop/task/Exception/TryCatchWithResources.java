package co.inventorsoft.oop.task.Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchWithResources {

    //clasical example try-catch-with-resources
    String readFirstLineFromFile(String file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            return br.readLine();
        }
    }

}
