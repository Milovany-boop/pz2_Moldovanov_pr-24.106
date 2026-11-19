package com.example.pz2_Moldovanov_pr_24_106;

import java.util.ArrayList;
import java.util.List;

public class App {
    private final List<Task> tasks = new ArrayList<>();

    public void addTask(String description) {
        tasks.add(new Task(description));
    }

    public int getTaskCount() {
        return tasks.size();
    }

    public List<Task> getTasks() {
        return new ArrayList<>(tasks);
    }

    public static void main(String[] args) {
        App app = new App();
        app.addTask("Сделать практическую по CI/CD");
        app.addTask("Проверить работу GitHub Actions");
        System.out.println("Задач в списке: " + app.getTaskCount());
    }
}