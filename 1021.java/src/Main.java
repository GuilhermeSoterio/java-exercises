import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
    	
    	
        Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);
		
		float Notas = input.nextFloat();
		if( Notas < 0 && 10000000 > Notas) { System.out.println("Valor inválido. Tente novamente.");
		}
		
		float Notas100 = Notas / 100;//5.76
		float restoNotas100 = Notas % 100;//76
		float Arredondando100 = (float) Math.floor(Notas100);
		
		float Notas50 = restoNotas100 / 50;//2(1.2)
		float restoNotas50 = restoNotas100 % 50;//26
		float Arredondando50 = (float) Math.floor(Notas50);//Arredonda para 1
		
		float Notas20 = restoNotas50 / 20;//2(1.2)
		float restoNotas20 = restoNotas50 % 20;//6
		float Arredondando20 = (float) Math.floor(Notas20);
		
		float Notas10 = restoNotas20 / 10;
		float restoNotas10 = restoNotas20 % 10;
		float Arredondando10 = (float) Math.floor(Notas10);
		
		float Notas5 = restoNotas10 / 5;
		float restoNotas5 = restoNotas10 % 5;
		float Arredondando5 = (float) Math.floor(Notas5);
		
		float Notas2 = restoNotas5 / 2;
		float restoNotas2 = restoNotas5 % 2;
		float Arredondando2 = (float) Math.floor(Notas2);
		
		float Moedas1 = restoNotas2 / 1;//1.72
		float restoMoedas1 = restoNotas2 % 1;//0.72
		float Arredondando1 = (float) Math.floor(Moedas1);//1.0
		
		float Moedas050 = (float) (restoMoedas1 / 0.5);//1.45
		float restoMoedas050 = (float) (restoMoedas1 % 0.5);//22
		float Arredondando050 = (float) Math.floor(Moedas050);//1
		
		float Moedas025 = (float) (restoMoedas050 / 0.25);
		float restoMoedas025 = (float) (restoMoedas050 % 0.25);
		float Arredondando025 = (float) Math.floor(Moedas025);
		
		float Moedas010 = (float) (restoMoedas025 / 0.10);
		float restoMoedas10 = (float) (restoMoedas025 % 0.10);
		
		float Moedas05 = (float) (restoMoedas10 / 0.5);//0.6
		float restoMoedas05 = (float) (restoMoedas10 % 0.5);//0.03
		float Arredondando05 = (float) Math.floor(Moedas05);//0.0
		
		float Moedas01 = (float) (restoMoedas05 / 0.1);//0.3
		float Arredondando01 = (float) Math.floor(Moedas01);//0.0
		
		System.out.printf("NOTAS:\n");
		System.out.printf("%.0f notas(s) de R$ 100.00 %n", Arredondando100);
		System.out.printf("%.0f notas(s) de R$ 50.00 %n", Arredondando50);
		System.out.printf("%.0f notas(s) de R$ 20.00 %n", Arredondando20);
		System.out.printf("%.0f notas(s) de R$ 10.00 %n", Arredondando10);
		System.out.printf("%.0f notas(s) de R$ 5.00 %n", Arredondando5);
		System.out.printf("%.0f notas(s) de R$ 2.00 %n", Arredondando2);
		System.out.printf("MOEDAS:\n");
		System.out.printf("%.0f moedas(s) de R$ 1.00 %n", Arredondando1);
		System.out.printf("%.0f moedas(s) de R$ 0.50 %n", Arredondando050);
		System.out.printf("%.0f moedas(s) de R$ 0.25 %n", Arredondando025);
		System.out.printf("%.0f moedas(s) de R$ 0.10 %n", Moedas010);
		System.out.printf("%.0f moedas(s) de R$ 0.05 %n", Moedas05);
		System.out.printf("%.0f moedas(s) de R$ 0.01 %n", Arredondando01);
		
		input.close();
		
    }
 
}