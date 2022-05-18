public class ex11Bc9 {
	public static void main(String[] args) {
		double serieB = 0, numB = 0, denB;

		for (int aux = 1; aux <= 100; aux++) {
			
			numB += (Math.pow(aux, 0) + 4);
			denB = Math.sqrt(aux * 4 + 1);
			serieB += numB / denB;
		}
		serieB = 5 / 3 * (serieB);
		System.out.println("O valor da SerieB é: "+serieB);
	}

}
