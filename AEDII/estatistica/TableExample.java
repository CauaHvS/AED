package estatistica;

import javax.swing.*;

public class TableExample {


    Object data1 = new Object();
    static JFrame f;



    public static void Table(Object[] vet, double tamanho) {
        f = new JFrame();
        Object vetX[] = new Object[(int) tamanho];
        double x = 1, y = 500, z = 700, w = 123, a = 10, b;
        b = x + a;
        for (int i = 0; i < tamanho; i++) {
            vetX[i]= "{"+vet+"}";
        }
        for (int i = 0; i < tamanho; i++) {
            vetX[i]= "{"+vet+"}";
        }

        Object row[][] = {vetX};
        /*{ { x + " |--- " + b+a, y, z, w}, { String.format("%.2f", (x = b)) + "|---" + String.format("%.2f", b += a), y, z, w }, { String.format("%.2f", (x = b)) + "|---" + String.format("%.2f", b += a), y, z, w }, { String.format("%.2f", (x = b)) + "|---" + String.format("%.2f", b += a), y, z, w }, { String.format("%.2f", (x = b)) + "|---" + String.format("%.2f", b += a), y, z, w }, { String.format("%.2f", (x = b)) + "|---" + String.format("%.2f", b += a), y, z, w }, { String.format("%.2f", (x = b)) + "|---" + String.format("%.2f", b += a), y, z, w }, { String.format("%.2f", (x = b)) + "|---" + String.format("%.2f", b += a), y, z, w }, { String.format("%.2f", (x = b)) + "|---" + String.format("%.2f", b += a), y, z, w }, { String.format("%.2f", (x = b)) + "|---" + String.format("%.2f", b += a), y, z, w }};*/



        String column[] = { "X","f", "F", "Xi"}; //, " // };
        JTable jt = new JTable(row, column);


        jt.setBounds(30, 40, 200, 300);
        JScrollPane sp = new JScrollPane(jt);
        f.add(sp);
        f.setSize(300, 400);
        f.setVisible(true);
    }

}
/* {String.format("%.2f", (x=b)) +"|---"+String.format("%.2f", b+=a),y,z,w}, */