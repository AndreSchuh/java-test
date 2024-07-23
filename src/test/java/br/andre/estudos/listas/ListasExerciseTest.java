package br.andre.estudos.listas;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.*;
public class ListasExerciseTest {

    String taskName = "Comer";

    ListasExercise task = new ListasExercise();
    List<String> taskTest;

    @Test
    void addTaskTest() {
        List<String> resultado = task.addTask(taskName);

        assertEquals(task.addTask(taskName), resultado);
    }

    @Test
    void removeTaskTest(){
        List<String> resultado = task.removeTask(taskName);
        assertEquals(task.removeTask(taskName), resultado);
    }

    @Test
    void completeTaskTest(){
        task.addTask("Jogar");
        task.addTask("Ler");
        task.addTask("Treinar");

        String completedTask = task.completeTask();
        assertNotNull(completedTask);
        assertTrue(task.completedTasks.contains(completedTask));
    }
}
