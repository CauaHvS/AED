
public class ex10Cc9 {

	public static void main(String[] args) {
		double serieC = 0, numC, denC;

		for (int aux = 0; aux <= 100; aux++) {
			numC = (aux + 1) * 2 + 1;
			denC = aux * 2+1;
			serieC += numC / denC;
		}
		serieC = (1 / 3) * Math.pow(serieC, 2);
		System.out.println("O valor da SerieC é: "+serieC);
	}
}
