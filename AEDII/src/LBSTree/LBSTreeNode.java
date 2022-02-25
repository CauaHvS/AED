package LBSTree;

public class LBSTreeNode {
    Object item;
    LBSTreeNode linkEsquerdo;
    LBSTreeNode linkDireito;

    public LBSTreeNode() {
        this(null);
    }

    public LBSTreeNode(Object valorItem) {
        item = valorItem;
        linkEsquerdo = null;
        linkDireito = null;
    }

    public int compararCom(Object valorItem) {
        String chaveAtual = (String) this.item;
        String chaveValor = (String) valorItem;
        return (chaveAtual.compareTo(chaveValor));
    }

    public String tostring() {
        return (item.toString());
    }
}
