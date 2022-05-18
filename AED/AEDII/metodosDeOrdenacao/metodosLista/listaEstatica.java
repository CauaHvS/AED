package metodosDeOrdenacao.metodosLista;

import metodosDeOrdenacao.metodosPilha.pilhaEstatica;
import ordenacao.Ordenacao;

public class listaEstatica {
    private int inicio;
    private int fim;
    private int contador;
    private int capacidade;
    private Object[] itemArray;
    private Ordenacao ordem = new Ordenacao();

    public listaEstatica() {
        this(10);
    }

    public listaEstatica(int maxCapacidade) {
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

    private boolean chaveValida(int posicao) {
        return (1 <= posicao && posicao <= contador);
    }

    public Object consultarInicio() {
        Object x = null;
        if (vazia()) {
            System.out.println("ERRO: Lista vazia!");
        } else {
            x = itemArray[inicio];

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

    public void inserir(Object newItem) {
        inserir(newItem, contador + 1);
    }

    public void inserirInicio(Object newItem) {
        inserir(newItem, 0);
    }

    public void inserirFim(Object newItem) {
        inserir(newItem, contador + 1);
    }

    public void inserir(Object newItem, int posicao) {
        if (contador == capacidade) {
            System.out.println("ERRO: Capacidade da Lista foi excedida");
        } else {
            if (posicao == contador + 1) {
                itemArray[fim] = newItem;
                fim = (fim + 1) % capacidade;
                contador++;
            } else {
                if (posicao == 0) {
                    mover(inicio, fim, 1);
                    itemArray[0] = newItem;
                    inicio = 0;
                    contador++;
                } else {
                    if (!chaveValida(posicao)) {
                        System.out.println("ERRO: Indice invalido!");
                    } else {
                        mover(posicao - 1, fim, 1);
                        itemArray[posicao - 1] = newItem;
                        contador++;
                    }
                }
            }
        }
    }

    private void mover(int begin, int end, int shift) {
        int i, j;
        if (shift == 1) {
            if (end <= capacidade) {
                if (end == fim) {
                    fim = (fim + 1) % capacidade;
                }
                if (fim != inicio) {
                    j = (end + 1) % capacidade;
                    i = end;
                } else {
                    j = end;
                    i = end - 1;
                }
                while (i != begin && i != inicio) {
                    itemArray[j] = itemArray[i];
                    j = i;
                    i = (i + capacidade - 1) % capacidade;
                }
                itemArray[j] = itemArray[i];
                if (begin == inicio) {
                    inicio = (inicio - 1) % capacidade;
                }
            }
        } else {
            if (begin <= capacidade) {
                if (begin == inicio) {
                    inicio = (inicio + capacidade - 1) % capacidade;
                }
                if (fim != inicio) {
                    j = (begin + capacidade - 1) % capacidade;
                    i = begin;
                } else {
                    j = begin;
                    i = begin % capacidade;
                }
                while (i != end && i != fim) {
                    itemArray[j] = itemArray[i];
                    j = i;
                    i = (i + 1) % capacidade;
                }
                if (end != fim) {
                    itemArray[j] = itemArray[i];
                }
                if (end == fim) {
                    fim = (fim + capacidade - 1) % capacidade;
                }
            }
        }
    }

    public Object retirar() {
        return (retirar(inicio));
    }

    public Object retirarInicio() {
        return (retirar(inicio));
    }

    public Object retirarFim() {
        return (retirar(fim));
    }

    public Object retirar(int posicao) {
        Object x = null;
        int i, j;
        if (vazia()) {
            x = "ERRO: Lista vazia!";
        } else {
            if (posicao == inicio) {
                x = itemArray[inicio];
                inicio = (inicio + 1) % capacidade;
                contador--;
            } else {
                if (posicao == fim) {
                    if (fim != 0) {
                        x = itemArray[fim - 1];
                        fim = (fim + capacidade - 1) % capacidade;
                    } else {
                        fim = (fim + capacidade - 1) % capacidade;
                        x = itemArray[fim];
                    }
                    contador--;
                } else {
                    if (!chaveValida(posicao)) {
                        x = "ERRO: Indice invalido!";
                    } else {
                        i = inicio;
                        for (j = 1; j < posicao; j++) {
                            i = (i = 1) % capacidade;
                        }
                        x = itemArray[i];
                        mover(posicao, fim, -1);
                        contador--;
                    }
                }
            }
        }
        return (x);
    }

    public String toString() {
        String listaCompleta = "";
        if (vazia()) {
            listaCompleta = null;
        } else {
            int i = inicio;
            for (int j = 0; j < contador; j++) {
                listaCompleta = listaCompleta + "\n" + itemArray[i];
                i = (i + 1) % capacidade;
            }
        }
        return (listaCompleta);
    }

    public void limpar() {
        if (vazia()) {
            System.out.println("ERRO: A lista ja esta vazia!");
        } else {
            while (!vazia()) {
                for (int i = 1; i < contador - 1; i++) {
                    itemArray[i] = itemArray[i + 1];
                }
                itemArray[contador - 1] = 0;
                contador--;
            }
        }
    }

    public void ordenar() {
        int[] vetor = new int[itemArray.length];
        for (int i = 0; i < itemArray.length; i++) {
            vetor[i] = (int) itemArray[i];
        }
        ordem.BubbleSort(vetor);
        for (int i = 0; i < itemArray.length; i++) {
            itemArray[i] = vetor[i];
        }
    }
    public Object inverterLista() {
        listaEstatica tempLista = new listaEstatica();
        listaEstatica clone = new listaEstatica();
        if (this.vazia()) {
            System.out.println("ERRO: Lista vazia!");
        } else {
            for (int i = 0; i < this.itemArray.length; i++) {
                Object x = this.retirarFim();
                tempLista.inserir(x);
            }
            Object x = tempLista;
            clone.inserirInicio(x);
            this.inserirInicio(x);
        }
        return (clone);
    }
}
