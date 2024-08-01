package br.andre.estudos.listas;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
/*
# Gerenciamento de Tarefas em Java

Este projeto demonstra como usar `ArrayList`, `Set` e `Queue` no Java Collections Framework para gerenciar uma lista de tarefas. O sistema permite adicionar tarefas, marcar tarefas como concluídas e exibir as tarefas pendentes e concluídas.

## Descrição do Projeto

O sistema de gerenciamento de tarefas possui as seguintes funcionalidades:
1. **Adicionar tarefas**: Adiciona tarefas à lista de tarefas.
2. **Marcar tarefas como concluídas**: Remove tarefas da lista de tarefas e as adiciona a um conjunto de tarefas concluídas.
3. **Exibir tarefas**: Exibe as tarefas pendentes e concluídas.

## Explicação do Código
1. ArrayList para Tarefas Pendentes:

Usamos um ArrayList para armazenar as tarefas pendentes porque ele permite acesso rápido e iterável às tarefas.
O método addTask adiciona uma tarefa tanto ao ArrayList quanto à Queue.
HashSet para Tarefas Concluídas:

2. Usamos um HashSet para armazenar as tarefas concluídas porque ele garante que não haja duplicatas e fornece operações rápidas de inserção e verificação.
O método completeTask remove a tarefa da Queue e do ArrayList, e a adiciona ao HashSet.
Queue para Processamento de Tarefas:

3. Usamos uma Queue (LinkedList implementa Queue) para processar as tarefas na ordem em que foram adicionadas, seguindo a ordem FIFO (First-In-First-Out).
O método completeTask usa poll para obter e remover a próxima tarefa da fila.
Exibição de Tarefas:

Os métodos displayPendingTasks e displayCompletedTasks percorrem o ArrayList e o HashSet, respectivamente, para exibir as tarefas pendentes e concluídas.

## Resultado Esperado
Ao executar o programa, você verá a adição de tarefas, a conclusão de algumas delas e a exibição das listas de tarefas pendentes e concluídas, demonstrando como ArrayList, Set e Queue podem ser usados juntos para diferentes propósitos.
 */
public class ListasExemplo {

    // ArrayList para armazenar tarefas pendentes
    private ArrayList<String> tasks;
    // HashSet para armazenar tarefas concluídas
    private Set<String> completedTasks;
    // Queue para processar as tarefas na ordem de adição
    private Queue<String> taskQueue;

    public ListasExemplo() {
        tasks = new ArrayList<>();
        completedTasks = new HashSet<>();
        taskQueue = new LinkedList<>();
    }

    // Adicionar uma nova tarefa
    public void addTask(String task) {
        System.out.println("------------------");
        tasks.add(task);
        taskQueue.add(task);
        System.out.println("Tarefa adicionada: " + task);
    }

    // Marcar uma tarefa como concluída
    public void completeTask() {
        System.out.println("------------------");
        String task = taskQueue.poll();
        if (task != null && tasks.remove(task)) {
            completedTasks.add(task);
            System.out.println("Tarefa concluída: " + task);
        } else {
            System.out.println("Nenhuma tarefa para completar.");
        }
    }

    // Exibir tarefas pendentes
    public void displayPendingTasks() {
        System.out.println("------------------");
        System.out.println("Tarefas pendentes:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }

    // Exibir tarefas concluídas
    public void displayCompletedTasks() {
        System.out.println("------------------");
        System.out.println("Tarefas concluídas:");
        for (String task : completedTasks) {
            System.out.println(task);
        }
    }

    public static void main(String[] args) {
        ListasExemplo taskManager = new ListasExemplo();

        // Adicionar tarefas
        taskManager.addTask("Comprar leite");
        taskManager.addTask("Enviar e-mail");
        taskManager.addTask("Ler um livro");

        // Exibir tarefas pendentes
        taskManager.displayPendingTasks();

        // Completar algumas tarefas
        taskManager.completeTask();
        taskManager.completeTask();

        // Exibir tarefas pendentes e concluídas
        taskManager.displayPendingTasks();
        taskManager.displayCompletedTasks();
    }
}
