package metodosDeOrdenacao.metodosPilha;

public class TestePilha {
    private static pilhaEstatica pilhaE;

    public static void main(String[] args) {
        System.out.println("\n>>>PILHA ESTATICA<<<\n");

        pilhaE = new pilhaEstatica(4);

        System.out.println("Topo da pilha: " + pilhaE.consultarTopo());
        System.out.println();
        System.out.println("A pilha esta vaia? " + pilhaE.vazia());
        System.out.println();
        pilhaE.empilhar("item1");
        pilhaE.empilhar(3.14);
        pilhaE.empilhar(21);
        System.out.println("Topo da pilha: " + pilhaE.consultarTopo());
        System.out.println();
        pilhaE.empilhar("item2");
        pilhaE.empilhar(99.78);
        System.out.println("Conteudo da pilha: " + pilhaE.toString());
        System.out.println();
        System.out.println("Tamanho da pilha: " + pilhaE.tamanho());
        System.out.println();
        pilhaE.desempilhar();
        System.out.println("Conteudo da pilha: " + pilhaE.toString());
        System.out.println();
        System.out.println("Tamanho da pilha: " + pilhaE.tamanho());
        pilhaE.limparPilha();
        System.out.println("A pilha esta vaia? " + pilhaE.vazia());
        pilhaE.empilhar("item1");
        pilhaE.empilhar(3.14);
        pilhaE.empilhar(21);
        System.out.println("Tamanho da pilha: " + pilhaE.tamanho());
        System.out.println("Conteudo da pilha: " + pilhaE.toString());
        pilhaE.busca(21);
        System.out.println("Clone da pilha: " + pilhaE.clonarPilha());
        System.out.println("A pilha invertida e: "+pilhaE.inverterPilha());
        pilhaE.aumentarCapacidadePilha(6);
        pilhaE.empilhar(23);
        pilhaE.empilhar(25);
        pilhaE.empilhar(25);
        pilhaE.empilhar(25);
        pilhaE.empilhar(25);
        pilhaE.empilhar(25);
        pilhaE.empilhar(25);
        System.out.println("Tamanho da pilha: " + pilhaE.tamanho());
        System.out.println("Conteudo da pilha: " + pilhaE.toString());


    }
}
