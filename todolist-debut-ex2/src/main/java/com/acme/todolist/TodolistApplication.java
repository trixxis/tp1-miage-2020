
package com.acme.todolist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * Lanceur Spring boot
 * 
 * Note : comme cette classe n'est pas dans com.acme.todolist mais dans un sous package, il faut configurer finalement les 
 * différents composants nécessaires
 * @author bflorat
 *
 */

@SpringBootApplication
public class TodolistApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodolistApplication.class, args);
	}

}
