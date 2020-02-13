package exercicio04;

public class Funcionario extends Pessoa {
    public int nroMatricula;

    public int getNroMatricula() {
        return nroMatricula;
    }

    public void setNroMatricula(int nroMatricula) {
        this.nroMatricula = nroMatricula;
    }

    public Funcionario(int nroMatricula) {
        this.nroMatricula = nroMatricula;

    }

    @Override
    public void exibirDados() {
        System.out.println(getNroMatricula());
    }
}
