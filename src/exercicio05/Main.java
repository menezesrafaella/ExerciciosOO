package exercicio05;

public class Main {
    public static void main(String[] args) {
        Caneta caneta = new Caneta("Plastico" , "Com tinta");
        Lapis lapis = new Lapis ("madeira", "grafite");
        PenaMosquito penaMosquito = new PenaMosquito("metal", "com nanquim");

        caneta.escrever();
        lapis.escrever();
        penaMosquito.escrever();
    }
}
