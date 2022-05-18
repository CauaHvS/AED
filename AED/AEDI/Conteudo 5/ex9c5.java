import java.util.Scanner;

public class ex9c5 {

	public static void main(String[] args) {
		double nota1, nota2, nota3, media, peso1 = 2, peso2 = 3, peso3 = 5;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Calculo da media das provas: ");
		System.out.println("Digite a primeira nota:");
		nota1 = teclado.nextDouble();
		System.out.println("Digite a segunda nota:");
		nota2 = teclado.nextDouble();
		System.out.println("Digite a terceira nota:");
		nota3 = teclado.nextDouble();

		media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);

		System.out.println("O valor da sua media é: " + media);
		teclado.close();
	}

}
