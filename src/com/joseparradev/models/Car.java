package com.joseparradev.models;

import com.joseparradev.interfaces.IEngine;

public class Car extends VehicleWithEngine {

	public Car(IEngine engine) {
		super(engine);

	}

	@Override
	public String getcharacteristicsVehicle() {
		return String.format("Nombre de la Empresa: %s, Engine :  %s", getNameCompany(),
				getEngine().getDescriptionEngine());
	}

}
