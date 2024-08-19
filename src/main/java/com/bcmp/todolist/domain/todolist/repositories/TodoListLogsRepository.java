package com.bcmp.todolist.domain.todolist.repositories;

import com.bcmp.todolist.domain.todolist.entities.TodoListLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TodoListLogsRepository extends JpaRepository<TodoListLogs, UUID> {
}
