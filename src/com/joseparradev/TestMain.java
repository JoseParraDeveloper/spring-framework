package com.joseparradev;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.joseparradev.models.Airplane;
import com.joseparradev.models.Car;
import com.joseparradev.models.Truck;
import com.joseparradev.models.Vehicle;

public class TestMain {

	private static final Logger LOGGER = Logger.getLogger("testmain");

	public static void main(String[] args) {

		ClassPathXmlApplicationContext contexto = new ClassPathXmlApplicationContext("applicationContext.xml");

		Vehicle car = contexto.getBean("car", Car.class);
		Vehicle truck = contexto.getBean("truck", Truck.class);
		Vehicle airplane = contexto.getBean("airplane", Airplane.class);

		List<Vehicle> listVehicle = new ArrayList<>();
		listVehicle.add(car);
		listVehicle.add(truck);
		listVehicle.add(airplane);
		for (Vehicle vehicle : listVehicle) {
			LOGGER.log(Level.INFO, vehicle.getCharacteristicsVehicle());
		}
		contexto.close();

	}

}
