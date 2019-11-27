package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("cfg.xml");
		Code c=(Code)ac.getBean(Code.class,"cobj");
		System.out.println(c);
	}
}
