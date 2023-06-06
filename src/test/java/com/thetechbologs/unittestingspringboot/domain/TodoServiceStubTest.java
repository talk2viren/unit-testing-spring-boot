package com.thetechbologs.unittestingspringboot.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TodoServiceStubTest {

    @Test
    public void test(){
        TodoService todoService= new TodoServiceStub();
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
        List<String> filterTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Dummy");
        Assertions.assertEquals(0,filterTodos.size());
    }
}
