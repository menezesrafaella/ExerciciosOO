package exercicio05;

public class Lapis implements TintaCaneta {
    public String ehFeitode;
    public String escreveCom;

    public Lapis(String ehFeitode, String escreveCom) {
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
