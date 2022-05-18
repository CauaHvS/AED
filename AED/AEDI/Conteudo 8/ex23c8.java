
public class ex23c8 {

	public static void main(String[] args) {
		int aux=1;
		double mult=0, serie, soma=0;
		mult=Math.pow(2, aux);
		soma+=mult;
		for(aux=1; aux<=99; aux++) {
			mult=Math.pow(2, aux+2);
			soma+=mult;
		}
		serie=(1/3)*soma;
		System.out.println(serie);
	}

}
