public class ex11Dc9 {
	public static void main(String[] args) {
		double serieD = 0, numD, denD;

		for (int aux = 1; aux <= 100; aux++) {
			numD = Math.pow(aux, 3);
			denD = Math.pow(10, aux);
			serieD += numD / denD;
		}
		System.out.println("O valor da SerieD é: "+serieD);
	}

}
