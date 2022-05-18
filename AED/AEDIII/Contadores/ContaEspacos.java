package Contadores;

import java.io.FileReader;
import java.io.IOException;

public class ContaEspacos {
    public static void main(String[] args) throws IOException {

        FileReader in = new FileReader("file.txt");
        int total=0,space =0, value;

        while ((value = in.read()) != -1) {
            System.out.printf("%s:%d\n", (char)value, value);
            total++;
            if (Character.isWhitespace((char) value)){
                space++;
            }
        }
        in.close();
        System.out.println(total+" caractere(s)");
        System.out.println(space+" espaço(s)");
    }
}
