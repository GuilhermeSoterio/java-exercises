import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		int idade = input.nextInt();

		int QuantidadeAnos = idade / 365;
		idade = idade % 365;
		
		int QuantidadeMeses = idade / 30;
		idade = idade % 30;
		
		int QuantidadeDias = idade;
		
		System.out.printf("%d ano(s)%n", QuantidadeAnos);
		System.out.printf("%d mes(es)%n", QuantidadeMeses);
		System.out.printf("%d dia(s)%n", QuantidadeDias);

		input.close();
    }
 
}