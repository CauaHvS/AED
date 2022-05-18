import java.util.Scanner;

public class ex6c5 {

	public static void main(String[] args) {
		double valA, valB, valC, valX, valY, valR, dist;
		String valP;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Olá, agora calcularemos a distancia entre um ponto P e uma reta R.");
		System.out.println("Agora para começarmos digite o valor de A na reta R: ");
		valA = teclado.nextDouble();
		System.out.println("Agora digite o valor de B na reta R: ");
		valB = teclado.nextDouble();
		System.out.println("Agora digite o valor de C na reta R: ");
		valC = teclado.nextDouble();
		System.out.println("Agora digite o valor da coodenada X do ponto P:");
		valX = teclado.nextDouble();
		System.out.println("Agora digite o valor da coodenada Y do ponto P:");
		valY = teclado.nextDouble();

		valP = (valX + "," + valY);
		valR = (valA * valX) + (valB * valY) + valC;
		dist = valR / Math.sqrt(Math.pow(valA, 2) + Math.pow(valB, 2));
		System.out.println("A distancia entre o ponto P(" + valP + ") e a reta R=" + valR + " é de: " + dist);

		teclado.close();
	}

}
