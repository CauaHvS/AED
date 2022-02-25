import java.util.Scanner;

public class ex6c8 {

	public static void main(String[] args) {
		int aux=0,cont3=0, num, soma=0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Agora você informará 10 números!");
		for(aux=1; aux<=10; aux++) {
			System.out.println("Informe um número:");
			num=teclado.nextInt();
			if(num%4==0) {
				soma+= num;
			}else {
				if(num%3==0) {
					cont3++;
				}
			}
		}
		System.out.println("O valor da soma dos números divisiveis por 4 é: "+soma);
		System.out.println("O número de valores divisiveis por 3 é: "+cont3);
		teclado.close();
	}

}
