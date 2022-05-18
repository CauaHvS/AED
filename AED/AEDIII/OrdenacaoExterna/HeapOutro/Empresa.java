package OrdenacaoExterna.HeapOutro;

public class Empresa {

    private int id;
    private String nomeEmpresa;

    public Empresa(int id, String nomeEmpresa) {
        this.id = id;
        this.nomeEmpresa = nomeEmpresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "id=" + id +
                ", nomeEmpresa='" + nomeEmpresa + '\'' +
                '}';
    }
}
