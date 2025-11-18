import src_classes.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);

        Conta_Bancaria contaBancoBRA = new Conta_Bancaria();

        contaBancoBRA.setNumeroDaConta(457892465);
        contaBancoBRA.setSaldoDaConta(1050.59);
        contaBancoBRA.titularDaConta = "Lucas Silva";


        System.out.println("Nome do Titular: " +contaBancoBRA.titularDaConta);
        System.out.println("Número da conta: " +contaBancoBRA.getNumeroDaConta());
        System.out.println("Saldo: R$" +contaBancoBRA.getSaldoDaConta());

        System.out.println("===============================\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Insira seu nome: ");
        String nome = input.nextLine();

        System.out.println("Insira sua idade: ");
        int idade = input.nextInt();

        IdadeDePessoas pessoa1 = new IdadeDePessoas();

        pessoa1.setNome(nome);
        pessoa1.setIdade(idade);

        pessoa1.verificarIdade();

        System.out.println("===============================\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Produtos produtoCodigo001 = new Produtos("IPhone", 14000.0);

        System.out.println("Nome do Produto: " +produtoCodigo001.getNomeDoProduto());
        System.out.println("Preço do Produto: R$" +produtoCodigo001.getPrecoDoProduto());

        produtoCodigo001.aplicarDesconto(50);

        System.out.println("Preço final do Produto com desconto: " +produtoCodigo001.getPrecoDoProduto());

        System.out.println("===============================\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Alunos Lucas = new Alunos("Lucas Silva",8.5,9.2,5.0);
        Alunos Anna = new Alunos("Anna Silva",10,9.2,8.5);

        Lucas.calcularmedia();
        Anna.calcularmedia();

        System.out.println("===============================\n");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        Livros livro_cod001 = new Livros();

        livro_cod001.setNomeDoLivro("Diário Estóico");
        livro_cod001.setNomeDoAutor("Ryan Holiday e Stephen Hanselman");

        Livros livro_cod002 = new Livros();
        livro_cod002.setNomeDoLivro("Lógica de Programação e Algoritmos com JavaScript");
        livro_cod002.setNomeDoAutor("Edécio Fernando Lepsen");

        livro_cod001.descricaoDoLivro();
        livro_cod002.descricaoDoLivro();
    }
}
