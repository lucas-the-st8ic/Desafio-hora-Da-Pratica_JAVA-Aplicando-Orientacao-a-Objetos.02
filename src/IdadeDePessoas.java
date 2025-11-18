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
            System.out.println("O usuário é maior de idade!");
        } else if (idade < maiorIdade) {
            System.out.println("O usuário é menor de idade!");
        }
    }
}
