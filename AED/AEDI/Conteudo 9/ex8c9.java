public class ex8c9 {

	public static void main(String[] args) {
		double serie = 0, num, den;

		for (int aux = 1; aux <= 20; aux++) {
			num = (aux * 2 + 1) + Math.sqrt(aux * 4 + 1);
			den = Math.pow(5, aux);
			serie += num / den;
		}
		serie = Math.pow(serie, 2);
		System.out.println("O valor da Serie é: "+serie);
	}

}
