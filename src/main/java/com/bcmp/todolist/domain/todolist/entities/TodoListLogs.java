package com.bcmp.todolist.domain.todolist.entities;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "todos_log")
public class TodoListLogs {

        @Id
        @GeneratedValue(generator = "UUID")
        private UUID taskLogId;
        private String description;
        private Long operation;

        @CreationTimestamp
        private LocalDateTime createdAt;

        @CreationTimestamp
        private LocalDateTime updatedAt;

        @OneToMany
        @JoinColumn(name = "todos_operations")
        private TodoListOperations todoListOperations;
}
