package com.bcmp.todolist.application.todolist.controller;

import com.bcmp.todolist.application.todolist.service.TodoListService;
import com.bcmp.todolist.domain.todolist.entities.TodoList;
import com.bcmp.todolist.domain.todolist.repositories.TodoListRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/todolist")
public class TodoListController {

    private TodoListService todoListService;
    private TodoListRepository todoListRepository;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TodoList adicionar(@Validated @RequestBody TodoList todoList) {
        return todoListRepository.save(todoList);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TodoList> atualizar(@PathVariable UUID taskId, @RequestBody TodoList todoList) {
        if (!todoListRepository.existsById(taskId)) {
            return ResponseEntity.notFound().build();
        }
        todoList.setTaskId(taskId);
        TodoList tarefaAtualizada = todoListService.salvar(todoList);

        return ResponseEntity.ok(tarefaAtualizada);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TodoList> arquivar(@PathVariable UUID taskId) {
        if (!todoListRepository.existsById(taskId)) {
            return ResponseEntity.notFound().build();
        }

        todoListService.arquivar(taskId);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public List<TodoList> listar() {
        return todoListRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TodoList> buscar(@PathVariable UUID taskId) {
        Optional<TodoList> todoList = todoListRepository.findById(taskId);
        return todoListRepository.findById(taskId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
}