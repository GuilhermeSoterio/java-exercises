import java.io.IOException;
import java.util.Scanner;
//Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.
public class Main {

	public static void main(String[] args) throws IOException {
		int A, B;
		Scanner input = new Scanner(System.in);
		do {
		A = input.nextInt();
		B = input.nextInt();
		if (A > 0 && B > 0) {
		      System.out.println("primeiro");
		    }
		else if(A < 0 && B > 0) {
			System.out.println("segundo");
			
		}else if(A < 0 && B < 0) {
			System.out.println("terceiro");
			
		}else if(A > 0  && B < 0) {
			System.out.println("quarto");
			
			}
		}while ((A != 0) && (B != 0));
		
		input.close();
	}
}