import java.util.Scanner;

public class ex4c6 {

	public static void main(String[] args) {
		double peso, altura, imc;
		String nome;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite seu nome:");
		nome = teclado.nextLine();
		System.out.println("Digite sua altura(em metros):");
		altura = teclado.nextDouble();
		System.out.println("Digite seu peso(Kg):");
		peso = teclado.nextDouble();

		imc = peso / Math.pow(altura, 2);

		if (imc < 18) {
			System.out.println("Seus dados s�o: ");
			System.out.println("Nome: " + nome);
			System.out.println("Altura: " + altura);
			System.out.println("Peso: " + peso);
			System.out.println("Seu Imc �: " + imc + " e voc� est� desnutrida");
		} else {
			if (imc > 18 && imc < 20) {
				System.out.println("Seus dados s�o: ");
				System.out.println("Nome: " + nome);
				System.out.println("Altura: " + altura);
				System.out.println("Peso: " + peso);
				System.out.println("Seu Imc �: " + imc + " e voc� est� abaixo do peso");
			} else {
				if (imc >= 20 && imc <= 25) {
					System.out.println("Seus dados s�o: ");
					System.out.println("Nome: " + nome);
					System.out.println("Altura: " + altura);
					System.out.println("Peso: " + peso);
					System.out.println("Seu Imc �: " + imc + " e voc� est� no peso ideal");
				} else {
					if (imc < 25 && imc <= 27) {
						System.out.println("Seus dados s�o: ");
						System.out.println("Nome: " + nome);
						System.out.println("Altura: " + altura);
						System.out.println("Peso: " + peso);
						System.out.println("Seu Imc �: " + imc + " e voc� est� acima do peso");
					} else {
						System.out.println("Seus dados s�o: ");
						System.out.println("Nome: " + nome);
						System.out.println("Altura: " + altura);
						System.out.println("Peso: " + peso);
						System.out.println("Seu Imc �: " + imc + " e voc� est� obeso/a");
					}
				}
			}
		}
		teclado.close();
	}

}
