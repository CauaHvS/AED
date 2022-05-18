public class ex11Fc9 {
	public static void main(String[] args) {
		double serieF = 0, numF, denF = 0;

		for (int aux = 1; aux <= 100; aux++) {
			numF = (Math.pow(aux, 2) - 1) * (Math.pow(2, aux + 1));
			denF = Math.pow(aux * 5 - 3, 2);
			serieF += numF / denF;

		}
		serieF = 5 * Math.sqrt(serieF);
		System.out.println("O valor da SerieF é: " + serieF);
	}

}
