import java.util.Scanner;

public class ex16c6 {

	public static void main(String[] args) {
		double nota1, nota2, nota3, trabFin, notaFin, media;
		long idade, peso1, peso2, falta;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a sua nota da primeira prova:");
		nota1 = teclado.nextDouble();
		System.out.println("Informe a sua nota da segunda prova:");
		nota2 = teclado.nextDouble();
		System.out.println("Informe a sua nota da teceira prova:");
		nota3 = teclado.nextDouble();
		System.out.println("Informe a sua nota do trabalho final:");
		trabFin = teclado.nextDouble();
		System.out.println("Informe a quantidade de faltas :");
		falta = teclado.nextLong();
		System.out.println("Informe a sua idade:");
		idade = teclado.nextLong();

		if (nota1 < nota2 && nota1 < nota3) {
			media = (nota2 + nota3) / 2;
		} else {
			if (nota2 < nota1 && nota2 < nota3) {
				media = (nota1 + nota3) / 2;
			} else {
				media = (nota1 + nota2) / 2;
			}
		}

		if (falta <= 5) {
			peso1 = 3;
		} else {
			if (falta <= 10) {
				peso1 = 2;
			} else {
				peso1 = 1;
			}

			if (idade <= 17) {
				peso2 = 1;
			} else {
				if (idade <= 50) {
					peso2 = 2;
				} else {
					peso2 = 3;
				}
				notaFin = media * peso1 + trabFin * peso2;

				if (notaFin <= 50) {
					System.out.println("Reprovado");
				} else {
					if (notaFin <= 70) {
						System.out.println("Regular");
					} else {
						if (notaFin <= 80) {
							System.out.println("Bom");
						} else {
							if (notaFin <= 90) {
								System.out.println("Muito bom");
							} else {
								System.out.println("Exelente");
							}
						}
					}
				}
			}
		}

		teclado.close();

	}

}
