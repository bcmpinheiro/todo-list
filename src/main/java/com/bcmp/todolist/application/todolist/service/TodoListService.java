package com.bcmp.todolist.application.todolist.service;

import com.bcmp.todolist.domain.todolist.entities.TodoList;
import com.bcmp.todolist.domain.todolist.repositories.TodoListRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@AllArgsConstructor
public class TodoListService {

    @Autowired
    private final TodoListRepository todoListRepository;

    @Transactional
    public TodoList salvar (TodoList todoList) {
        return todoListRepository.save(todoList);
    }

    @Transactional
    public void arquivar(UUID taskId) {
        todoListRepository.deleteById(taskId);
    }
}
