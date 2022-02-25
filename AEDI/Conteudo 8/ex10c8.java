import java.util.Scanner;

public class ex10c8 {

	public static void main(String[] args) {
		String linha, nome = "", nomeMaior = "";
		int aux = 0, rep = 0;
		double preco = 0, media = 0, precoMaior = 0;
		Scanner arquivo = new Scanner(ex5c4.class.getResourceAsStream("c08ex10.txt"));

		linha = arquivo.nextLine();
		System.out.println("Infore a quantidade de insumos: " + linha);
		rep = Integer.parseInt(linha);

		for (aux = 1; aux <= rep; aux++) {
			linha = arquivo.nextLine();
			System.out.println("Informe o insumo: " + linha);
			linha = arquivo.nextLine();
			System.out.println("Informe a quantidade: " + linha);
			linha = arquivo.nextLine();
			System.out.println("Informe o peço do insumo: " + linha);
			preco = Double.parseDouble(linha);
			preco += preco;
			System.out.println(preco);
			if (aux == 1 || preco < precoMaior) {
				precoMaior = preco;
				nomeMaior = nome;
			}
		}
		media = preco / rep;
		System.out.println("A media é: " + media);
	}

}
