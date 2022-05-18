package HashTable;

public class HashTable {

    protected int capacidade;
    protected int contador;
    protected HashCelula[] hashArray;
    protected boolean enderecoAberto;
    protected boolean useRehash;

    public HashTable() {
        this(8);
    }

    public HashTable(int maxCapacidade) {
        contador = 0;
        enderecoAberto = false;
        useRehash = false;
        capacidade = maxCapacidade;
        hashArray = new HashCelula[capacidade];
    }

    public int funcaoHash(Object valor, int max) {
        return (Integer.parseInt(valor.toString()) % max);
    }

    public boolean vazia() {
        return (contador == 0);
    }

    public int tamanho() {
        return (contador);
    }

    public void enderecoAbertoOn() {
        enderecoAberto = true;
    }

    public void enderecoAbertoOff() {
        enderecoAberto = false;
    }

    public void useRehashOn() {
        useRehash = true;
    }

    public void useRehashOff() {
        useRehash = false;
    }

    public int reHash(int valor) {
        return ((valor + capacidade - 1) % capacidade);
    }

    //-----------------------------------------------

    protected boolean chaveValida(int k) {
        return (0 <= k && k < capacidade);
    }

    public int proximo(int valor) {
        int x;
        if (useRehash) {
            x = reHash(valor);
        } else {
            x = (valor = 1) % capacidade;
        }
        return (x);
    }

    public void inserir(String valor, int k) {
        if (!chaveValida(k)) {
            System.out.println("ERRO: Indice invalido!");
        } else {
            if (hashArray[k] == null) {
                hashArray[k] = new HashCelula(valor);
                contador++;
            } else {
                if (enderecoAberto) {
                    inserirAberto(valor, k);
                } else {
                    inserirLink(valor, k);
                }
            }
        }
    }

    public void inserir(String valor) {
        int k = this.funcaoHash(valor, this.capacidade);
        this.inserir(valor, k);
    }

    public void inserirAberto(String valor, int k) {
        int n = proximo(k);
        while (n != k && hashArray[n] != null) {
            n = proximo(n);
        }
        if (n == k) {
            System.out.println("EROO: Capacidade da Hash foi excedida!");
        } else {
            hashArray[n] = new HashCelula(valor);
            contador++;
        }
    }

    public void inserirLink(String valor, int k) {
        HashCelula x;
        x = new HashCelula(valor);
        x.link = hashArray[k].link;
        hashArray[k].link = x;
    }

    public void retirar(String valor, int k) {
        if (vazia()) {
            System.out.println("ERRO: Tabela Hash vazia!");
        } else {
            if (!chaveValida(k)) {
                System.out.println("ERRO: Indice invalido!");
            } else {
                HashCelula anterior = null;
                HashCelula x = hashArray[k];
                boolean result = valor.equals(x.toString());
                if (result) {
                    if (enderecoAberto) {
                        hashArray[k] = null;
                    } else {
                        hashArray[k] = x.link;
                    }
                    contador--;
                } else {
                    if (enderecoAberto) {
                        int n = proximo(k);
                        while (n != k && !result) {
                            x = hashArray[n];
                            if (x == null) {
                                n = k;
                            } else {
                                result = valor.equals(x.toString());
                                if (!result) {
                                    n = proximo(n);
                                }
                            }
                        }
                        if (n == k && !result) {
                            System.out.println("ERRO: Item inexistente!");
                        } else {
                            hashArray[n] = null;
                            contador--;
                        }
                    } else {
                        while (x != null && !result) {
                            anterior = x;
                            x = x.link;
                            if (x != null) {
                                result = valor.equals(x.toString());
                            }
                        }
                        if (x != null) {
                            anterior.link = x.link;
                            contador--;
                        } else {
                            System.out.println("ERRO: Item inexistente!");
                        }
                    }
                }
            }
        }
    }

    public void retirar(String valor) {
        int k = this.funcaoHash(valor, this.capacidade);
        this.retirar(valor, k);
    }

    public boolean pesquisar(String valor, int k) {
        boolean result = false;
        int n = 0;
        HashCelula x;
        if (!chaveValida(k)) {
            System.out.println("ERRO: Indice invalido!");
        } else {
            x = hashArray[k];
            if (x != null) {
                result = valor.equals(x.toString());
                if (enderecoAberto) {
                    n = proximo(k);
                    while (n != k && !result) {
                        x = hashArray[n];
                        if (x == null) {
                            n = k;
                        } else {
                            result = valor.equals(x.toString());
                            if (!result) {
                                n = proximo(n);
                            }
                        }
                    }
                } else {
                    x = x.link;
                    while (x != null & !result) {
                        result = valor.equals(x.toString());
                        if (!result) {
                            x = x.link;
                        }
                    }
                }
            }
        }
        return (result);
    }

    public boolean pesquisar(String valor) {
        boolean result = false;
        int k = this.funcaoHash(valor, this.capacidade);
        result = this.pesquisar(valor, k);
        return (result);

    }

    public String toString() {
        String fullHash = "";
        HashCelula x;
        for (int i = 0; i < capacidade; i++) {
            x = hashArray[i];
            if (x != null) {
                fullHash = fullHash + "\n" + String.valueOf(i) + ".(";
                fullHash = fullHash + x.toString();
                x = x.link;
                while (x != null) {
                    fullHash = fullHash + " " + x.toString();
                    x = x.link;
                }
                fullHash = fullHash + ")";
            }
        }
        return (fullHash);
    }

    public void reiniciar() {
        HashCelula x;
        for (int i = 0; i < hashArray.length; i++) {
            x = hashArray[i];
            if(x!=null){
                this.retirar(String.valueOf(x));
            }
        }
    }
}
