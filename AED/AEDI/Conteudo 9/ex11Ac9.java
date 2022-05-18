public class ex11Ac9 {
	public static void main(String[] args) {
		double serieA = 0, numA, denA;

		for (int aux = 1; aux <= 100; aux++) {
			numA = aux + ((Math.pow(aux, 2)) + 4);
			denA = Math.pow(4, aux);
			serieA = numA / denA;
		}
		serieA = Math.cbrt(serieA);
		System.out.println("O valor da SerieA é: "+serieA);
	}

}
