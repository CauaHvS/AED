public class ex1c9 {

	public static void main(String[] args) {
		double serie = 0, num, den;
		int cont = 0;
		for (int aux = 37; aux >= 1; aux--) {
			cont++;
			num = aux * (aux + 1);
			den = cont;
			serie += num / den;
		}
		System.out.println("O valor da Serie é: "+serie);
	}

}
