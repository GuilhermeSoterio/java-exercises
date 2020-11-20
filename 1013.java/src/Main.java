import java.io.IOException;
import java.util.Scanner;
//Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
public class Main {
	public static void main(String[] args) throws IOException {

		Scanner input = new Scanner(System.in);
		
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		
		int maiorAB = (A + B + Math.abs(A - B)) / 2;
		int maiorABC = (maiorAB + C + Math.abs(maiorAB - C)) / 2;
				
		System.out.println(maiorABC + " eh o maior");
		input.close();
		
	}
}