package exercicio04;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("28383327");
        Funcionario funcionario= new Funcionario(22134);


        cliente.exibirDados();
        funcionario.exibirDados();

    }
}
