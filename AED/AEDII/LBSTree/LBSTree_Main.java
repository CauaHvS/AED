package LBSTree;

public class LBSTree_Main {

    private static LBSTree tree = new LBSTree();;

    public static void main(String[] args) {

        String[] vetorNumeros= new String[]{"1","2","3","4","5","6","7"};

        for(int i =0; i<vetorNumeros.length; i++){
            tree.inserir(vetorNumeros[i]);
        }

        System.out.println("Tamanho da arvore: "+tree.tamanho());
        System.out.println("Arvore: "+tree.toString());
        System.out.println("Altura da arvore: "+tree.altura(tree.raiz));
        System.out.println("Caminhamento pre-order da arvore: "+tree.caminhar(tree.PREORDER));
        System.out.println("Caminhamento in-order da arvore: "+tree.caminhar(tree.INORDER));
        System.out.println("Caminhamento post-order da arvore: "+tree.caminhar(tree.POSTORDER));

        System.out.println("Item 4 esta na arvore? "+tree.buscar("5"));
        System.out.println("Raiz da arvore: "+tree.raiz);
        System.out.println("Altura da arvore: "+tree.altura(tree.raiz));

       /* System.out.println("Arvore: "+tree.toString());
        System.out.println("Valor minimo: "+tree.obterValorMinimo());
        System.out.println("Raiz da arvore: "+tree.consultarRaiz());

        //System.out.println("Altura da árvore: "+Tree.altura());*/


    }
}
