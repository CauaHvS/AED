public class ex11Ec9 {
	public static void main(String[] args) {
		double serieE = 0, numE, denE;

		for (int aux = 1; aux <= 100; aux++) {
			numE = Math.pow(aux, 2) * Math.sqrt(aux * 2 + 3);
			denE = Math.pow(aux + 1, aux);
			serieE += numE / denE;
		}
		serieE = (2 / 3) * serieE;
		System.out.println("O valor da SerieE é: "+serieE);
	}

}
