package com.acme.todolist.adapters.rest_api;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito.Then;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.acme.todolist.application.port.in.AddTodoItem;
import com.acme.todolist.application.port.in.GetTodoItems;
import com.acme.todolist.domain.TodoItem;

import static org.mockito.BDDMockito.*;



@WebMvcTest(controllers = TodoListController.class)
public class TodoListControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private GetTodoItems getTodoItems;
	
	@MockBean
	private AddTodoItem addTodoItem;
	
	@Test
	void testGetTodoItems() throws Exception{
		mockMvc.perform(get("/todos").header("Content-Type", "application/json"))
		.andExpect(status().isOk());
		
		then(getTodoItems).should(times(1)).getAllTodoItems();
	}
	
	@Test
	void testEndpointInnexistant() throws Exception{
		mockMvc.perform(get("/existepas").header("Content-Type", "application/json"))
		.andExpect(status().is4xxClientError());
		
		then(getTodoItems).shouldHaveNoInteractions();
	}
	

}
