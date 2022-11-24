package com.abm.test;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abm.component.CarPart;
import com.abm.component.CarPartInventory;

public class CarPartTest {

	@Test
	public void test_adding_CarPart() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		CarPartInventory cpInv = (CarPartInventory) ctx.getBean("carPartInv2");
		
		//entity/model classes are not instantiated using spring
		CarPart cp = new CarPart();
		cp.setPartName("AC");
		cp.setCarModel("Maruti 800");
		cp.setPrice(2500);
		cp.setQuantity(25);
		
		cpInv.addNewPart(cp);
	}

	@Test
	public void test_fetching_CarPart() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("my-spring-config.xml");
		CarPartInventory cpInv = (CarPartInventory) ctx.getBean("carPartInv2");
		
		List<CarPart> list = cpInv.getAvailableParts();
		for(CarPart cp : list) {
			System.out.println(cp.getPartNo());
			System.out.println(cp.getPartName());
			System.out.println(cp.getCarModel());
			System.out.println(cp.getPrice());
			System.out.println(cp.getQuantity());
			System.out.println("----------------");
		}
	}
}






