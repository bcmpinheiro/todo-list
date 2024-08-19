package com.bcmp.todolist.infrastructure.repositories;

import com.bcmp.todolist.domain.todolist.dto.TodoList;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TodoListRepository extends JpaRepository<TodoList, UUID> {

}
