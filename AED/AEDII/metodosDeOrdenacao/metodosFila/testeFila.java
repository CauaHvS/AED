package metodosDeOrdenacao.metodosFila;

public class testeFila {
    private static filaEstatica filaE;
    private static filaDinamica filaD;

    public static void main(String[] args) {

        System.out.println("\n>>>FILA ESTATICA<<<\n");

        filaE = new filaEstatica(4);

        System.out.println("Frente da Fila: " + filaE.consultarInicio());
        System.out.println("A Fila esta vazia? " + filaE.vazia());
        filaE.enfileirar("Item 1");
        filaE.enfileirar(3.14);
        filaE.enfileirar(21);
        System.out.println("frente da Fila: " + filaE.consultarInicio());
        filaE.enfileirar("Item 2");
        filaE.enfileirar(99.78);
        System.out.println("Conteudo da Fila: " + filaE.toString());
        System.out.println("Tamanho da Fila: " + filaE.tamanho());
        filaE.desenfileirar();
        System.out.println("Conteudo da Fila: " + filaE.toString());
        System.out.println("Tamanho da Fila: " + filaE.tamanho());
        System.out.println();
        filaE.enfileirarComPrioridade(9);
        System.out.println("Conteudo da Fila: " + filaE.toString());

        System.out.println("\n>>>FILA DINAMICA<<<\n");

        filaD = new filaDinamica();

        System.out.println("Frente da Fila: " + filaD.consultarInicio());
        System.out.println("A Fila esta vazia? " + filaD.vazia());
        filaD.enfileirar("Item 1");
        filaD.enfileirar(3.14);
        filaD.enfileirar(21);
        System.out.println("frente da Fila: " + filaD.consultarInicio());
        filaD.enfileirar("Item 2");
        filaD.enfileirar(99.78);
        System.out.println("Conteudo da Fila: " + filaD.toString());
        System.out.println("Tamanho da Fila: " + filaD.tamanho());
        filaD.desenfileirar();
        System.out.println("Conteudo da Fila: " + filaD.toString());
        System.out.println("Tamanho da Fila: " + filaD.tamanho());
        System.out.println();
        filaD.enfileirarComPrioridade(89);
        System.out.println("Conteudo da Fila: " + filaD.toString());
        System.out.println("Tamanho da Fila: " + filaD.tamanho());

    }

}
