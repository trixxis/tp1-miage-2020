package com.acme.todolist.domain;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.startsWith;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.junit.jupiter.api.Test;

class TodoItemTest {

	@Test
	void isLate_itemCreationDate20Minutes_returnsFalse() {
		TodoItem item = new TodoItem("1", Instant.now().minus(20,ChronoUnit.MINUTES), "mycontent");
		assertThat(item.isLate(),is(false));		
	}
	
	@Test
	void finalContent_itemCreationDate20Minutes_noLateString() {
		TodoItem item = new TodoItem("1", Instant.now().minus(20,ChronoUnit.MINUTES), "mycontent");
		assertThat(item.finalContent(),not( startsWith("[LATE]")));		
	}
	
	@Test
	void finalContent_itemCreationDate20Days_startWithLateString() {
		TodoItem item = new TodoItem("1", Instant.now().minus(20,ChronoUnit.DAYS), "mycontent");
		assertThat(item.finalContent(),startsWith("[LATE!]"));		
	}

}
