import java.io.IOException;
import java.util.Scanner;
//Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.
public class Main {
	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		
		int minutos = input.nextInt();
		int A = input.nextInt();
		int B = input.nextInt();
		
		int Soma = A + B;
		if (minutos < Soma) {
		      System.out.println("Deixa para amanha!");
		    }
		else if(minutos >= Soma) {
			System.out.println("Farei hoje!");
			
		}

		input.close();
	}
}