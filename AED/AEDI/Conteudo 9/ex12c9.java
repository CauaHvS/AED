public class ex12c9 {
	public static void main(String[] args) {
		double pi = 0, impar = 1;
		for (int aux = 1; 10000 > aux; aux++) {
			if (aux % 2 == 0) {
				pi -= 1 / impar;
			} else {
				pi += 1 / impar;
			}
			impar += 2;
		}
		pi = 4 * pi;
		System.out.println("Pi com 10mil repetições: " + pi);
	}
}