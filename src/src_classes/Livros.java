package src_classes;

public class Livros {
    private String nomeDoLivro;
    private String nomeDoAutor;

    public String getNomeDoLivro() {
        return nomeDoLivro;
    }

    public void setNomeDoLivro(String nomeDoLivro) {
        this.nomeDoLivro = nomeDoLivro;
    }

    public String getNomeDoAutor() {
        return nomeDoAutor;
    }

    public void setNomeDoAutor(String nomeDoAutor) {
        this.nomeDoAutor = nomeDoAutor;
    }

    public void descricaoDoLivro() {
        System.out.println("Novo Livro cadastrado!\n");
        System.out.println("Título do livro: " + nomeDoLivro);
        System.out.println("Autor do livro: " + nomeDoAutor);
        System.out.println("\n");
    }
}
