package com.todoapp.todoproject.demo.sub1;

import org.springframework.stereotype.Component;

@Component
public class SpringComponent {
	public String getMessage() {
		return "Hello World from SpringComponent.!!!";
	}
	
	public String getMsg(String a)
	{
		return a;
	}
}
