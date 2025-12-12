package com.tarefas;
import java.util.ArrayList;
import java.util.List;;

public class Tarefa {
private int id, prioridade;
private String descricao, prazo;

private Tarefa pai;
private Lista <Tarefa> filhos;

public Tarefa (int id, String descricao, String prazo, int prioridade){
    this.id = id;
    this.descricao = descricao;
    this.prazo = prazo;
    this.prioridade = prioridade;
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

