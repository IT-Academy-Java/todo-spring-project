package com.competidor.todolist.service.impl;


import com.competidor.todolist.entity.TodoItem;
import com.competidor.todolist.repository.ITodoItemRepository;
import com.competidor.todolist.service.ITodoItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TodoItemServiceImpl implements ITodoItemService {

  @Autowired
  private ITodoItemRepository todoItemRepository;

  @Override
  public TodoItem save(TodoItem item) {
    return todoItemRepository.save(item);
  }

  @Override
  public List<TodoItem> getTodoItems() {
    return todoItemRepository.findAll();
  }

  @Override
  public Optional<TodoItem> getTodoItemById(String todoItemId) {
    return todoItemRepository.getTodoItemById(todoItemId);
  }

  @Override
  public boolean deleteTodoItemById(String todoItemId) {
    return getTodoItemById(todoItemId).map( todoItem -> {
      todoItemRepository.deleteById(todoItemId);
      return true;
    }).orElse(false);
  }

  @Override
  public boolean update(TodoItem item) {
    return getTodoItemById(item.getId()).map(todoItem -> {
      todoItemRepository.save(item);
      return true;
    }).orElse(false);
  }


}
