/*******************************************************************************
 * Copyright (c) 2015 Pawel Zalejko(p.zalejko@gmail.com).
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License Version 2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/
 *******************************************************************************/
package pzalejko.iot.client.web.entity;

public class Item {

	private String date;
	private double temperature;

	public String getDate() {
		return date;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
}