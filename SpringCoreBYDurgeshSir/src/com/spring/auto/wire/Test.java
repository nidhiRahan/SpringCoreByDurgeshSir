package com.spring.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/auto/wire/autoconfig.xml");
		Emp obj=context.getBean("emp",Emp.class);
		System.out.println(obj);

	}

}
