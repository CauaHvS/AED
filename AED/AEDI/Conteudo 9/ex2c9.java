
public class ex2c9 {

	public static void main(String[] args) {
		double serie = 0, num, den;

		for (int aux = 1; aux <= 100; aux++) {
			num = aux;
			den = Math.pow(aux, 2) + (aux - 1);
			serie += num / den;
		}
		System.out.println("O valor da Serie é: "+serie);
	}

}
