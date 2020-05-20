package com.kodilla.spring.portfolio;

public final class Board {
    final TaskList toDoList;
    final TaskList inProgressList;
    final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        System.out.println("Things to do:");
        return toDoList;
    }

    public TaskList getInProgressList() {
        System.out.println("Things in progress:");
        return inProgressList;
    }

    public TaskList getDoneList() {
        System.out.println("Things Done:");
        return doneList;
    }
}
