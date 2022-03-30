import java.util.Scanner;

public class areas {
	public static Scanner keyb = new Scanner(System.in);
	static double lado1, lado2, area;

	public static double quadrado() {
		System.out.println("Digite o lado: ");
		lado1 = keyb.nextDouble();
		area = Math.pow(lado1, 2);
		return area;
	}

	public static double retangulo() {
		System.out.println("Digite a base: ");
		lado1 = keyb.nextDouble();
		System.out.println("Digite a altura: ");
		lado2 = keyb.nextDouble();
		area = lado1 * lado2;
		return area;
	}

	public static double trianguloRetangulo() {
		System.out.println("Digite a base: ");
		lado1 = keyb.nextDouble();
		System.out.println("Digite a altura: ");
		lado2 = keyb.nextDouble();
		area = (lado1 * lado2) / 2;
		return area;
	}

	public static double circulo() {
		System.out.println("Digite o raio do círculo: ");
		lado1 = keyb.nextDouble();
		area = Math.PI * Math.pow(lado1, 2);
		return area;
	}

}
