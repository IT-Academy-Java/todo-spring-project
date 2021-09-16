package com.competidor.todolist.service;

import com.competidor.todolist.entity.TodoItem;

import java.util.List;
import java.util.Optional;


public interface ITodoItemService {

  public TodoItem save(TodoItem item);
  public List<TodoItem> getTodoItems();
  public Optional<TodoItem> getTodoItemById(String todoItemId);
  public boolean deleteTodoItemById(String todoItemId);
  public boolean update(TodoItem item);

}

