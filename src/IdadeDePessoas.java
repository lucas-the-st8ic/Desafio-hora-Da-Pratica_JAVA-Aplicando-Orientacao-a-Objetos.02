public class IdadeDePessoas {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        int maiorIdade = 18;

        if (idade >= maiorIdade) {
            System.out.println("O " +nome+ " é maior de idade!");
        } else {
            System.out.println("O " +nome+ " é menor de idade!");
        }
    }
}
