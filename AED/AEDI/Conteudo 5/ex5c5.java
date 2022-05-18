import java.util.Scanner;

public class ex5c5 {

	public static void main(String[] args) {
		double gFahrenheit, gCelsius, gKelvin;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Olá agora veremos conversão de temperaturas!!!");
		System.out.println("Favor digitar a temperatura atual em graus Celsius:");
		gCelsius = teclado.nextDouble();

		gKelvin = gCelsius + 273;
		gFahrenheit = (9 * gCelsius + 160) / 5;

		System.out.println("A sua temperatura em Graus Kelvin é: " + gKelvin + "°");
		System.out.println("A sua temperatura em Graus Fahrenheit é: " + gFahrenheit + "°");

		teclado.close();
	}

}
