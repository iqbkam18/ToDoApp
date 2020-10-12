package com.kristiania.ToDoList.repo;

import com.kristiania.ToDoList.model.ToDoItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ToDoRepo extends JpaRepository<ToDoItem, Long> {
}
