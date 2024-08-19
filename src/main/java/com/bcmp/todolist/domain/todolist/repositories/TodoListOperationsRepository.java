package com.bcmp.todolist.domain.todolist.repositories;

import com.bcmp.todolist.domain.todolist.entities.TodoListOperations;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TodoListOperationsRepository extends JpaRepository<TodoListOperations, UUID> {
}
