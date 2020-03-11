package com.acme.todolist.adapters.rest_api;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.acme.todolist.application.port.in.GetTodoItems;
import com.acme.todolist.application.port.in.SetTodoItem;
import com.acme.todolist.application.service.GetTodoItemsService;
import com.acme.todolist.domain.TodoItem;

/**
 * Le controlleur Spring MVC qui expose les endpoints REST
 * 
 * @author bflorat
 *
 */
@RestController
public class TodoListController {
	
	
	private GetTodoItems getTodoItemsQuery;
	private SetTodoItem setTodoItemPort;
	
	
	@Inject
	public TodoListController(GetTodoItems getTodoItemsQuery, SetTodoItem setTodoItemPort ) {
		this.getTodoItemsQuery = getTodoItemsQuery;
		this.setTodoItemPort = setTodoItemPort;
	}
	
	@PostMapping("/todos")
	@ResponseBody
	public ResponseEntity createTodoItem(@RequestBody TodoItem todoItem) {
		this.setTodoItemPort.setTodoItem(todoItem);
		return new ResponseEntity(HttpStatus.CREATED);
		
	}
	
	@GetMapping("/todos")
	public List<TodoItem> getAllTodoItems() {
		return this.getTodoItemsQuery.getAllTodoItems();
	}
	
	
}
