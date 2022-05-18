public class ex10Bc9 {
	public static void main(String[] args) {
		double serieB = 0, numB, denB;

		for (int aux = 1; aux <= 100; aux++) {
			
			numB = aux * 2;
			denB = aux * 3;
			serieB += numB / denB;
		}
		serieB = 1 + Math.sqrt(serieB);
		System.out.println("O valor da SerieB é: "+serieB);
	}
}
