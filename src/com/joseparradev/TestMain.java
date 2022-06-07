package com.joseparradev;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.joseparradev.models.Car;

public class TestMain {

	private static final Logger LOGGER = Logger.getLogger("testmain");

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		Car car = contexto.getBean("car", Car.class);

		LOGGER.log(Level.INFO, car.getcharacteristicsVehicle());

		contexto.close();

	}

}
