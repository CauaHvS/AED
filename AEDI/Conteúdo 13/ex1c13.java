import java.util.Scanner;

public class ex1c13 {
    public static void main(String[] args) {
        int x1, x2, y1, y2;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Digite x1: ");
        x1 = keyb.nextInt();
        System.out.println("Digite y1: ");
        y1 = keyb.nextInt();
        System.out.println("Digite x2: ");
        x2 = keyb.nextInt();
        System.out.println("Digite y2: ");
        y2 = keyb.nextInt();
        System.out.println("Distância: " +twoPointsDistance(x1, y1, x2, y2));
        keyb.close();
    }
    static double twoPointsDistance(int x1, int y1, int x2, int y2) {
        double dist;
        dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return dist;
    }
}