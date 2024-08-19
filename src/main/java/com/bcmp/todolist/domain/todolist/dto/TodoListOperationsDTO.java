package com.bcmp.todolist.domain.todolist.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Table(name = "todos_operations")
@Entity
@AllArgsConstructor
public record TodoListOperationsDTO (

        @Id
        @GeneratedValue
        UUID taskOperationId,
        String type,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
