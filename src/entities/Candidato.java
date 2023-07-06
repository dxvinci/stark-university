package entities;

public class Candidato {
    private String nome;
    private double notaRed;
    private double notaMat;
    private double notaLing;
    private int op1;
    private int op2;
    private double media;

    public Candidato() {}

    public Candidato(String nome, double notaRed, double notaMat, double notaLing, int op1, int op2) {
        this.nome = nome;
        this.notaRed = notaRed;
        this.notaMat = notaMat;
        this.notaLing = notaLing;
        this.op1 = op1;
        this.op2 = op2;
        this.media = (notaRed + notaMat + notaLing) / 3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNotaRed() {
        return notaRed;
    }

    public double getNotaMat() {
        return notaMat;
    }

    public double getNotaLing() {
        return notaLing;
    }

    public int getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 = op1;
    }

    public int getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 = op2;
    }

    public double getMedia() {
        return media;
    }

}
