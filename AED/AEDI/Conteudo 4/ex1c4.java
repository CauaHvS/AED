import java.util.Scanner;

public class ex1c4 {

	public static void main(String[] args) {
		String nome1, nomeMeio, sobrenome;
		long idade;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite seu primeiro nome: ");
		nome1 = teclado.nextLine();
		System.out.println("Digite seu nome do meio: ");
		nomeMeio = teclado.nextLine();
		System.out.println("Digite seu sobrenome: ");
		sobrenome = teclado.nextLine();
		System.out.println("Digite sua idade: ");
		idade = teclado.nextLong();

		System.out.println(sobrenome + ", " + nome1 + " " + nomeMeio);
		System.out.println("Idade: " + idade + " anos.");

		teclado.close();
	}

}
