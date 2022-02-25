
public class ex15c8 {

	public static void main(String[] args) {
		int aux, val=0, cont=0, total;
		
		for(aux=1000; aux<=2000; aux++) {
			if(aux%2!=0) {
				cont++;
				val+=aux;
			}
		}
		total=val/cont;
		System.out.println("A media é: "+total);

	}

}
