package com.abm.component;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("calc") //alternative to <bean id="calc" class="..Calculator" />
@Scope("prototype")
public class Calculator {

	public void add(int x, int y) {
		System.out.println(x + y);
	}

	public void sub(int x, int y) {
		System.out.println(x - y);
	}
}
