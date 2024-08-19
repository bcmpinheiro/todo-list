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
@Table(name = "todos_operations")
public class TodoListOperations {

        @Id
        @GeneratedValue(generator = "UUID")
        private UUID taskOperationId;
        private String type;

        @CreationTimestamp
        private LocalDateTime createdAt;

        @CreationTimestamp
        private LocalDateTime updatedAt;
}
