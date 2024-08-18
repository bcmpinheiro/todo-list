package com.bcmp.todolist.domain.todolist.dto;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public record TodoListDTO (
        UUID taskId,
        String description,
        LocalDateTime createdAt,
        LocalDateTime updatedAt,
        Long logId
) {
}
