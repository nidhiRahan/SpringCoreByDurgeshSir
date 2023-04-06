package com.springCore.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.auto.wire.Emp;

public class CollectionMain {

	public static void main(String[] args) {
		ApplicationContext	context=new ClassPathXmlApplicationContext("CollectionConfig.xml");
        Emp emp=(Emp)context.getBean("emp");
        System.out.println(emp);
	}


}
