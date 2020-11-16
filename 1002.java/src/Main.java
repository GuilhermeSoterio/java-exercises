import java.util.Locale;
import java.util.Scanner;

//A fórmula para calcular a área de uma circunferência é: area = π . raio2. Considerando para este problema que π = 3.14159:

public class Main {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		double raio = input.nextDouble();
		double n = 3.14159;
		double Area = n * Math.pow(raio, 2);
		
		System.out.printf("A=%.4f%n", Area);
		
		input.close();
	}
}