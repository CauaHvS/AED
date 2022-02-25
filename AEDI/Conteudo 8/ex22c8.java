
public class ex22c8 {

	public static void main(String[] args) {
		int aux=0, num, parte1, parte2, parte3;
		String pStrg1, pStrg2;
		double numMaior=0, media, cont=0;
		
		for(aux=1000; aux<=9999; aux++) {
			num=aux;
			parte1=num%10;
			parte2=num/100%10;
			parte3=num/100;
			pStrg1=parte1+""+parte2;
			pStrg2=String.valueOf(parte3);
			
			if(pStrg1.equalsIgnoreCase(pStrg2)) {
				System.out.println(parte3+""+parte2+""+parte1);
				numMaior+=aux;
				cont++;
			}
		}
		media=numMaior/cont;
		System.out.println("A media é: "+media);
	}

}
