import java.util.Scanner;

public class ex17c6 {

	public static void main(String[] args) {
		String tecnico, superior, experiencia, criativa, liderar, trabSozinho, autodidata, remuneracao,
				local;
		int ap1, ap2, ap3, ap4, ap5, ap6, ap7, ap8, ap9, aprovacao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("RESPONDA COM VERDADEIRO OU FALSO");
		System.out.print("Você tem curso técnico de programação? ");
		tecnico = teclado.nextLine();
		System.out.print("Você tem curso superior de programação? ");
		superior = teclado.nextLine();
		System.out.print("Você tem menos de 3 anos de experiência em programação? ");
		experiencia = teclado.nextLine();
		System.out.print("Você se considera uma pessoa criativa? ");
		criativa = teclado.nextLine();
		System.out.print("Você prefere liderar a ser liderado? ");
		liderar = teclado.nextLine();
		System.out.print("Você prefere trabalhar sozinho a trabalhar em equipe?");
		trabSozinho = teclado.nextLine();
		System.out.print("Você é autodidata (aprende sozinho)");
		autodidata = teclado.nextLine();
		System.out.print("Você aceitaria uma remuneração inicial de R$1500?");
		remuneracao = teclado.nextLine();
		System.out.print("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH?");
		local = teclado.nextLine();
		if (tecnico.equalsIgnoreCase("VERDADEIRO") && superior.equalsIgnoreCase("FALSO")
				&& experiencia.equalsIgnoreCase("VERDADEIRO"))
			ap1 = 1;
		else if (tecnico.equalsIgnoreCase("FALSO") && superior.equalsIgnoreCase("VERDADEIRO"))
			ap1 = 1;
		else
			ap1 = 0;
		if (tecnico.equalsIgnoreCase("VERDADEIRO"))
			ap2 = 1;
		else if (superior.equalsIgnoreCase("FALSO") && tecnico.equalsIgnoreCase("VERDADEIRO")
				&& experiencia.equalsIgnoreCase("VERDADEIRO"))
			ap2 = 1;
		else
			ap2 = 0;
		if (tecnico.equalsIgnoreCase("VERDADEIRO") && superior.equalsIgnoreCase("FALSO")
				&& experiencia.equalsIgnoreCase("VERDADEIRO"))
			ap3 = 1;
		else if (tecnico.equalsIgnoreCase("FALSO") && superior.equalsIgnoreCase("VERDADEIRO"))
			ap3 = 1;
		else
			ap3 = 0;
		if (criativa.equalsIgnoreCase("VERDADEIRO"))
			ap4 = 1;
		else
			ap4 = 0;
		if (liderar.equalsIgnoreCase("VERDADEIRO") && remuneracao.equalsIgnoreCase("FALSO"))
			ap5 = 1;
		else
			ap5 = 0;
		if (trabSozinho.equalsIgnoreCase("FALSO"))
			ap6 = 1;
		else
			ap6 = 0;
		if (autodidata.equalsIgnoreCase("VERDADEIRO"))
			ap7 = 1;
		else
			ap7 = 0;
		if (remuneracao.equalsIgnoreCase("VERDADEIRO") && liderar.equalsIgnoreCase("FALSO"))
			ap8 = 1;
		else
			ap8 = 0;
		if (local.equalsIgnoreCase("FALSO"))
			ap9 = 1;
		else
			ap9 = 0;
		aprovacao = ap1 + ap2 + ap3 + ap4 + ap5 + ap6 + ap6 + ap7 + ap8 + ap9;
		if (aprovacao == 9)
			System.out.print("Você foi aprovado");
		else
			System.out.println("Você foi reprovado");
		teclado.close();
	}

}
