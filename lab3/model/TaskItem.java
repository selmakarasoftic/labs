package org.example.lab3.db.model;


import org.example.lab3.db.enums.TaskStatus;

public class TaskItem {
    private int id;
    private String description;
    private TaskStatus status;


    public TaskItem(int id, String description, TaskStatus status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
