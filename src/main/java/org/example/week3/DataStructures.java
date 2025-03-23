package src.main.java.org.example.week3;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

import src.main.java.org.example.week3.*;

public class DataStructures {

    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1,"Push lab code to the github", taskStatus.TO_DO),
                new TaskItem(2,"Prepare for the quiz", taskStatus.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2", taskStatus.COMPLETED));
    }

    // TODO create a method to get all objects
    public List<TaskItem> getAllTasks() {
        return this.tasks;
    }

    // TODO create a method getByStatus that will accept a Status parameter and filter the tasks with the provided status
    public List<TaskItem> getByStatus(String status) {
        taskStatus desiredStatus = taskStatus.valueOf(status.toUpperCase());
        return tasks
                .stream()
                .filter(taskItem -> taskItem.getEnums().equals(desiredStatus))
                .toList();
    }
    // TODO create a method to find tasks whose id parameter greater than or equal to 2
    public List<TaskItem> findIdGrater(int id) {
        return tasks
                .stream()
                .filter(taskItem -> taskItem.getTaskId() >= id)
                .toList();
    }
    //TODO create a method that will, by using the forEach stream method, print to the console the description of each task
    public void printTaskDescriptions() {
        tasks.stream()
                .forEach(taskItem -> System.out.println(taskItem.getTaskDescription()));
    }
}
