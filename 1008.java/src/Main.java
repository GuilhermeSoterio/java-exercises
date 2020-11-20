import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int numero = input.nextInt();
		int horas = input.nextInt();
		double valorPorHora = input.nextDouble();
		
		double salario = valorPorHora * horas;
		
		System.out.println("NUMBER = "+ numero);
		System.out.printf("SALARY = U$ %.2f%n", salario);

		input.close();
    }
 
}