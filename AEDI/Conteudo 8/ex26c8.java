
public class ex26c8 {
	public static void main(String[] args) {

		for (int aux3 = 1; aux3 <= 5; aux3++) {
			for (int aux2 = 0; aux2 <= 5; aux2++) {
				for (int aux = 1; aux <= Math.pow(2, aux2); aux++)
					System.out.print(" * ");
				System.out.println();
			}
			for (int aux2 = 4; aux2 >= 0; aux2--) {
				for (int aux = 1; aux <= Math.pow(2, aux2); aux++)
					System.out.print(" * ");
				System.out.println();
			}
		}
	}
}
