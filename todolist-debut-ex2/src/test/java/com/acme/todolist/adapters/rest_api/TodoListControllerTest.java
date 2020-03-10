package com.acme.todolist.adapters.rest_api;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.acme.todolist.application.port.in.GetTodoItems;

@WebMvcTest(controllers = TodoListController.class)
public class TodoListControllerTest {
	
	@Autowired
	private MockMvc mockMvc;
	
	@MockBean
	private GetTodoItems getTodoItems;
	
	@Test
	void testGetTodoItems() throws Exception{
		mockMvc.perform(get("/todos").header("Content-Type", "application/json"))
		.andExpect(status().isOk());
		
		//then(mockMvc).shouldHaveZeroInteractions();
	}
	
	@Test
	void testEndpointInnexistant() throws Exception{
		mockMvc.perform(get("/existepas").header("Content-Type", "application/json"))
		.andExpect(status().is4xxClientError());
		
		//then(mockMvc).shouldHaveZeroInteractions();
	}
	

}
