package src.main.java.org.example.week3;
import lab3.enums.TaskStatus;
import src.main.java.org.example.week3.DataStructures;
import src.main.java.org.example.week3.*;
import java.util.List;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        DataStructures dataStructures= new DataStructures();
        dataStructures.getAllTasks().forEach(System.out::println);

        System.out.println("\nTasks with status IN_PROGRESS:");
        dataStructures.getByStatus(TaskStatus.IN_PROGRESS.name()).forEach(System.out::println);

        System.out.println("\nTasks with ID greater than or equal to 2:");
        List<TaskItem> filteredTasks = dataStructures.findIdGrater(2);


        filteredTasks.forEach(task -> System.out.println(task.getTaskDescription()));
        System.out.println("\nTask Descriptions:");
        dataStructures.printTaskDescriptions();

    }
}