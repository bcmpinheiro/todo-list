package com.bcmp.todolist.domain.todolist.dto;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "todos_operations")
public class TodoListOperations {

        @Id
        @GeneratedValue
        private UUID taskOperationId;
        private String type;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
}
