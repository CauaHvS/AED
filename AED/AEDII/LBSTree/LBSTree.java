package LBSTree;

public class LBSTree {
    protected LBSTreeNode raiz;
    protected int contador;
    protected String treeString;

    public final int PREORDER = 1;
    public final int INORDER = 2;
    public final int POSTORDER = 3;

    public LBSTree() {
        raiz = null;
        contador = 0;
    }

    public boolean vazia() {
        return (raiz == null);
    }

    public int tamanho() {
        return (contador);
    }

    public void inserir(Object novoItem) {
        raiz = inserir(novoItem, raiz);
    }

    public LBSTreeNode inserir(Object novoItem, LBSTreeNode treeRef) {
        int resultado;

        if (treeRef == null) {
            LBSTreeNode newNode = new LBSTreeNode(novoItem);
            treeRef = newNode;
            contador++;
        } else {
            resultado = treeRef.compararCom(novoItem);
            if (resultado > 0) {
                treeRef.linkEsquerdo = inserir(novoItem, treeRef.linkEsquerdo);
            } else {
                treeRef.linkDireito = inserir(novoItem, treeRef.linkDireito);
            }
        }
        return (treeRef);
    }

    public void retirar(Object item) {
        retirar(item, raiz);
    }

    public void retirar(Object item, LBSTreeNode treeRef) {
        LBSTreeNode antecessor = null;

        if (vazia()) {
            System.out.println("ERRO: Árvore vazia!");
        } else {
            if (buscar(item) == null) {
                System.out.println("ERRO: Item inexistente!");
            } else {
                while (treeRef != null && treeRef.item != item) {
                    antecessor = treeRef;
                    if (treeRef.compararCom(item) > 0) {
                        treeRef = treeRef.linkEsquerdo;
                    } else {
                        treeRef = treeRef.linkDireito;
                    }
                }
                if (treeRef.linkEsquerdo == null && treeRef.linkDireito == null) {
                    if (treeRef != raiz) {
                        if (treeRef == antecessor.linkEsquerdo) {
                            antecessor.linkEsquerdo = null;
                        } else {
                            antecessor.linkDireito = null;
                        }
                    } else {
                        raiz = null;
                    }
                    contador--;
                } else if (treeRef.linkEsquerdo != null && treeRef.linkDireito != null) {
                    LBSTreeNode sucessor;
                    //if (treeRef == raiz){
                    sucessor = valorMaximo(treeRef.linkEsquerdo);
                    //}else {
                    //  sucessor = valorMinimo(treeRef.linkDireito);
                    //}
                    Object valorItem = sucessor.item;
                    retirar(sucessor.item);
                    treeRef.item = valorItem;
                    contador--;
                } else {
                    LBSTreeNode folha = (treeRef.linkEsquerdo != null) ? treeRef.linkEsquerdo : treeRef.linkDireito;
                    if (treeRef != raiz) {
                        if (treeRef == antecessor.linkEsquerdo) {
                            antecessor.linkEsquerdo = folha;
                        } else {
                            antecessor.linkDireito = folha;
                        }
                    } else {
                        contador--;
                    }
                }
            }
        }
    }

    protected LBSTreeNode valorMaximo(LBSTreeNode treeNode) {
        while (treeNode.linkDireito != null) {
            treeNode = treeNode.linkDireito;
        }
        return (treeNode);
    }

    protected LBSTreeNode valorMinimo(LBSTreeNode treeNode) {
        while (treeNode.linkEsquerdo != null) {
            treeNode = treeNode.linkEsquerdo;
        }
        return (treeNode);
    }

    LBSTreeNode buscar(Object valorItem) {
        LBSTreeNode treeRef = raiz;
        int resultado = 1;
        while (treeRef != null && resultado != 0) {
            resultado = treeRef.compararCom(valorItem);
            if (resultado > 0) {
                treeRef = treeRef.linkEsquerdo;
            } else if (resultado < 0)
                treeRef = treeRef.linkDireito;
        }
        return (treeRef);
    }

    protected void inOrder(LBSTreeNode treeRef) {
        if (treeRef != null) {
            treeString = treeString + "(";
            inOrder(treeRef.linkEsquerdo);
            treeString = treeString + " " + treeRef.item + " ";
            inOrder(treeRef.linkDireito);
            treeString = treeString + ")";
        }
    }

    protected void preOrder(LBSTreeNode treeRef) {
        if (treeRef != null) {
            treeString = treeString + "(";
            treeString = treeString + " " + treeRef.item + " ";
            preOrder(treeRef.linkEsquerdo);
            preOrder(treeRef.linkDireito);
            treeString = treeString + ")";
        }
    }

    protected void postOrder(LBSTreeNode treeRef) {
        if (treeRef != null) {
            treeString = treeString + "(";
            postOrder(treeRef.linkEsquerdo);
            postOrder(treeRef.linkDireito);
            treeString = treeString + " " + treeRef.item + " ";
            treeString = treeString + ")";
        }
    }

    public String caminhar() {
        return (caminhar(INORDER));
    }

    public String caminhar(int modo) {
        treeString = "\n";
        switch (modo) {
            case PREORDER:
                preOrder(raiz);
                break;
            case INORDER:
                inOrder(raiz);
                break;
            case POSTORDER:
                postOrder(raiz);
                break;
            default:
                System.out.println("ERRO: Modo de caminhamento desconhecido!");
        }
        return (treeString);
    }

    @Override
    public String toString() {
        treeString = "";
        inOrder(raiz);
        return (treeString);
    }


    public int altura(LBSTreeNode treeRef) {
        if (treeRef == null) {
            return (-1);
        }
        int altDireita = 0, altEsquerda = 0;
        if (treeRef.linkEsquerdo != null) {
            altEsquerda = altura(treeRef.linkEsquerdo) + 1;
        }
        if (treeRef.linkDireito != null) {
            altDireita = altura(treeRef.linkDireito) + 1;
        }
        return (Math.max(altEsquerda,altDireita));
    }

    public Object consultarRaiz(){
        if(raiz==null){
            return (vazia());
        }else
            return (raiz);
    }

    public Object obterValorMinimo() {
        LBSTreeNode treeRef = raiz;
        while (treeRef.linkEsquerdo != null) {
            treeRef = treeRef.linkEsquerdo;
        }
        Object item = treeRef.item;
        return (item);
    }

}

