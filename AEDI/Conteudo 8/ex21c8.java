import java.util.Scanner;

public class ex21c8 {

	public static void main(String[] args) {
		long num, div;
		int aux=0, cont=0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um n�mero inteiro qualquer:");
		num=teclado.nextLong();
		
		if(num>1) {
			for(aux=1; aux<=num; aux++) {
				if(num%aux==0)
					cont++;
				}
			if(cont==2) {
				System.out.println("O n�mero "+num+" � primo");
			}else {
				System.out.println("O n�mero "+num+" n�o � primo");
			}
		}else {
			System.out.println("Informe um valor acima de 1.");
		}
		teclado.close();
	}

}
