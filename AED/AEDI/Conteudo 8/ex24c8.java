
public class ex24c8 {
	public static void main(String[] args) {

		for (int aux3 = 1; aux3 <= 10; aux3++) {
			for (int aux2 = 1; aux2 <= 10; aux2++) {
				for (int aux = 1; aux <= aux2; aux++)
					System.out.print(" * ");
				System.out.println();
			}
			for (int aux2 = 10; aux2 >= 1; aux2--) {
				for (int aux = 1; aux <= aux2; aux++)
					System.out.print(" * ");
				System.out.println();
			}
		}
	}
}
