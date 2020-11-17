//Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double DistanciaTotal = input.nextDouble();
		double Combustivel = input.nextDouble();
		double Consumo = DistanciaTotal / Combustivel;
		
		System.out.printf("%.2f%n", Consumo);

		input.close();
    }
 
}