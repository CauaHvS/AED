import java.util.Scanner;

public class ex4c7 {

	public static void main(String[] args) {
		String time;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o nome do seu time:");
		time = teclado.nextLine();

		switch (time) {
		case "Am�rica":
		case "Atl�tico":
		case " Cruzeiro":
		case "Villa Nova":
			System.out.println("O seu time � do estado de Minas Gerais");
			break;
		case "Botafogo":
		case "Flamengo":
		case "Fluminense":
		case "Vasco":
			System.out.println("O seu time � do estado do Rio de Janeiro ");
			break;
		case "Corinthians":
		case "Palmeiras":
		case "Santos":
		case "S�o Paulo":
			System.out.println("O seu time � do estado de S�o Paulo");
			break;
		case "Gr�mio":
		case "Internacional":
		case "Juventude":
			System.out.println("O seu time � do estado do Rio Grande do Sul");
			break;
		case "N�utico":
		case "Santa Cruz":
		case "Sport":
			System.out.println("O seu time � do estado de Pernambuco");
			break;
		default:
			System.out.println(
					"Infelismente o seu time nao faz parte dessa lista ou o nome do seu time n�o esta escrito corretamenre.");
		}

		teclado.close();
	}

}
