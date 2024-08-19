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
@Table(name = "todos")
public class TodoList {

        @Id
        @GeneratedValue(generator = "UUID")
        private UUID taskId;
        private String description;

        @CreationTimestamp
        private LocalDateTime createdAt;

        @CreationTimestamp
        private LocalDateTime updatedAt;

        private Long logId;

        @OneToOne
        @JoinColumn(name = "todos_logs")
        private TodoListLogs todoListLogs;
}