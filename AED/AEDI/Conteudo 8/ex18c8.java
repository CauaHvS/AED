
public class ex18c8 {

	public static void main(String[] args) {
		int aux, soma = 0;
		double val;
		for (aux = 1; aux <= 100; aux++) {
			val = Math.pow(aux, 2);
			System.out.printf("\n%1.0f",val);
			soma += val;
		}
		
		System.out.println("\nA soma é: "+soma);
	}

}
