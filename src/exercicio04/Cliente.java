package exercicio04;

public class Cliente extends Pessoa {
    public String CPF;

    public Cliente(String CPF) {
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public void exibirDados() {
        System.out.println(getCPF());;
    }
}
