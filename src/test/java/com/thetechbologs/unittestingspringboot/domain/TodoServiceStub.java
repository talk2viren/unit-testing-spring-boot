package com.thetechbologs.unittestingspringboot.domain;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{
    @Override
    public List<String> retrieveTodos(String user) {
        return Arrays.asList("user-1","user-2","user-3");
    }

    @Override
    public void deleteTodo(String todo) {

    }
}
