import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int Hora = input.nextInt();
		double VelocidadeMedia = input.nextDouble();
		double Combustivel = Hora / VelocidadeMedia;
		
		System.out.printf("%.3f km/l%n", Combustivel);

		input.close();
    }
 
}