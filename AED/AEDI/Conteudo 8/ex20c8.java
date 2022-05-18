import java.util.Scanner;

public class ex20c8 {

	public static void main(String[] args) {
		int aux=0;
		double altura,imc;
		String situacao="";
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a sua altura em metros:");
		altura=teclado.nextDouble();
		altura=Math.pow(altura, 2);
		System.out.println("Peso(Kg)  IMC    Situação Corpórea");
		for(aux=60; aux<=100; aux++) {
			imc=aux/altura;
			if(imc< 18.5) {
				situacao="Abaixo do peso";
			}else {
				if(imc< 24.9) {
					situacao="Peso Normal";
				}else {
					if(imc< 29.9) {
						situacao="Sobrepeso";
					}else {
						if(imc< 34.9) {
							situacao="Obesidade grau 1";
						}else {
							if(imc< 39.9) {
								situacao="Obesidade grau 2";
							}else {
								situacao="Obesidade grau 3";
							}
						}
					}
				}
			}
			System.out.printf("\n%d(Kg) - %4.2f - %s", aux, imc, situacao);
		}
		
		
		teclado.close();
	}

}
