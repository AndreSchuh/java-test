package br.andre.estudos.listas;

import java.util.*;

public class ListasExercise {

    public static List<String> tasks;
    Set<String> completedTasks;
    Queue<String> taskQueue;

    public ListasExercise() {
        tasks = new ArrayList<>();
        completedTasks = new HashSet<>();
        taskQueue = new LinkedList<>(tasks);
    }

    public List<String> addTask(String nameTask) {
        tasks.add(nameTask);
        taskQueue.add(nameTask);
        return tasks;
    }

    public void displayPendingTasks() {
        for (String task : tasks) {
            System.out.println(task);
        }
    }

    public List<String> removeTask(String nameTask){
        tasks.remove(nameTask);
        taskQueue.remove(nameTask);
        return tasks;
    }

    public String completeTask() {
        System.out.println("------------------");
        String task = taskQueue.poll();
        if (task != null && tasks.remove(task)) {
            completedTasks.add(task);
            return task;
        } else {
            return null;
        }
    }
}