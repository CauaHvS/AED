import java.util.Scanner;

public class ex5c8 {

	public static void main(String[] args) {
		int aux, cont1 = 0, cont2 = 0, cont3 = 0, candidato = 0;
		double porcentagem = 0;
		String nome = "";
		Scanner teclado = new Scanner(System.in);

		System.out.println("Candodato 1 - Fulano");
		System.out.println("Candodato 2 - Ciclano");
		System.out.println("Candodato 3 - Beltrano");

		for (aux = 1; aux <= 100; aux++) {
			System.out.println("Informe o número do candidato escolhido:");
			candidato = teclado.nextInt();
			System.out.println();
			switch (candidato) {
			case 1:
				cont1++;
				break;
			case 2:
				cont2++;
				break;
			case 3:
				cont3++;
				break;
			default:
				System.out.println("Informe um candidato valido");
				break;
			}
			if (cont1 > cont2 && cont1 > cont3) {
				nome = "Fulano";
				porcentagem = (cont1 * 100) / 100;

			} else {
				if (cont2 > cont1 && cont2 > cont3) {
					nome = "Ciclano";
					porcentagem = (cont2 * 100) / 100;
				} else {
					if (cont3 > cont1 && cont3 > cont2) {
						nome = "Beltrano";
						porcentagem = (cont3 * 100) / 100;
					}
				}
			}

		}
		System.out.println("O candidato vencedor é " + nome + ", com " + porcentagem + "% dos votos.");
		teclado.close();
	}

}
