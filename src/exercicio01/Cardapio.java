package exercicio01;

public class Cardapio {
    public String comida;
    public String bebida;
    public String sobremesa;

    public Cardapio(String comida, String bebida, String sobremesa) {
        this.comida = comida;
        this.bebida = bebida;
        this.sobremesa = sobremesa;
    }

    public void mostrarComida(){
        System.out.println(this.comida);
    }

    public void preçoBebida(){
        this.bebida = "12 reais";
        System.out.println("O preço da bebida é :" + this.bebida);
    }
}
