import java.io.IOException;
import java.util.Stack;

public class MainUI {
	public static void main(String[] args) throws IOException {
		BufferedReaderClass.readUserInputsFromBufferedReader();
		ScannerClass.readUserInputsFromScanner();
		ConsoleReader.readUserInputsFromConsole();

//		Stack<Integer> stack = new Stack<Integer>(); 
//		// reading the number from user using BufferReader
//		int number =BufferedReaderClass.readUserInputsFromBufferedReader();
//		System.out.println();
//		// Adding numbers one by one to stack
//		for(int a = 10;a>0;a=(a/10)) {
//			int temp = (number/a);
//			// Check is the number is more than 100
//			if((number/a)>10) {
//				a=a*100;
//				continue;
//			}
//			// Adding the int to stack
//			if((number/a)>0) {
//				System.out.print((number/a));
//				stack.push((number/a));
//				number = number - ((number/a)*a);
//			}
//		}
//		System.out.println();
//		System.out.println("--------------------------------------");
//		System.out.println("The new Stack is: " + stack); 
//		// Reverse the number using stack
//		while(!stack.isEmpty()) {
//			System.out.print(stack.pop());
//		}
		
	}
}
