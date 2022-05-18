import java.util.Scanner;

public class ex2c14 {
    public static void main(String[] args) {
        int opcao;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Vamos te dar a área dos seguintes objetos.");
        do {
            double area = 0;
            System.out.println("\n[1]Quadrado \n[2]Retângulo \n[3]Triângulo retãngulo \n[4]Círculo \n[5]Fechar");
            System.out.print("\n>>>");
            opcao = keyb.nextInt();
            if(opcao > 5 || 0 > opcao){
                System.out.println("Opção inválida! Tente novamente");
            }
            switch(opcao){
                case 1: area = areas.quadrado(); break;
                case 2: area = areas.retangulo(); break;
                case 3: area = areas.trianguloRetangulo(); break;
                case 4: area = areas.circulo(); break;
                case 5: System.out.println("Ok :("); break;
                default: System.out.println("Opção inválida!"); break;
            }
            if(area != 0){
                System.out.println("A área foi: " +area);
            }
        }while(opcao != 5);
        System.out.println("Fim!");
        keyb.close();
    }
}
