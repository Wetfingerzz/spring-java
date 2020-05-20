package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("taskListOne")
    TaskList taskListOne;
    @Autowired
    @Qualifier("taskListTwo")
    TaskList taskListTwo;
    @Autowired
    @Qualifier("taskListThree")
    TaskList taskListThree;

    @Bean
    public Board getBoard() {
        return new Board(taskListOne,taskListTwo,taskListThree);
    }

    @Bean(name = "taskListOne")
    @Scope("prototype")
    public TaskList getTaskListOne() {
        return new TaskList();
    }

    @Bean(name = "taskListTwo")
    @Scope("prototype")
    public TaskList getTaskListTwo() {
        return new TaskList();
    }

    @Bean(name = "taskListThree")
    @Scope("prototype")
    public TaskList getTaskListThree() {
        return new TaskList();
    }

}
