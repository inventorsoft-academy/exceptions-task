import java.io.*;
import java.util.Scanner;

public class ExceptionsTask {
	private String path="some path";
	private void tryWithResources() {

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
				String line = br.readLine();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
	private void nestedTry(){
		Scanner sc = null;
		try
		{
			try{
				sc = new Scanner(new File(path));
			}catch (FileNotFoundException e){
				e.printStackTrace();
			}
			try {
				System.out.println(sc.hasNext());
			}catch (NullPointerException e){
				e.printStackTrace();
			}
		}
		finally
		{
				if(sc != null) {
					sc.close();
				}
		}
	}
	private void usingThrowableMethods(){
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
		}catch (IOException e){
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
	}

	private void usingMyCustomException(){
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter command number ");
		int command = 0;
		try {
			command = Integer.parseInt(bufferedReader.readLine());
		} catch (NumberFormatException e) {
			System.err.println("Your input is not a number!");
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		try{
			if(command >= 5){
				throw new WrongCommandException(command, "Invalid command! Must be less than 5");
			}
		}catch (WrongCommandException e){
			e.printStackTrace();
		}
	}

	public static void main(String...args){
		ExceptionsTask et = new ExceptionsTask();
//		et.tryWithResources();
//		et.nestedTry();
//		et.usingThrowableMethods();
		et.usingMyCustomException();
	}
}
