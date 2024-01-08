package resolucoes;
import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		int raio;
		double pi =3.14159;
		raio = sc.nextInt();
		System.out.printf("A=" + raio * raio * pi);
		sc.close();
	}

}
