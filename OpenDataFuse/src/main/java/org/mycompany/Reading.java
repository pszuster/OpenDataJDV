package org.mycompany;

import java.sql.Timestamp;
import java.util.Random;

import javax.persistence.*;


@Entity
@Table(name="readings")
@NamedQuery(name="Reading.findAll", query="SELECT r FROM Reading r")
public class Reading {
	private double temp;
	@Id
	private Timestamp readingDate;
	private int station;
	private double wind;
	private double pressure;
	private double rain;
	private double uvindex;
	
	
	public Reading() {
		super();
		Random random = new Random();
		this.setDate(new Timestamp(System.currentTimeMillis()));
		this.setPressure(Double.parseDouble(String.format("%.2f",885+(1077-885)*random.nextDouble())));
		this.setRain(Double.parseDouble(String.format("%.2f",0 + (3000-0) * random.nextDouble())));
		this.setTemp(Double.parseDouble(String.format("%.2f",-20+(50+20)* random.nextDouble())));
		this.setUvindex(Double.parseDouble(String.format("%.2f",0 + (15-0) * random.nextDouble())));
		this.setWind(Double.parseDouble(String.format("%.2f",0 + (300-0)* random.nextDouble())));
		this.setStation(1+ (50-1)*random.nextInt());
	}
	public Reading(double temp, Timestamp date, int station, double wind, double pressure, double rain, double uvindex) {
		super();
		this.temp = temp;
		this.readingDate = date;
		this.station = station;
		this.wind = wind;
		this.pressure = pressure;
		this.rain = rain;
		this.uvindex = uvindex;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
	public Timestamp getDate() {
		return readingDate;
	}
	public void setDate(Timestamp instant) {
		this.readingDate = instant;
	}
	public int getStation() {
		return station;
	}
	public void setStation(int station) {
		this.station = station;
	}
	public double getWind() {
		return wind;
	}
	public void setWind(double wind) {
		this.wind = wind;
	}
	public double getPressure() {
		return pressure;
	}
	public void setPressure(double pressure) {
		this.pressure = pressure;
	}
	public double getRain() {
		return rain;
	}
	public void setRain(double rain) {
		this.rain = rain;
	}
	public double getUvindex() {
		return uvindex;
	}
	public void setUvindex(double uvindex) {
		this.uvindex = uvindex;
	}

}
