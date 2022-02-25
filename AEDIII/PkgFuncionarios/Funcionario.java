package PkgFuncionarios;

public class Funcionario {
    private String funcionario;
    private Double salario;

    public Funcionario(String funcionario, Double salario) {
        this.funcionario = funcionario;
        this.salario = salario;
    }

    public String getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(String funcionario) {
        this.funcionario = funcionario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
