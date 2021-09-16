package com.competidor.todolist.controller;


import com.competidor.todolist.entity.TodoItem;
import com.competidor.todolist.service.impl.TodoItemServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/todos")
public class TodoItemController {

  @Autowired
  private TodoItemServiceImpl todoItemService;

  @GetMapping
  public ResponseEntity<List<TodoItem>> getTodoItems(){
    return new ResponseEntity<>(todoItemService.getTodoItems(), HttpStatus.OK);
  }

  @GetMapping("/{id}")
  @ResponseBody
  public ResponseEntity<TodoItem> getTodoItemById(@PathVariable("id") String todoItemId){
    return todoItemService.getTodoItemById(todoItemId)
      .map(todoItem -> new ResponseEntity<>(todoItem, HttpStatus.OK))
      .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
  }

  @PostMapping
  public ResponseEntity<TodoItem> save(@RequestBody TodoItem todoItem){
    return new ResponseEntity<>(todoItemService.save(todoItem), HttpStatus.CREATED);
  }

  @DeleteMapping("/{id}")
  public ResponseEntity delete(@PathVariable("id") String todoItemId){
    if (todoItemService.deleteTodoItemById(todoItemId)){
      return new ResponseEntity(HttpStatus.OK);
    } else{
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }

  @PutMapping("/{id}")
  public ResponseEntity<TodoItem> updateTodoItem(
    @RequestBody TodoItem todoItem,
    @PathVariable String id){
    Optional<TodoItem> todoItemOptional = todoItemService.getTodoItemById(id);
    if(todoItemOptional.isPresent()){
      todoItem.setId(id);
      todoItemService.save(todoItem);
      return new ResponseEntity(HttpStatus.OK);
    } else{
      return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
  }



}
