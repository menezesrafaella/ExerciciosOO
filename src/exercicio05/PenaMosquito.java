package exercicio05;

public class PenaMosquito implements TintaCaneta {
    public String ehFeitode;
    public String escreveCom;

    public PenaMosquito(String ehFeitode, String escreveCom) {
        this.ehFeitode = ehFeitode;
        this.escreveCom = escreveCom;
    }

    public String getEhFeitode() {
        return ehFeitode;
    }


    public String getEscreveCom() {
        return escreveCom;
    }


    @Override
    public void escrever() {
        System.out.println("Escrevendo com: " + getEscreveCom());
    }
}
