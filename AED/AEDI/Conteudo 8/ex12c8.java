import java.util.Scanner;

public class ex12c8 {

	public static void main(String[] args) {
		int cod;
		double val1=1565, val2=1890, val3=2150, val4=2963, val5=3750, total=0;
		int rep=0, aux=0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("informe a quantidade de repetições: ");
		rep=teclado.nextInt();
		for(aux=1; aux<=rep; aux++) {
		System.out.println("Informe o código do produto: ");
		cod=teclado.nextInt();
		switch(cod) {
		case 1:
			val1+=val1;
			break;
		case 2:
			val2+=val2;
			break;
		case 3:
			val3+=val3;
			break;
		case 4:
			val4+=val4;
			break;
		case 5:
			val5+=val5;
			break;
			default:
				System.out.println("informe um código valido");
		}
		}
		total=val1+val2+val3+val4+val5;
		System.out.println("O custo total é: R$"+total);
		teclado.close();
	}

}
