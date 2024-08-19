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
@Table(name = "todos")
@Entity
@AllArgsConstructor
public record TodoListDTO (

        @Id
        @GeneratedValue
        UUID taskId,
        String description,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        Long logId
) {
}
