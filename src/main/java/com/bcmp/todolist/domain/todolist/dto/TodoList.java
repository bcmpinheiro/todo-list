package com.bcmp.todolist.domain.todolist.dto;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "todos")
public class TodoList {

        @Id
        @GeneratedValue
        private UUID taskId;
        private String description;
        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;
        private Long logId;

        @OneToOne
        @JoinColumn(name = "todos_logs")
        private TodoListLogs todoListLogs;
}