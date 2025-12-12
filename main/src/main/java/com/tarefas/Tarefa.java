package com.tarefas;
import java.util.ArrayList;
import java.util.List;;


/*
*@author Luara Araújo
*@since 12-12-2025
*@version 1.0
 */


/*
 * Representa uma tarefa individual, que pode ter subtarefas (filhos)
 * e também pode pertencer a uma tarefa maior (pai).
 */
public class Tarefa {
    private int id, prioridade;
    private String descricao;
    private String prazo;

    // Tarefa "pai" - usada quando uma tarefa é subtarefa de outra
    private Tarefa pai;

    // Lista de subtarefas associadas a esta tarefa
    private List<Tarefa> filhos;

    public Tarefa(int id, String descricao, String prazo, int prioridade) {
        this.id = id;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
        this.filhos = new ArrayList<>();
    }

    /*
     * Adiciona uma subtarefa a esta tarefa.
     * Também configura o "pai" da subtarefa automaticamente.
     */
    public void adicionarFilho(Tarefa filho) {
        filho.setPai(this);
        filhos.add(filho);
    }
public int getId() {
    return id;
}

public void setId(int id) {
    this.id = id;
}

public int getPrioridade() {
    return prioridade;
}

public void setPrioridade(int prioridade) {
    this.prioridade = prioridade;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}

public String getPrazo() {
    return prazo;
}

public void setPrazo(String prazo) {
    this.prazo = prazo;
}

public Tarefa getPai() {
    return pai;
}

public void setPai(Tarefa pai) {
    this.pai = pai;
}

public Lista<Tarefa> getFilhos() {
    return filhos;
}

public void setFilhos(Lista<Tarefa> filhos) {
    this.filhos = filhos;
}

}

