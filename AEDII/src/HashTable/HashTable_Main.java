package HashTable;

public class HashTable_Main {

    private static HashTable hash;

    public static void main(String[] args) {
        hash= new HashTable( 4);
        hash.enderecoAbertoOn();
        hash.useRehashOff();
        String vet [] = {"5","8","1","3","9","6","2","7","4"};

        for (String elementos : vet){
            hash.inserir(elementos);
            System.out.println(Integer.parseInt(elementos)%4);
        }



        /*hash.inserir("5");
        hash.inserir("8");
        hash.inserir("1");
        hash.inserir("3");
        hash.inserir("9");
        hash.inserir("6");
        hash.inserir("2");
        hash.inserir("7");
        hash.inserir("4");*/
        System.out.println(hash.toString());
        System.out.println();

        System.out.println("Item 6 esta na hash? "+hash.pesquisar("6"));
        System.out.println("Item 35 esta naa hash? "+hash.pesquisar("35"));
        System.out.println();


        hash.retirar("10");
        hash.retirar("0");
        System.out.println(hash.toString());
        System.out.println("O tamanho da Hash e: "+hash.tamanho());
        System.out.println();

        /*System.out.println("Reiniciando a tabela hash!");
        hash.reiniciar();
        System.out.println();
        System.out.println(hash.toString());
        System.out.println("O tamanho da Hash e: "+hash.tamanho());*/

        /*hash.enderecoAbertoOff();
        hash= new HashTable( 10);

        hash.inserir("9");
        hash.inserir("6");
        hash.inserir("7");
        hash.inserir("55");
        hash.inserir("14");
        hash.inserir("31");
        hash.inserir("11");
        hash.inserir("20");
        hash.inserir("2");
        hash.inserir("16");
        hash.inserir("25");
        hash.inserir("48");

        System.out.println(hash.toString());
        System.out.println("O tamanho da Hash e: "+hash.tamanho());
        System.out.println("Item 10 esta na hash? "+hash.pesquisar("10"));
        System.out.println("Item 0 esta naa hash? "+hash.pesquisar("0"));
        System.out.println();

        hash.retirar("2");
        hash.retirar("25");
        hash.retirar("48");
        hash.retirar("31");
        hash.retirar("1");

        System.out.println(hash.toString());
        System.out.println("O tamanho da Hash e: "+hash.tamanho());*/




    }
}
