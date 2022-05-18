import java.util.Scanner;

public class ex13c6 {

	public static void main(String[] args) {
		long hrInicio, hrfinal, minInicio, minFinal, tempoHr, tempoMin;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe a hora em que o jogo começou:");
		hrInicio = teclado.nextLong();
		System.out.println("Informe os minutos em que o jogo começou:");
		minInicio = teclado.nextLong();
		System.out.println("Informe a hora em que o jogo terminou:");
		hrfinal = teclado.nextLong();
		System.out.println("Informe  os minutos em que o jogo terminou:");
		minFinal = teclado.nextLong();

		if (hrInicio < hrfinal) {
			tempoHr = hrfinal - hrInicio;
		} else {
			tempoHr = (hrfinal + 24) - hrInicio - 1;
		}
		if (minInicio < minFinal) {
			tempoMin = minFinal - minInicio;
		} else {
			tempoMin = (minFinal + 60) - minInicio;
		}
		tempoHr = tempoHr - 1;
		System.out.println("hr" + tempoHr + "min" + tempoMin);
		teclado.close();
	}

}
