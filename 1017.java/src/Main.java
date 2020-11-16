import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double Hora = input.nextDouble();
		double VelocidadeMedia = input.nextDouble();
		double Distancia = Hora * VelocidadeMedia;
		double Combustivel = Distancia / 12;
		
		System.out.printf("%.3f%n", Combustivel);

		input.close();
    }
 
}