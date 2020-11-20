import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		int D = input.nextInt();
		int DIFERENCA = (A * B - C * D);
		
		System.out.println("DIFERENCA = "+ DIFERENCA);

		input.close();
    }
 
}