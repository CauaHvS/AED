package HashTable;

public class HashCelula {

    protected Object chave;
    protected HashCelula link;

    public HashCelula(){
        this(null);
    }

    public HashCelula(String valor){
        chave = valor;
        link = null;
    }

    public int compareTo(Object valor){
        String chaveAtual = chave.toString();
        String chaveValor = valor.toString();
        return (chaveAtual.compareTo(chaveValor));
    }

    public String toString(){
        return (chave.toString());
    }
}
