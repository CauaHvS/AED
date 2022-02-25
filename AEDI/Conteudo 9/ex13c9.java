public class ex13c9 {
	public static void main(String[] args) {
		double serieDesafio = 0, fatorial;

		for (int aux1 = 1; 10 >= aux1; aux1++) {
			fatorial = 1;
			for (int aux2 = aux1; aux2 > 1; aux2--) {
				fatorial *= aux2;
			}
			if (aux1 % 2 != 0) {
				serieDesafio += fatorial / (Math.pow(2, aux1) - 1);
			} else {
				serieDesafio -= fatorial / (Math.pow(2, aux1) - 1);
			}
		}
		System.out.println("O valor do desafio é: " + serieDesafio);
	}
}