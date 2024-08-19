package com.bcmp.todolist.domain.todolist.repositories;

import com.bcmp.todolist.domain.todolist.entities.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TodoListRepository extends JpaRepository<TodoList, UUID> {

}
