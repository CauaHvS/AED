import java.util.Scanner;

public class ex14c8 {

	public static void main(String[] args) {
		int rep=0, aux=0,aux2=0;
		char simbolo;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe um número de 1 a 20:");
		rep=teclado.nextInt();
		if(rep<1 && rep>20) {
			System.out.println("Informe um valor entre 1 e 20");
		}
		System.out.println("informe um simbolo qualquer:");
		simbolo=teclado.next().charAt(0);
		
		for(aux2=1; aux2<=rep; aux2++) {
			for(aux=1; aux<=rep; aux++) {
			System.out.print(simbolo+"");
			System.out.println();
			}
		}

		teclado.close();
	}

}
