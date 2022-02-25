import java.util.Scanner;

public class ex1c7 {

	public static void main(String[] args) {
		int pontos;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a quantidade de acertos do seu jogo:");
		pontos = teclado.nextInt();

		switch (pontos) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("Infelismente vocêe não ganhou nenhum prêmio.");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("Parabens, o seu premio é um outro cartão.");
			break;
		case 11:
			System.out.println("Parabens, você ganhou um premio de: R$100,00.");
			break;
		case 12:
			System.out.println("Parabens, você ganhou um premio de: R$1.000,00.");
			break;
		case 13:
			System.out.println("Parabens, você ganhou um premio de: R$50.000,00.");
			break;
		default:
			System.out.println("Favor informar uma quantidade valida de acertos.");
		}

		teclado.close();
	}

}
