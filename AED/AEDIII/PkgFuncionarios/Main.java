package PkgFuncionarios;

public class Main {
    public static void main(String[] args) {


        Funcionario Caua = new Funcionario("Cauã Henrique", 1345.65);
        Funcionario Pedro = new Funcionario("Pedro Augusto", 39456.52);
        Funcionario Bryan = new Funcionario("Bryan Wille", 1567.84);
        Funcionario Gustavo = new Funcionario("Gustavo ", 1546.58);
        Funcionario Luisa = new Funcionario("Luisa", 1556.93);


        Lista listadeFuncionarios = new Lista();
        listadeFuncionarios.adiciona(Caua);
        listadeFuncionarios.adiciona(Pedro);
        listadeFuncionarios.adiciona(Bryan);
        listadeFuncionarios.adiciona(Gustavo);
        listadeFuncionarios.adiciona(Luisa);
        listadeFuncionarios.imprimeLista();

        System.out.println(listadeFuncionarios.busca(3));
        System.out.println(listadeFuncionarios.busca(22));
        System.out.println("A lista contem o funcionario Cauã Henrique ? \n"+listadeFuncionarios.contem("Cauã Henrique"));
        System.out.println("A lista contem o funcionario Moacir ? \n"+listadeFuncionarios.contem("Moacir "));
        listadeFuncionarios.remove(3);
        System.out.println();
        listadeFuncionarios.ordenaPorNome();
        listadeFuncionarios.imprimeLista();


    }
}
