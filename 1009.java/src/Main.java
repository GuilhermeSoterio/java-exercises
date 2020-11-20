import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		String nome = input.next();
		double salarioFixo = input.nextDouble();
		double vendas = input.nextDouble();
		
		double comissao = (vendas * 15) / 100;
		double soma = salarioFixo + comissao;

		System.out.printf("TOTAL = R$ %.2f%n", soma);

		input.close();
    }
 
}