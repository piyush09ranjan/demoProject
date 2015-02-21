package com.tutorialspoint;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class HelloWorld implements InitializingBean, DisposableBean{
	private String message;

	public void setMessage(String message){
		this.message  = message;
	}

	public void getMessage(){
		System.out.println("Your Message is : " + message);
	}

	//method for initialization work
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Bean is going through init.");
	}

	//method for destroy work
	@Override
	public void destroy() throws Exception {
		System.out.println("Bean is going to destroy. ");
	}
}
