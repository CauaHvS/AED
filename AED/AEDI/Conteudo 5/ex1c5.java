import java.util.Scanner;

public class ex1c5 {

	public static void main(String[] args) {
		double valx, fx;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o valor de X:");
		valx = teclado.nextDouble();
		fx = Math.pow(valx, 3) + (4 * valx) + 10;
		System.out.println("O valor da função f(x)=x^3+4x+10 é: " + fx);

		teclado.close();

	}

}
