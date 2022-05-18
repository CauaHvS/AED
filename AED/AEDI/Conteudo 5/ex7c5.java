import java.util.Scanner;

public class ex7c5 {

	public static void main(String[] args) {
		double valX, funX;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Cacularemos a função f(x)=√(x/4+1)^2+(1/5)*x");
		System.out.println("Digite o valor de X: ");
		valX = teclado.nextDouble();

		funX = Math.sqrt(Math.pow(valX / 4 + 1, 2) + (0.2 * valX));

		System.out.println("Sendo x= " + valX + " o valor da função f(x) é: " + funX);
		teclado.close();
	}

}
