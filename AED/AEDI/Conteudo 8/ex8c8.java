import java.util.Scanner;

public class ex8c8 {

	public static void main(String[] args) {
		long notaFinal, faltas;
		int aux, cont16 = 0, contMed = 0;
		double media = 0;
		Scanner teclado = new Scanner(System.in);

		for (aux = 1; aux <= 50; aux++) {
			System.out.println("informe sua nota final: ");
			notaFinal = teclado.nextLong();
			if (notaFinal == -1) {
				System.out.println("Informe um valor valido");
				System.out.println("Reinicie a contagem");
				break;
			}

			System.out.println("Informe a quantidade de faltas: ");
			faltas = teclado.nextLong();

			if (notaFinal >= 65 && faltas <= 16) {
				System.out.println("Você foi APROVADO");
				contMed++;
				media += notaFinal;
				media = media / contMed;
			} else {
				System.out.println("Você foi REPROVADO");
				if (faltas > 16) {
					cont16++;
				}
			}
			System.out.println();
		}
		System.out.println("A media das notas dos aluons aprovados é de: " + media);
		System.out.println("O número de alunos com mais de 16 faltas é de: " + cont16);
		teclado.close();
	}

}
