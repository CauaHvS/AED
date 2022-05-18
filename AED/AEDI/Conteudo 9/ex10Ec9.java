public class ex10Ec9 {
	public static void main(String[] args) {
		double serieE = 0, numE, denE;

		for (int aux = 1; aux <= 100; aux++) {

			numE = aux;
			denE = 3 * (aux * 2);
			serieE += numE / denE;

		}
		System.out.println("O valor da SerieE é: " + serieE);
	}
}
