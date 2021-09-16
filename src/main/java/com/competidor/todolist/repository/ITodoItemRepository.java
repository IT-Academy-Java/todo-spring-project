package com.competidor.todolist.repository;


import com.competidor.todolist.entity.TodoItem;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Repository
@Transactional
public interface ITodoItemRepository extends MongoRepository<TodoItem, String> {

  Optional<TodoItem> getTodoItemById(String id);
}