package metodosDeOrdenacao.metodosLista;

public class Celula {
    Object item;
    Celula link;

    public Celula() {
        item = null;
        link = null;
    }

    public Celula(Object ValorItem) {
        item = ValorItem;
        link = null;
    }

    public Celula(Object ValorItem, Celula linkCelula) {
        item = ValorItem;
        link = linkCelula;
    }
}
