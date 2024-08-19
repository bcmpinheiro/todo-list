package com.bcmp.todolist.infrastructure.repositories;

import com.bcmp.todolist.domain.todolist.dto.TodoListOperations;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TodoListOperationsRepository extends JpaRepository<TodoListOperations, UUID> {
}
