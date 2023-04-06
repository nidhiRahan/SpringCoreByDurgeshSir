package com.SC.constr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstr {

	public static void main(String[] args) {
	 ApplicationContext context=new ClassPathXmlApplicationContext("com/SC/constr/ConstConfig.xml");
    Person person=  (Person)context.getBean("person");
    System.out.println(person);
	}

}
