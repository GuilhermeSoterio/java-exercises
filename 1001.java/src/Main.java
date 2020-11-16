//
import java.util.Scanner;

//Read 2 variables, named A and B and make the sum of these two variables, assigning its result to the variable X. Print X as shown below. Print endline after the result otherwise you will get “Presentation Error”.
public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int X = A + B;
		
		System.out.println("X = " + X);
		
		input.close();
	}
}
