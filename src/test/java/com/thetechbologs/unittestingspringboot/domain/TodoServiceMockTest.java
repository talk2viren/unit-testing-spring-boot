package com.thetechbologs.unittestingspringboot.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoServiceMockTest {

    @Test
    public void test(){
        TodoService todoServiceMock= mock(TodoService.class);
        todoServiceMock.
//        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);
//        List<String> filterTodos = when(todoServiceMock.retrieveTodos("Dummy")).thenReturn(new ArrayList<String>());
//        Assertions.assertEquals(0,filterTodos.size());
    }
}
