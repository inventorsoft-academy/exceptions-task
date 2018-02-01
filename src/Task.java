import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        try {
            doStartupOperations();
        } catch (StartupConfigurationException e) {
            System.out.println(e.getCause() + ", " + e.getMessage());
            e.printStackTrace();
        }
        nestedTryTest();
        testTryWithResources();
    }

    private static void testTryWithResources() throws IllegalCredentialException {
        URL url1 = Task.class.getResource("test.txt");
        URL url2 = Task.class.getResource("test1.txt");
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(url1.getPath()))) {
                String username = bufferedReader.readLine();
                String password = bufferedReader.readLine();

                if (username.length() < 3 || password.length() < 3) {
                    throw new IllegalCredentialException("Username or password is less than 3 digits!");
                }
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught.");
            e.printStackTrace();
            System.out.println(e.getCause().toString());
        } catch (IOException e) {
            System.out.println("IOException caught.");
        }
    }

    private static void nestedTryTest() {
        List<Integer> arrayList = Arrays.asList(5, 4, 3, 2, 1);
        int[] divisor = new int[] {5, 4, 3, 2, 0, 1, 0};

        try {
            for (int i = 0; i <= arrayList.size(); i++) {
                try {
                    System.out.println(arrayList.get(i) / divisor[i]);
                } catch (ArithmeticException e) {
                    System.out.println("Attempted to divide by 0!");
                }
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Attempted to use illegal array index");
        }
    }

    private static void doStartupOperations() throws StartupConfigurationException {
        URL url = Task.class.getResource("config.conf");
        if (url == null) {
            throw new StartupConfigurationException("Config file not found!");
        }
    }
}