package com.bcmp.todolist.domain.todolist.enums;

import lombok.Getter;

@Getter
public enum TodoListEnums {

    EDITAR ("1"),
    ARQUIVAR ("2"),
    DESARQUIVAR ("3"),
    CRIAR ("4");

    TodoListEnums(String type) {
    }
}
