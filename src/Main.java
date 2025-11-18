import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = input.nextLine();

        System.out.println("Insira sua idade: ");
        int idade = input.nextInt();

        IdadeDePessoas pessoa1 = new IdadeDePessoas();

        pessoa1.setNome(nome);
        pessoa1.setIdade(idade);

        pessoa1.verificarIdade();
        System.out.println("===============================\n");

    }
}
