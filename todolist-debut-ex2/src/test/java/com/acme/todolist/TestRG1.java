package com.acme.todolist;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Instant;

import com.acme.todolist.domain.TodoItem;

import org.junit.Test;
import junit.framework.TestCase;


public class TestRG1 extends TestCase {
	private static final String LATE = "[LATE!] ";

@Test
  public void testRG1() throws Exception {
	 
    assertEquals(true, this.createTestItem().finalContent().contains(LATE));
    
  }
  
  public TodoItem createTestItem(){
	  Instant time = Instant.ofEpochSecond(1552386381);
	  TodoItem test1 = new TodoItem("0f8-06eb17ba8d34",time,"Faire les courses");
	  return test1;
  }
  
}
