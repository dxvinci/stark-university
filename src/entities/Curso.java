package entities;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Curso {
    private int id;
    private String nome;
    private int quantVagas;
    private ArrayList<Candidato> listaSelecionados;
    private Queue<Candidato> filaEspera;

    public Curso() {}

    public Curso(int id, String nome, int quantVagas) {
        this.id = id;
        this.nome = nome;
        this.quantVagas = quantVagas;
        this.listaSelecionados = new ArrayList<>();
        this.filaEspera = new LinkedList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantVagas() {
        return quantVagas;
    }

    public void setQuantVagas(int quantVagas) {
        this.quantVagas = quantVagas;
    }

    public ArrayList<Candidato> getListaSelecionados() {
        return listaSelecionados;
    }

    public Queue<Candidato> getFilaEspera() {
        return filaEspera;
    }

}
