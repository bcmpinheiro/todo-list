package com.bcmp.todolist.domain.todolist.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Table(name = "todos_operations")
@Entity
@AllArgsConstructor
public record TodoListOperations(

        @Id
        @GeneratedValue
        UUID taskOperationId,
        String type,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        @OneToOne
        @JoinColumn(name = "todos_operations")
        TodoListLogs todoListLogs
) {
}
