package com.bcmp.todolist.domain.todolist.dto;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "todos_log")
public class TodoListLogs {

        @Id
        @GeneratedValue
        private UUID taskLogId;
        private String description;
        private Long operation;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        @OneToMany
        @JoinColumn(name = "todos_operations")
        private TodoListOperations todoListOperations;
}
