package agenda;

public class PessoaComTelefone extends Pessoa {

    private int numTel;
    private Telefone[] tel;

    public PessoaComTelefone(int id, String nome) {
        super(id, nome);
        this.numTel = 0;

    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
        tel = new Telefone[numTel];
    }

    public Telefone getTel(int i) {
        return ((i > -1 && i < numTel) ? tel[i] : null);
    }

    public void setTel(int i,Telefone t) {
        if (i > -1 && i < numTel){
            tel[i] = t;
        }
    }

    @Override
    public String toString() {
        String aux = super.toString();
        for(int i=0; i< numTel; i++){
            aux = aux + "\n\tTel[" + (i+1) + "] "+tel[i] .toString();
        }
        return aux;
    }
}
