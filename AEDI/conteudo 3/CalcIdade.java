import java.util.Scanner;

public class CalcIdade {

	public static void main(String[] args) {
		String nome;
		long anoNasc, anoAtual, idade;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		nome = teclado.nextLine();
		System.out.println("Digite o ano em que você nasceu: ");
		anoNasc = teclado.nextLong();
		System.out.println("Digite o ano em que estamos: ");
		anoAtual = teclado.nextLong();
		idade = anoAtual - anoNasc;
		System.out.println(nome + ", você tem/terá " + idade + "anos em: " + anoAtual);
		teclado.close();
	}

}
