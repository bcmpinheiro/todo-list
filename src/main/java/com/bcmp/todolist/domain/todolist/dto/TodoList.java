package com.bcmp.todolist.domain.todolist.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Table(name = "todos")
@Entity
@AllArgsConstructor
public record TodoList(

        @Id
        @GeneratedValue
        UUID taskId,
        String description,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        Long logId,
        @OneToOne
        @JoinColumn(name = "todos_logs")
        TodoListLogs todoListLogs
) {
}
