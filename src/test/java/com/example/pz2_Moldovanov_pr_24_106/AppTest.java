package com.example.pz2_Moldovanov_pr_24_106;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    private App app;

    @BeforeEach
    void setUp() {
        app = new App();
    }

    @Test
    void shouldAddTaskAndIncreaseCount() {
        assertEquals(0, app.getTaskCount());
        app.addTask("Тестовая задача");
        assertEquals(1, app.getTaskCount());
    }

    @Test
    void shouldReturnTaskDescription() {
        app.addTask("Купить молоко");
        assertEquals("Купить молоко", app.getTasks().get(0).getDescription());
    }

    @Test
    void newTaskShouldNotBeCompleted() {
        app.addTask("Задача");
        assertFalse(app.getTasks().get(0).isCompleted());
    }
}