public class ex10Ac9 {

	public static void main(String[] args) {
		double serieA = 0, numA, denA;

		for (int aux = 1; aux <= 100; aux++) {
			numA = aux;
			denA = Math.sqrt(aux * 2);
			serieA = numA / denA;
		}
		System.out.println("O valor da SerieA é: "+serieA);
	}

}
