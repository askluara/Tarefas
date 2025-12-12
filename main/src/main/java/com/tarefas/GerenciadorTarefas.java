package com.tarefas;

import java.util.Map;
import java.util.HashMap;

/*
 * Classe responsável por armazenar e gerenciar todas as tarefas criadas.
 * Funciona como uma espécie de "banco de dados" em memória.
 */
public class GerenciadorTarefas {

    private Map<Integer, Tarefa> tarefas;
    private int contadorId;
 /*
 * Construtor: inicia o Map vazio e define o primeiro ID como 1.
 */
    public GerenciadorTarefas() {
        this.tarefas = new HashMap<>();
        this.contadorId = 1;
    }
    /*
     * Cria uma nova tarefa com ID automático.
     * Adiciona ao mapa de tarefas e retorna a instância criada.
     */
    public Tarefa criarTarefa(String descricao, String prazo, int prioridade) {
        int id = contadorId++;
        Tarefa novatarefa = new Tarefa(id, descricao, prazo, prioridade);
        tarefas.put(id, novatarefa);
        return novatarefa;  // melhor retornar a tarefa ao invés de imprimir
    }

    public Tarefa buscarTarefa(int id) {
        return tarefas.get(id);
    }
    /*
     * Retorna o Map completo com todas as tarefas registradas.
     */
    public Map<Integer, Tarefa> getTarefas() {
        return tarefas;
    }
}