import java.util.Scanner;

public class ex17c8 {

	public static void main(String[] args) {
		int rep = 0, aux = 0, tab;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número de 1 a 9:");
		rep = teclado.nextInt();
		System.out.println();
		if (rep < 1 && rep > 9) {
			System.out.println("Informe um valor entre 1 e 9");
		}
		for(aux=1; aux<=9; aux++) {
			tab=rep*aux;
			System.out.println(rep+"x"+aux+"="+tab);
		}
		teclado.close();
	}
}
