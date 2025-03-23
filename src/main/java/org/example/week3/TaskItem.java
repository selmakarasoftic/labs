package src.main.java.org.example.week3;
import src.main.java.org.example.week3.taskStatus;
public class TaskItem {
    private int taskId;
    private String taskDescription;
    private taskStatus enums;

    public TaskItem(int taskId, String taskDescription, taskStatus enums) {
        this.taskId = taskId;
        this.taskDescription = taskDescription;
        this.enums = enums;
    }
    public int getTaskId() {
        return taskId;
    }
    public String getTaskDescription() {
        return taskDescription;
    }
    public taskStatus getEnums() {
        return enums;
    }
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    public void setEnums(taskStatus enums) {
        this.enums = enums;
    }
}
