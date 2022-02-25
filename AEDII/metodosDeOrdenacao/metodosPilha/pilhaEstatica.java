package metodosDeOrdenacao.metodosPilha;

public class pilhaEstatica {
    private int topo;
    private int contador;
    private int capacidade;
    private Object[] itemArray;
    private Object busca;

    public pilhaEstatica() {
        this(10);
    }

    public pilhaEstatica(int maxCapacidade) {
        topo = 0;
        contador = 0;
        capacidade = maxCapacidade;
        itemArray = new Object[capacidade];
    }

    public boolean vazia() {
        return (topo == 0);
    }

    public int tamanho() {
        return (contador);
    }

    public void empilhar(Object novoItem) {
        if (topo == capacidade) {
            System.out.println("ERRO: Capacidade da pilha foi excedida!");
        } else {
            itemArray[topo++] = novoItem;
            contador++;
        }
    }

    public Object desempilhar() {
        Object x = null;
        if (vazia()) {
            System.out.println("ERRO: pilha vazia!");
        } else {
            x = itemArray[--topo];
            contador--;
        }
        return (x);
    }

    public void limparPilha() {
        for (int i = 0; i < itemArray.length; i++)
            itemArray[i] = 0;
        topo = 0;
    }

    public Object consultarTopo() {
        Object x = null;
        if (vazia()) {
            System.out.println("ERRO: pilha vazia!");
        } else {
            x = itemArray[--topo];

        }
        return (x);
    }

    public Object busca(Object buscar) {
        boolean encontrado = false;
        if (vazia()) {
            System.out.println("ERRO: pilha vazia!");
        } else {
            for (int i = 0; i < itemArray.length; i++) {
                if (itemArray[i] == busca) {
                    encontrado = true;
                }
            }

        }
        return ("O item" + busca + " " + (encontrado ? "foi" : "n�o foi") + " encontrado");
    }

    public String toString() {
        String pilhaCompleta = "";
        if (vazia()) {
            System.out.println("ERRO: pilha vazia!");
        } else {
            for (int i = topo - 1; i >= 0; i--) {
                pilhaCompleta = pilhaCompleta + "\n" + itemArray[i];

            }
        }
        return (pilhaCompleta);
    }

    public Object clonarPilha() {
        pilhaEstatica temPilha = new pilhaEstatica();
        pilhaEstatica clone = new pilhaEstatica();

        if (this.vazia()) {
            System.out.println("ERRO: Pilha vazia!");
        } else {
            for (int i = 0; i < this.itemArray.length; i++) {
                Object x = this.desempilhar();
                temPilha.empilhar(x);
            }
            for (int i = 0; i < this.itemArray.length; i++) {
                Object x = temPilha.desempilhar();
                clone.empilhar(x);
                this.empilhar(x);
            }
        }
        return (clone);
    }

    public Object inverterPilha() {
        pilhaEstatica temPilha = new pilhaEstatica();
        pilhaEstatica clone = new pilhaEstatica();

        if (this.vazia()) {
            System.out.println("ERRO: Pilha vazia!");
        } else {
            for (int i = 0; i < this.itemArray.length; i++) {
                Object x = this.desempilhar();
                temPilha.empilhar(x);
            }
            Object x = temPilha;
            clone.empilhar(x);
            this.empilhar(x);
        }
        return (clone);
    }

    public void aumentarCapacidadePilha(int capacidade){
        Object[] novaArray;
        if(this.tamanho() == itemArray.length){
            novaArray = new Object[capacidade];
            for (int i=0; i<this.itemArray.length; i++){
                novaArray[i] = this.itemArray[i];
            }
            this.itemArray = novaArray;
        }
    }

}
