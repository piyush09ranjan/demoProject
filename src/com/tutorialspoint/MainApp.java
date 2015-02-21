package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld objA = (HelloWorld) context.getBean("helloWorld");
		objA.setMessage("This is objA");
		objA.getMessage();
	      
		HelloWorld objB = (HelloWorld) context.getBean("helloWorld");
		//objB.setMessage("This is objB");
		objB.getMessage();
		context.registerShutdownHook();
	}
}
