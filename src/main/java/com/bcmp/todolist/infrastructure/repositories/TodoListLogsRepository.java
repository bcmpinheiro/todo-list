package com.bcmp.todolist.infrastructure.repositories;

import com.bcmp.todolist.domain.todolist.dto.TodoListLogsDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TodoListLogsRepository extends JpaRepository<TodoListLogsDTO, UUID> {
}
