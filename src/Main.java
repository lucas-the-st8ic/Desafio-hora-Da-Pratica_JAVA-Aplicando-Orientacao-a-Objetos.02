import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Conta_Bancaria contaBancoBRA = new Conta_Bancaria();

        contaBancoBRA.setNumeroDaConta(457892465);
        contaBancoBRA.setSaldoDaConta(1050.59);
        contaBancoBRA.titularDaConta = "Lucas Silva";


        System.out.println("Nome do Titular: " +contaBancoBRA.titularDaConta);
        System.out.println("Número da conta: " +contaBancoBRA.getNumeroDaConta());
        System.out.println("Saldo: R$" +contaBancoBRA.getSaldoDaConta());






        System.out.println("Insira seu nome: ");
        String nome = input.nextLine();

        System.out.println("Insira sua idade: ");
        int idade = input.nextInt();

        IdadeDePessoas pessoa1 = new IdadeDePessoas();

        pessoa1.setNome(nome);
        pessoa1.setIdade(idade);

        pessoa1.verificarIdade();

        System.out.println("===============================\n");

        Produtos produtoCodigo001 = new Produtos("IPhone", 14000.0);
    }
}
