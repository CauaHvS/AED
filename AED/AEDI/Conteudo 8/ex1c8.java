import java.util.Scanner;

public class ex1c8 {

	public static void main(String[] args) {
		int raio, aux;
		double area;
		Scanner teclado = new Scanner(System.in);
		for (aux = 1; aux <= 10; aux++) {
			System.out.println("Informe o valor do raio:");
			raio = teclado.nextInt();
			area = Math.pow(raio, 2) * 3.1416;
			System.out.println("A sua area é de: " + area);
		}
		teclado.close();
	}

}
