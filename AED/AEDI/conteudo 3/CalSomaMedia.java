import java.util.Scanner;
public class CalSomaMedia {

	public static void main(String[] args) {
		// Fução: Calcula a media de 3 numeros inteiros
		// Autor: Cauã Henrique Viava Salgado
				long n1, n2, n3, soma;
				double media;
				Scanner teclado = new Scanner(System.in);
				System.out.println("Informe um numero inteiro: ");
				n1 = teclado.nextLong();
				System.out.println("Informe outro numero inteiro: ");
				n2 = teclado.nextLong();
				System.out.println("Informe mais um numero inteiro: ");
				n3 = teclado.nextLong();
				soma = n1 + n2 + n3;
				media = soma / 3;
				System.out.println("A sua media é: " + media);
				teclado.close();
			}

		}


