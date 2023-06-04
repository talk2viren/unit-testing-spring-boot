package com.thetechbologs.unittestingspringboot.controller;

import com.thetechbologs.unittestingspringboot.domain.Task;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController("/todo")
public class TaskController {
    private List<Task> taskList;

    @PostConstruct
    private List<Task> myTasks(){
        taskList =new ArrayList<>();
        Task task1=new Task(1,"Task-1","Team1");
        Task task2=new Task(2,"Task-2","Team2");
        Task task3=new Task(3,"Task-3","Team3");
        Task task4=new Task(4,"Task-4","Team4");
        Task task5=new Task(5,"Task-5","Team5");
        taskList.add(task1);
//        taskList.add(task2);
//        taskList.add(task3);
//        taskList.add(task4);
//        taskList.add(task5);

        return taskList;
    }

    @PostMapping("/createTask")
    public Task createTask(@RequestBody Task task) {
        taskList.add(task);
        return task;
    }

    @GetMapping("/findAll")
    public List<Task> findAll(){
        return taskList;
    }

    @GetMapping("/findTask")
    public Task findTask(@RequestParam("id") int id){
//        taskList.stream().map(task -> {(task.getTaskId() == id)? task: null})
        List<Task> tasks=taskList.stream().filter(task -> task.getTaskId() == id).collect(Collectors.toList());
        return Optional.ofNullable(tasks).isPresent() ? tasks.get(0) : null;
    }


}
