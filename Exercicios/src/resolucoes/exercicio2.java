package resolucoes;
import java.util.Scanner;

public class exercicio2 {
	
	public static void main(String[] args) { 
		
		Scanner sc = new Scanner(System.in);
		int A;
		int B;
		int C;
		int D;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		System.out.println("Diferença: ");
		System.out.println(A * B - C * D);
		
		sc.close();
	}

}
