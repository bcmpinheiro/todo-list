package com.bcmp.todolist.domain.todolist.dto;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public record TodoListLogsDTO(
        UUID taskLogId,
        String description,
        Long operation,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
