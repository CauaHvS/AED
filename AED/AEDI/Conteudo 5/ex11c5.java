import java.util.Scanner;

public class ex11c5 {

	public static void main(String[] args) {
		long numCheque, banco, agencia, sequencial;
		Scanner teclado = new Scanner(System.in);

		System.out.println("favor digitar o valor do cheque: ");
		numCheque = teclado.nextLong();

		banco = numCheque / 1000000;
		agencia = numCheque / 1000 % 1000;
		sequencial = numCheque % 1000;

		System.out.println();
		System.out.println("banco: " + banco);
		System.out.println("agencia: " + agencia);
		System.out.println("sequencial: " + sequencial);

		teclado.close();
	}

}
