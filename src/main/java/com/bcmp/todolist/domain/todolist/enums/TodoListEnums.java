package com.bcmp.todolist.domain.todolist.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum TodoListEnums {

    EDITAR ("1"),
    ARQUIVAR ("2"),
    DESARQUIVAR ("3"),
    CRIAR ("4");

    TodoListEnums(String type) {
    }
}
