package PkgFuncionarios;

public class Lista {

    private Funcionario[] funcionario = new Funcionario[100];
    private int posicao;

    public void adiciona(Funcionario func) {
        this.funcionario[tamanho()] = func;
        this.posicao++;

    }
    public Funcionario busca(int posicao) {
        Funcionario buscado = null;
        if (this.posicao < posicao || posicao > 99) {
            System.out.println("Erro: posição não encontrada!");
        } else {
            System.out.println("Funcionário encontrado!");
            buscado = funcionario[posicao];
            System.out.println("O Seu funcionário "+buscado.getFuncionario()+ " tem um salário de: R$" + buscado.getSalario()+"\n");
        }
        return buscado;
    }
    private boolean posicaoOcupada(int posicao) {
        Funcionario buscado = null;
        if (this.posicao < posicao || posicao > 99) {
            System.out.println("Erro: Funcionario não existe!"+"\n");
            return false;
        } else {
            if(funcionario[posicao] == null){
                System.out.println("Erro:Não existe funcionario nessa posição!"+"\n");
                return false;
            }else{
                System.out.println("Funcionário encontrado!"+"\n");
            }

        }
        return true;
    }
    public void remove(int posicao) {
        if (funcionario[posicao] == null) {
            System.out.println("Erro: nenhum funcionário cadastrado ainda!");
        }
        for (int i = posicao; i < this.tamanho() - 1; i++) {
                this.funcionario[i] = this.funcionario[i + 1];
            }
            this.posicao--;
        }

    public boolean contem(String nome) {
        boolean contem = false;
        for (int i = 0; i <= this.posicao; i++) {
            if (funcionario[i].getFuncionario().equalsIgnoreCase(nome)) {
                contem = true;
                break;
            }else{
                contem = false;
                break;
            }
        }
        return contem;
    }

    public int tamanho() {
        return this.posicao;
    }

    public void imprimeLista() {
        System.out.println("\n=================================================");
        System.out.println(" RELATÓRIO DE FUNCIONÁRIOS");
        System.out.println("=================================================");
        for (int i = 0; i < this.tamanho(); i++) {
            System.out.printf("%d - %s - R$ %.2f\n",
                    (i + 1),
                    funcionario[i].getFuncionario(),
                    funcionario[i].getSalario());
        }
        System.out.println("=================================================");
    }

    public int comparaStrings(String word1, String word2) {
        for (int i = 0; i < Math.min(word1.length(), word2.length()); i++) {
            if ((int) word1.charAt(i) != (int) word2.charAt(i)) {
                return (int) word1.charAt(i) - (int) word2.charAt(i);
            }
        }
        return 0;
    }

    public void ordenaPorNome() {
        for (int i = 0; i < tamanho(); i++) {
            for (int j = 0; j < tamanho() - 1; j++) {
                if (comparaStrings(funcionario[j].getFuncionario(), funcionario[j + 1].getFuncionario()) > 0) {
                    Funcionario aux =  funcionario[j];
                    funcionario[j] = funcionario[j + 1];
                    funcionario[j + 1] = aux;
                }
            }
        }
    }

}
