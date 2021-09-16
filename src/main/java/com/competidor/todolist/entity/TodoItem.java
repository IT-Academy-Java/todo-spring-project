package com.competidor.todolist.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "todo_item")
public class TodoItem {

  @Id
  private String id;

  private String description;
  private boolean done;

  public TodoItem() {
  }

  public TodoItem(String id, String description, boolean done) {
    this.id = id;
    this.description = description;
    this.done = done;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isDone() {
    return done;
  }

  public void setDone(boolean done) {
    this.done = done;
  }
}
