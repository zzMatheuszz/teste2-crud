package resolucoes;
import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {
	public static void main(String[] args) { 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
	int a;
	int b;
	double c;
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextDouble();
	System.out.println("NUMBER: " + a);
	System.out.println("SALARY: " + c * b);
	
	sc.close();
	}

}
