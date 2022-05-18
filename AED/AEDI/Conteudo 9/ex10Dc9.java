public class ex10Dc9 {
	public static void main(String[] args) {
		double serieD = 0, numD, denD;

		for (int aux = 1; aux <= 100; aux++) {
			
			numD = aux + (aux - 1);
			denD = Math.pow(aux, 2);
			serieD += numD / denD;
			
		}
	
		System.out.println("O valor da SerieD é: "+serieD);
	}
}
