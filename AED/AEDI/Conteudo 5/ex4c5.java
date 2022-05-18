import java.util.Scanner;

public class ex4c5 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		double px1, py1, px2, py2, dist;
		System.out.println("Informe o valor do X1: ");
		px1 = teclado.nextDouble();
		System.out.println("Informe o valor do Y1: ");
		py1 = teclado.nextDouble();
		System.out.println("Informe o valor do X2: ");
		px2 = teclado.nextDouble();
		System.out.println("Informe o valor do Y2: ");
		py2 = teclado.nextDouble();

		dist = Math.sqrt(Math.pow((px1 - px2), 2) + Math.pow((py1 - py2), 2));

		System.out.println("A sua distância é de: " + dist);
		teclado.close();
	}

}
