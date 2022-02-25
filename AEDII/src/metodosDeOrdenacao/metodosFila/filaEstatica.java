package metodosDeOrdenacao.metodosFila;

public class filaEstatica {
    private int inicio;
    private int fim;
    private int contador;
    private int capacidade;
    private Object[] itemArray;

    public filaEstatica() {
        this(100);
    }

    public filaEstatica(int maxCapacidade) {
        inicio = 0;
        fim = 0;
        contador = 0;
        capacidade = maxCapacidade;
        itemArray = new Object[capacidade];
    }

    public boolean vazia() {
        return (contador == 0);
    }

    public int tamanho() {
        return (contador);
    }

    public void enfileirar(Object newItem) {
        if (contador == capacidade) {
            System.out.println("ERRO: Capacidade da fila foi excedida!");
        } else {
            itemArray[fim] = newItem;
            fim = (fim + 1) % capacidade;
            contador++;
        }
    }

    public Object desenfileirar() {
        Object x = null;
        if (vazia()) {
            System.out.println("ERRO: Fila vazia!");
        } else {
            x = itemArray[inicio];
            inicio = (inicio + 1) % capacidade;
            contador--;
        }
        return (x);
    }

    public Object consultarFim() {
        Object x = null;
        if (vazia()) {
            System.out.println("ERRO: Fila vazia!");
        } else {
            if (fim == 0) {
                x = itemArray[capacidade - 1];
            } else {
                x = itemArray[fim - 1];
            }

        }
        return (x);
    }

    public Object consultarInicio() {
        Object x = null;
        if (vazia()) {
            System.out.println("ERRO: Fila vazia!");
        } else {
            x = itemArray[inicio];

        }
        return (x);
    }

    public String toString() {
        String filaCompleta = "";
        if (vazia()) {
            filaCompleta = null;
        } else {
            int j = inicio;
            for (int i = 0; i < contador; i++) {
                filaCompleta = filaCompleta + "\n" + itemArray[j];
                j = (j + 1) % capacidade;
            }
        }
        return (filaCompleta);
    }

    public void enfileirarComPrioridade(Object newItem) {
        if (vazia()) {
            System.out.println("ERRO: Fila vazia!");
        } else {
            if (contador == capacidade) {
                System.out.println("ERRO: A capacidade da fila foi alcan�ada!");
            } else {
                fim = (fim + 1) % capacidade;
                for (int i = fim; i >= 1; i--) {
                    itemArray[i] = itemArray[i - 1];
                }
                itemArray[inicio] = newItem;
                contador++;
            }
        }
    }


}
