public class ex11Cc9 {
	public static void main(String[] args) {
		double serieC = 0, numC, denC;

		for (int aux = 1; aux <= 100; aux++) {
			numC = (aux * 2 + 1) * Math.sqrt(aux * 4 + 1);
			denC = Math.pow(5, aux);
			serieC += numC / denC;
		}
		serieC = Math.pow(serieC, 2);
		System.out.println("O valor da SerieC é: "+serieC);
	}

}
