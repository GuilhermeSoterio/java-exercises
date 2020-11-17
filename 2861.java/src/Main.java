import java.io.IOException;
import java.util.Scanner;
//Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.
public class Main {
	static String B;

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		int perguntas = input.nextInt();

			
			for (int i = 0; i < perguntas; i++) {
				String perguntando = input.next();
				if(perguntando != "Where is the book?") {
					System.out.println("gzus");
				}else {
					System.out.println("");
				}

			}
			
			input.close();
	}
}
