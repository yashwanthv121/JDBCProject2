package com.todoapp.todoproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.todoapp.todoproject.demo.sub1.SpringComponent;
import com.todoapp.todoproject.demo.sub2.yashwanth;

@SpringBootApplication
public class TodoprojectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext	applicationContext = SpringApplication.run(TodoprojectApplication.class, args);
		SpringComponent component = applicationContext.getBean(SpringComponent.class);
		
		System.out.println(component.getMessage());
		String b= "YashWANTH";
		System.out.println(component.getMsg(b));
		
		
		yashwanth component1 = applicationContext.getBean(yashwanth.class);
		System.out.println(component1.message());
		
		System.out.println("Hello Yashwanth");
		
		
	}

}
