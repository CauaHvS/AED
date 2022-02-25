import java.util.Scanner;

public class ex5c4 {

	public static void main(String[] args) {
		String linha;
		Scanner arquivo = new Scanner(ex5c4.class.getResourceAsStream("ficha.txt"));

		linha = arquivo.nextLine();
		System.out.println("FICHA FUNCIONAL DE: " + linha);
		System.out.println();
		System.out.println("Documentos:");
		linha = arquivo.nextLine();
		System.out.println("CPF ..................... " + linha);
		linha = arquivo.nextLine();
		System.out.println("C.I. .................... " + linha);
		linha = arquivo.nextLine();
		System.out.println("Título de Eleitor ....... " + linha);
		linha = arquivo.nextLine();
		System.out.println("Carteira de Motorista ... " + linha);
		System.out.println();
		linha = arquivo.nextLine();
		System.out.println("Empresa:" + linha);
		linha = arquivo.nextLine();
		System.out.println("Salário: R$" + linha);

		arquivo.close();

	}
}
