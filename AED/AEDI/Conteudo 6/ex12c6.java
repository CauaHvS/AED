import java.util.Scanner;

public class ex12c6 {

	public static void main(String[] args) {
		long quantBolas, bolasDef, numGalpao, numCaixas, mesesCopa, restoCaixas, restGapao, local = 850,
				bolaPCaixa = 10;
		double pecoCaixas, aluguelGalpao, custoCaixa, custoLocal, custoTotal;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a quantidade de bolas produzidas:");
		quantBolas = teclado.nextLong();
		System.out.println("Informe a quantidade de bolas com defeito produzidas:");
		bolasDef = teclado.nextLong();
		System.out.println("Informe o preço unitario das caixas de papelão:");
		pecoCaixas = teclado.nextDouble();
		System.out.println("Informe a quantidade de meses até a copa:");
		mesesCopa = teclado.nextLong();
		System.out.println("Informe o preço do aluguel do galpão:");
		aluguelGalpao = teclado.nextLong();

		quantBolas = quantBolas - bolasDef;

		numCaixas = quantBolas / bolaPCaixa;
		restoCaixas = quantBolas % bolaPCaixa;

		if (restoCaixas != 0) {
			numCaixas = numCaixas + 1;
		}
		custoCaixa = numCaixas * pecoCaixas;

		numGalpao = numCaixas / local;
		restGapao = numCaixas % local;
		if (restGapao != 0) {
			numGalpao = numGalpao + 1;
		}
		custoLocal = numGalpao * aluguelGalpao * mesesCopa;

		custoTotal = custoCaixa + custoLocal;

		System.out.println("caixas" + numCaixas);
		System.out.println("galpoes" + numGalpao);
		System.out.println("meses " + mesesCopa);
		System.out.println("O valor gasto com caixas será de: R$" + custoCaixa + " e o aluguel dos galpoes sera de: R$"
				+ custoLocal);
		System.out.println("Sendo assim o total gasto será de: R$" + custoTotal);

		teclado.close();
	}

}
