import java.util.Scanner;

public class ex11c6 {

	public static void main(String[] args) {
		String equip1, equip2;
		long setsEquip1, setsEquip2, pont1, pont2;
		Scanner teclado = new Scanner(System.in);

		System.out.println("Informe o nome da equipe 1:");
		equip1 = teclado.nextLine();
		System.out.println("Informe o nome da equipe 2:");
		equip2 = teclado.nextLine();
		System.out.println("Informe o número de sets ganhos pela equipe 1 no jogo:");
		setsEquip1 = teclado.nextLong();
		System.out.println("Informe o número de sets ganhos pela equipe 2 no jogo:");
		setsEquip2 = teclado.nextLong();

		if (setsEquip1 == 3 && setsEquip2 == 0) {
			pont1 = 3;
			pont2 = 0;
		} else {
			if (setsEquip1 == 4 && setsEquip2 == 1) {
				pont1 = 3;
				pont2 = 0;
			} else {
				if (setsEquip1 == 3 && setsEquip2 == 2) {
					pont1 = 2;
					pont2 = 1;
				} else {
					if (setsEquip1 == 2 && setsEquip2 == 3) {
						pont1 = 1;
						pont2 = 2;
					} else {
						if (setsEquip1 == 0 && setsEquip2 == 3) {
							pont1 = 0;
							pont2 = 3;
						} else {
							pont1 = 0;
							pont2 = 3;
						}
					}
				}
			}

			System.out.println("No jogo entre " + equip1 + " e " + equip2 + ", a equipe " + equip1 + " pontuou: "
					+ pont1 + "Pts .Enquanto a equipe " + equip2 + " pontuou: " + pont2 + "Pts.");
			teclado.close();
		}
	}
}