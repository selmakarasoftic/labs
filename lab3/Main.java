package org.example.lab3.db;

import org.example.lab3.db.enums.TaskStatus;
import org.example.lab3.db.model.TaskItem;
import org.example.lab3.db.db.DbConnect;
import org.example.lab3.db.ds.DataStructures;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataStructures dataStructures = new DataStructures();

        dataStructures.getAllObjects();

        dataStructures.printTaskDescriptions();

        System.out.println("Tasks with status TO_DO:");
        dataStructures.getByStatus(String.valueOf(TaskStatus.TO_DO))
                .ifPresent(System.out::println);


        List<TaskItem> filteredTasks = dataStructures.findIdGrater(2);
        filteredTasks.forEach(task -> System.out.println(task.getDescription()));
    }
}

