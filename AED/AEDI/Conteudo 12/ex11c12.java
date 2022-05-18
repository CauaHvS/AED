import java.util.Scanner;

public class ex11c12 {
    public static void main(String[] args) {
        String alunoNota[][] = new String[8][2], maiorNome;
        double maiorNota;
        Scanner keyb = new Scanner(System.in);
        System.out.println("Nos informe 50 alunos e suas notas, e vamos falar qual tem a maior!");
        for (int contador = 0; alunoNota.length > contador; contador++) {
            System.out.println("Digite o nome do aluno: ");
            alunoNota[contador][0] = keyb.nextLine();
            System.out.println("Digite a nota da prova de " + alunoNota[contador][0] + ": ");
            alunoNota[contador][1] = keyb.nextLine();
        }
        maiorNota = Double.valueOf(alunoNota[0][1]);
        maiorNome = alunoNota[0][0];
        for (int contador = 0; alunoNota.length > contador; contador++) {
            if (maiorNota < Double.valueOf(alunoNota[contador][1])) {
                maiorNota = Double.valueOf(alunoNota[contador][1]);
                maiorNome = alunoNota[contador][0];
            }
        }
        System.out.printf("\nO(a) Aluno(a) com a maior nota foi %s, com a nota %f3.2", maiorNome, maiorNota);
        keyb.close();
    }
}
