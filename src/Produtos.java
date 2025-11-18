import java.util.Scanner;

public class Produtos {
    Scanner input = new Scanner(System.in);

    private String nomeDoProduto;
    private double precoDoProduto;

    public Produtos(String nomeDoProduto, double precoDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
        this.precoDoProduto = precoDoProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public double getPrecoDoProduto() {
        return precoDoProduto;
    }

    public void setPrecoDoProduto(double precoDoProduto) {
        this.precoDoProduto = precoDoProduto;
    }

    public void aplicarDesconto(int percentualDesconto) {
        double desconto = precoDoProduto * ((double) percentualDesconto /100);
        precoDoProduto -= desconto;
    }
}
