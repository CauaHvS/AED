import java.util.Scanner;

public class ex9c8 {

	public static void main(String[] args) {
		String nome, sexo;
		int idade,contF=0,contM=0, aux=0, quant=0;
		double mediaM=0, mediaF=0;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a quntidade de repetições:");
		quant=teclado.nextInt();
		teclado.nextLine();
		for(aux=1; aux<=quant; aux++) {
			System.out.println("informe seu nome:");
			nome=teclado.nextLine();
			System.out.println("Informe sua idade:");
			idade=teclado.nextInt();
			System.out.println("Sendo F(Feminino) e M(Masculino)");
			System.out.println("Informe seu sexo:");
			sexo=teclado.nextLine();
			teclado.nextLine();
			
			if (sexo.equalsIgnoreCase("M")) {
				contM++;
				mediaM+=idade;
				mediaM=mediaM/contM;
			} else {
				if (sexo.equalsIgnoreCase("F")) {
					contF++;
					mediaF+=idade;
					mediaF=mediaF/contF;
				}
			}
		}
		System.out.println("A media das idades dos homens é: "+mediaM);
		System.out.println("A media das idades das mulheres é: "+mediaF);
		teclado.close();
	}

}
