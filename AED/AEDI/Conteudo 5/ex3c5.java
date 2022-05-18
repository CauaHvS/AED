import java.util.Scanner;

public class ex3c5 {

	public static void main(String[] args) {
		double salario, nDependentes, liquido, iRenda;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Favor informar o sálario: ");
		salario = teclado.nextDouble();
		System.out.println("Favor informar o número de dependentes: ");
		nDependentes = teclado.nextDouble();
		liquido = salario - (nDependentes * 60);
		iRenda = 15 * (0.01 * liquido);
		System.out.println("O valor do Imposto de Renda é: " + iRenda);

		teclado.close();
	}

}
