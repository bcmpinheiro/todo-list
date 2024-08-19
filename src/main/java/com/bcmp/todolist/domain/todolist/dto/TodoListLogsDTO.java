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
@Table(name = "todos_logs")
@Entity
@AllArgsConstructor
public record TodoListLogsDTO(

        @Id
        @GeneratedValue
        UUID taskLogId,
        String description,
        Long operation,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
