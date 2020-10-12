package com.kristiania.ToDoList.controller;

import com.kristiania.ToDoList.model.ToDoItem;
import com.kristiania.ToDoList.repo.ToDoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class ToDoController {

    @Autowired
    private ToDoRepo toDoRepo;


    @GetMapping
    public List<ToDoItem> findAll(){

        return toDoRepo.findAll();
    }

    @PostMapping
    public ToDoItem save(@RequestBody ToDoItem toDoItem){
        return toDoRepo.save(toDoItem);
    }
}
