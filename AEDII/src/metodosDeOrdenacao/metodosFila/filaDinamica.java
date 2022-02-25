package metodosDeOrdenacao.metodosFila;

import metodosDeOrdenacao.Celula;

public class filaDinamica {
    private Celula inicio;
    private Celula fim;
    private int contador;

    public filaDinamica() {
        inicio = null;
        fim = null;
        contador = 0;
    }

    public boolean vazia() {
        return (contador == 0);
    }

    public int tamanho() {
        return (contador);
    }

    public void enfileirar(Object novoItem) {
        Celula novaCelula = new Celula(novoItem);
        if (inicio == null) {
            inicio = novaCelula;
        } else {
            fim.anterior = novaCelula;
        }
        fim = novaCelula;
        contador++;
    }

    public Object desenfileirar() {
        Object x = null;
        if (vazia()) {
            System.out.println("ERRO: Fila vazia!");
        } else {
            x = inicio.item;
            inicio = inicio.anterior;
            if (inicio == null) {
                fim = null;
            }
            contador--;
        }
        return (x);
    }

    public Object consultarInicio() {
        Object x = null;
        if (vazia()) {
            System.out.println("ERRO: Fila vazia!");
        } else {
            x = fim.item;
        }
        return (x);
    }

    public String toString() {
        String filaCompleta = "";
        if (vazia()) {
            filaCompleta = null;
        } else {
            for (int i = 0; i < contador; i++) {
                Object tempObject = desenfileirar();
                filaCompleta = filaCompleta + "\n" + tempObject;
                enfileirar(tempObject);
            }
        }
        return (filaCompleta);

    }

    public void enfileirarComPrioridade(Object novoItem) {
        Celula novaCel = new Celula(novoItem);
        if (inicio == null) {
            inicio = novaCel;
        } else {
            novaCel.anterior = inicio;
        }
        inicio = novaCel;
        contador++;
    }


}
