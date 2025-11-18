public class Alunos {
    private String nomeDoAluno;
    private double nota_1;
    private double nota_2;
    private double nota_3;

    public String getNomeDoAluno() {
        return nomeDoAluno;
    }

    public void setNomeDoAluno(String nomeDoAluno) {
        this.nomeDoAluno = nomeDoAluno;
    }

    public double getNota_2() {
        return nota_2;
    }

    public void setNota_2(double nota_2) {
        this.nota_2 = nota_2;
    }

    public double getNota_1() {
        return nota_1;
    }

    public void setNota_1(double nota_1) {
        this.nota_1 = nota_1;
    }

    public double getNota_3() {
        return nota_3;
    }

    public void setNota_3(double nota_3) {
        this.nota_3 = nota_3;
    }

    public Alunos(String nomeDoAluno, double nota_1, double nota_2, double nota_3) {
        this.nomeDoAluno = nomeDoAluno;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
        this.nota_3 = nota_3;
    }

    public void calcularmedia () {
        double media;
        media = (nota_1 + nota_2 + nota_3) / 3;
        System.out.println("A média do(a) aluno(a) " +nomeDoAluno+ " foi de " +media);
    }
}
