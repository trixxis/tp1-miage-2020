package com.acme.todolist.application.port.out;

import java.util.List;

import com.acme.todolist.domain.TodoItem;


public interface InsertTodoItem {
	
	void insertTodoItem(TodoItem todoItem);

}
