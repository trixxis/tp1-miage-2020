package com.acme.todolist;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * Lanceur Spring boot pour les tests
 * 
 * Ce Lanceur doit se trouver au plus près des tests
 * pour surcharger le TodolistApplication de src/main/java 
 * qui chargerait toute l'application
 * @author bflorat
 *
 */

@SpringBootApplication
@ComponentScan(basePackages = {"com.acme.todolist.adapters.rest_api"})
public class ApplicationTest {
}
