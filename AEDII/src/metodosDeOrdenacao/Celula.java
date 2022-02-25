package metodosDeOrdenacao;

public class Celula{
    public Object item;
    public Celula anterior;

    public Celula() {
        item = null;
        anterior = null;
    }

    public Celula(Object valorItem) {
        item = valorItem;
        anterior = null;
    }

    public Celula(Object valorItem, Celula celulaSeguinte) {
        item = valorItem;
        anterior = celulaSeguinte;
    }


}
