package com.tarefas;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/*
 * Classe responsável por armazenar e gerenciar todas as tarefas criadas.
 * Funciona como uma espécie de "banco de dados" em memória.
 */
public class GerenciadorTarefas {

    private Scanner sc = new Scanner(System.in);
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
     */
    public Tarefa criarTarefa(String descricao, String prazo, int prioridade) {
        int id = contadorId++;
        Tarefa novaTarefa = new Tarefa(id, descricao, prazo, prioridade);
        tarefas.put(id, novaTarefa);
        return novaTarefa;
    }

    /*
     * Método interativo para criação de tarefa
     */
    public void newTarefa() {

        System.out.println("-- CRIANDO TAREFA --");

        // Descrição
        System.out.print("DESCREVA COMO SERÁ A SUA TAREFA: ");
        String descricao = sc.nextLine();

        if (descricao.trim().isEmpty()) {
            System.out.println("Erro: A descrição não pode estar vazia.");
            return;
        }

        // Prazo
        String prazo = "";
        while (prazo.isEmpty()) {
            System.out.print("DIGITE O PRAZO (dd/mm/aaaa): ");
            prazo = sc.nextLine();

            if (!prazo.matches("\\d{2}/\\d{2}/\\d{4}")) {
                System.out.println("Formato inválido. Use dd/mm/aaaa.");
                prazo = "";
            }
        }

        // Prioridade
        int prioridade = -1;
        while (prioridade < 1 || prioridade > 10) {
            try {
                System.out.print("DIGITE A PRIORIDADE (1 até 10): ");
                prioridade = sc.nextInt();
                sc.nextLine(); // limpa buffer

                if (prioridade < 1 || prioridade > 10) {
                    System.out.println("A prioridade deve ser de 1 até 10.");
                }
            } catch (Exception e) {
                System.out.println("Erro: Por favor, insira um número válido.");
                sc.nextLine(); // limpa buffer
            }
        }

        criarTarefa(descricao, prazo, prioridade);
        System.out.println("-- TAREFA CRIADA COM SUCESSO --");
    }
}
