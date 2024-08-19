package com.bcmp.todolist.infrastructure.repositories;

import com.bcmp.todolist.domain.todolist.dto.TodoListOperationsDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TodoListOperationsRepository extends JpaRepository<TodoListOperationsDTO, UUID> {
}
