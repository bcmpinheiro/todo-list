package com.bcmp.todolist.domain.todolist.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Table(name = "todos_logs")
@Entity
@AllArgsConstructor
public record TodoListLogs(

        @Id
        @GeneratedValue
        UUID taskLogId,
        String description,
        Long operation,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        @OneToMany
        @JoinColumn(name = "todoList_id")
        TodoList todoList
) {
}
