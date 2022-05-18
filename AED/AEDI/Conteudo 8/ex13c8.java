import java.util.Scanner;

public class ex13c8 {

	public static void main(String[] args) {
		String linha, cidade, cidMaior="", cidMenor="";
		int aux=0, rep=0, populacao, eleitor, homem, mulher, somaA, percent, popMaior=0, contCid=0, maisMulher=0, popMenor=0;
		Scanner arquivo = new Scanner(ex5c4.class.getResourceAsStream("c08ex13.txt"));

		linha = arquivo.nextLine();
		System.out.println("Informe a quantidade de Cidades: "+linha);
		rep = Integer.parseInt(linha);
		System.out.println();


		for(aux=1;aux<=rep; aux++) {
			
			linha = arquivo.nextLine();
			System.out.println("Informe a cidade: "+linha);
			cidade=linha;
			linha= arquivo.nextLine();
			System.out.println("Informe a quantidade populacional da cidade: "+linha);
			populacao = Integer.parseInt(linha);
			linha = arquivo.nextLine();
			System.out.println("Informe a quantidade de eleitores: "+linha);
			eleitor = Integer.parseInt(linha);
			linha = arquivo.nextLine();
			System.out.println("Informe a quantidade de homens eleitores: "+linha);
			homem = Integer.parseInt(linha);
			linha = arquivo.nextLine();
			System.out.println("Informe a quantidade de mulheres eleitores: "+linha);
			mulher = Integer.parseInt(linha);
			
			somaA=homem+mulher;
			if(populacao !=somaA) {
				System.out.println("Os valores não batem");
			}
			percent=eleitor*100/populacao;
			System.out.println("A porcentagem de eleitores é: "+percent+"%");
			System.out.println();
			if(populacao>1000000) {
				contCid++;
				popMaior=populacao;
				cidMaior=cidade;
			}
			if(mulher>homem) {
				maisMulher++;
			}
			if(aux==1 || populacao<popMenor){
				popMenor=populacao;
				cidMenor=cidade;
			}
		}
		System.out.println("O número de cidades acima de 1M é: "+contCid+" sendo essa "+cidMaior+" com "+popMaior+" habitantes.");
		System.out.println("O número de cidades com mais mulheres do que homens é de: "+maisMulher);
		System.out.println("A cidade com a menor população é: "+cidMenor);
	}

}
