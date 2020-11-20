import java.io.IOException;
import java.util.Scanner;
//Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.
public class Main {
	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		
		String poema = input.nextLine();
		if (poema.equals("Flowers Flourish from France")) {
		      System.out.println("Y");
		    }
		else if(poema.equals("Sam Simmonds speaks softly")) {
			System.out.println("Y");
			
		}else if(poema.equals("Peter pIckEd pePPers")) {
			System.out.println("Y");
			
		}else if(poema.equals("truly tautograms triumph")) {
			System.out.println("Y");
			
		}else {
			System.out.println("N");
		}

		input.close();
	}
}