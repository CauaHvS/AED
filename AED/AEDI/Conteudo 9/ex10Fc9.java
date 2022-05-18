public class ex10Fc9 {
	public static void main(String[] args) {
		double serieF = 0, numF, denF;

		for (int aux = 1; aux <= 100; aux++) {
			numF = Math.pow(aux, 2);
			denF = Math.pow((aux * 2), 2);
			;
			serieF += numF / denF;
		}
		System.out.println("O valor da SerieF é: "+serieF);
	}
}
