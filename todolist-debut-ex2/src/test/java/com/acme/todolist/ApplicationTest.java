package com.acme.todolist;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * Lanceur Spring boot
 * 
 * Note : comme cette classe n'est pas dans com.acme.todolist mais dans un sous package, il faut configurer finalement les 
 * différents composants nécessaires
 * @author bflorat
 *
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.acme.todolist.adapters.rest_api"})
public class ApplicationTest {
}
