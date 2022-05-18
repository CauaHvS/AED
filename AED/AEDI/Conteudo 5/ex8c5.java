import java.util.Scanner;

public class ex8c5 {

	public static void main(String[] args) {
		double valS, valA, raio2, raio, pi;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Calculo do raio: \nSendo S(área de um setor circular) e A(ângulo).");
		System.out.println("Favor digitar o valor de S: ");
		valS = teclado.nextDouble();
		System.out.println("Favor digitar o valor de A: ");
		valA = teclado.nextDouble();

		pi = 3.1416;
		raio2 = (valS * 360) / (valA * pi);
		raio = Math.sqrt(raio2);

		System.out.println("O valor do seu raio é: " + raio);
		teclado.close();
	}

}
