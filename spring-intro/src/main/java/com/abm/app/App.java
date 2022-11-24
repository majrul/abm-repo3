package com.abm.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abm.component.Calculator;
import com.abm.component.HelloWorld;
import com.abm.component.TextEditor;
import com.abm.component.di.copy.Atm;

public class App {

	public static void main(String[] args) {
		//Loading IoC Container of Spring
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("my-spring-config.xml");
		//Accessing a bean
		/*for(int i=0; i<5; i++) {
			HelloWorld hw = (HelloWorld) ctx.getBean("hello");
			System.out.println(hw.sayHello("Majrul"));
		}
		
		Calculator c = (Calculator) ctx.getBean("calc");
		c.add(10, 20);
		
		TextEditor te = (TextEditor) ctx.getBean("txtEdtr");
		te.loadDocument("abc.txt");
		
		Atm atm = (Atm) ctx.getBean("hdfcAtm-v2");
		atm.withdraw(22222, 1000);*/
	}
}








