package exercicio03;

public class Livro {
    private static String titulo ;
    private static String autor;
    private static int nroDePaginas;

    public Livro(String titulo, String autor, int nroDePaginas) {
        this.titulo = "Game of thrones";
        this.autor = "George";
        this.nroDePaginas = 124;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNroDePaginas() {
        return nroDePaginas;
    }

    public void setNroDePaginas(int nroDePaginas) {
        this.nroDePaginas = nroDePaginas;
    }

    public void exibirLivro(){
        System.out.println(this.getTitulo() + this.getAutor() + this.getNroDePaginas());
    }


}
