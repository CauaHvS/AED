import java.util.Scanner;

public class ex4c8 {

	public static void main(String[] args) {
		String nome="";
		int aux, cont = 0, cont1 = 0, idade;
		Scanner teclado = new Scanner(System.in);

		for (aux = 1; aux <= 50; aux++) {
			System.out.println("Informe seu nome:");
			nome = teclado.nextLine();
			System.out.println("Informe sua idade");
			idade = teclado.nextInt();
			teclado.nextLine();
			if (idade > 18)
				cont++;
			cont1=50-cont;
			
		}
		System.out.println("O número de alunos acima de 18 anos: "+cont);
		System.out.println("O número de alunos abaixo de 18 anos: "+cont1);
		teclado.close();
	}

}
