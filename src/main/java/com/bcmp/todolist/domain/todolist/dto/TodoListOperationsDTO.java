package com.bcmp.todolist.domain.todolist.dto;

import java.time.LocalDateTime;
import java.util.UUID;

public record TodoListOperationsDTO (
        UUID taskOperationId,
        String type,
        LocalDateTime createdAt,
        LocalDateTime updatedAt
) {
}
