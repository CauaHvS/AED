import java.util.Scanner;

public class ex7c8 {

	public static void main(String[] args) {
		String nome, nomeMaior="";
		int aux, cont12=0,cont30=0, idade, soma=0, soma1=0, soma2=0, maioridd=0;
		double media;
		Scanner teclado = new Scanner(System.in);

		for(aux=1; aux<=5; aux++) {
			System.out.println("Informe o nome do aluno:");
			nome=teclado.nextLine();
			System.out.println("informe a idade do aluno:");
			idade=teclado.nextInt();
			teclado.nextLine();
			if(idade<=12) {
				cont12++;
				soma=soma+idade;
			}else {
				if(idade>=30) {
					cont30++;
					soma1=soma1+idade;
				}else {
					soma2=soma2+idade;
				}
			}
			if(aux==1 ||idade>maioridd) {
				maioridd= idade;
				nomeMaior= nome;
			}
		}
		
		media=(soma+soma1+soma2)/5f;
		System.out.println("O número de alunos com até 12 anos é de: "+cont12);
		System.out.println("O número de alunos acima de 30 anos é de: "+cont30);
		System.out.println("O aluno mais velho é: "+nomeMaior+" com "+maioridd+" anos");
		System.out.printf("A media das idades dos alunos é: %1.2f",media);
		teclado.close();
	}
}
