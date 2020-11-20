import java.io.IOException;
import java.util.Scanner;
//Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.
public class Main {
	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		
		double A = input.nextDouble();
		if (A < 0 || A > 100) {
		      System.out.println("Fora de intervalo");
		    }
		else if(A >= 0.25  && A <= 25) {
			System.out.println("Intervalo [0,25]\n");
			
		}else if(A > 0.25  && A <= 50) {
			System.out.println("Intervalo (25,50]\n");
			
		}else if(A > 50  && A <= 75) {
			System.out.println("Intervalo (50,75]\n");

			
		}else if(A > 75  && A <= 100) {
			System.out.println("Intervalo (75,100]\n");
			
		}else {
			System.out.println("Fora de Intervalo\n");
		}

		input.close();
	}
}