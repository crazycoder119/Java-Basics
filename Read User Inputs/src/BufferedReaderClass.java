import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderClass {
	public static int readUserInputsFromBufferedReader() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Print the name : ");
		String name = reader.readLine();
		System.out.println(name);
		System.out.println("Enter the number : ");
		int number = Integer.parseInt(reader.readLine());
		System.out.println(number);
		return number;
	}
}
