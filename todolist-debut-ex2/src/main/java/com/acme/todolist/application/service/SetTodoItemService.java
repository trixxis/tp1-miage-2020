package com.acme.todolist.application.service;

import javax.inject.Inject;

import org.springframework.stereotype.Component;

import com.acme.todolist.application.port.in.SetTodoItem;
import com.acme.todolist.application.port.out.InsertTodoItem;
import com.acme.todolist.application.port.out.LoadTodoItem;
import com.acme.todolist.domain.TodoItem;


@Component
public class SetTodoItemService implements SetTodoItem{

	private InsertTodoItem insertTodoItem;
	
	@Inject
	public SetTodoItemService(InsertTodoItem insertTodoItem) {
		this.insertTodoItem = insertTodoItem;
		
	}

	@Override
	public void setTodoItem(TodoItem todoItem) {
		this.insertTodoItem.insertTodoItem(todoItem);
		
	}
	
}
