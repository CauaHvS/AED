import java.util.Scanner;

public class ex5c13 {
    public static void main(String[] args) {
        int angulo;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Digite um ângulo: ");
        angulo = keyb.nextInt();
        System.out.println("Seno: "+Math.sin(angulo));
        System.out.println("Cosseno: "+Math.cos(angulo));
        System.out.println("Tangente: "+Math.tan(angulo));
        System.out.println("Arco seno: "+Math.asin(angulo));
        System.out.println("Arco tangente: "+Math.atan(angulo));
        System.out.println("Arco cosseno: "+Math.acos(angulo));
        System.out.println("fim");
        keyb.close();
    }
}


