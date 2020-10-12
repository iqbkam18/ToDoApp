package com.kristiania.ToDoList.controller;

import com.kristiania.ToDoList.model.ToDoItem;
import com.kristiania.ToDoList.repo.ToDoRepo;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
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
    public ToDoItem save(@Valid @NotNull @RequestBody ToDoItem toDoItem){
        return toDoRepo.save(toDoItem);
    }

    @PutMapping
    public ToDoItem update(@Valid @NotNull @RequestBody ToDoItem toDoItem){
        return toDoRepo.save(toDoItem);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable Long id){
        toDoRepo.deleteById(id);
    }
}
