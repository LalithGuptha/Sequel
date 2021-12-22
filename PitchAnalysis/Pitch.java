package PitchAnalysis;

import project.*;

public class Pitch {

	private double moisture;
	private String grass;
	private String weather;
	private double temperature;
	private double cracks;
	private String type;
	
	
	public Pitch(double moisture, String grass, String weather, double temperature, double cracks) {
		super();
		this.moisture = moisture;
		this.grass = grass;
		this.weather = weather;
		this.temperature = temperature;
		this.cracks = cracks;
	}


	public double getMoisture() {
		return moisture;
	}


	public void setMoisture(double moisture) {
		this.moisture = moisture;
	}


	public String getGrass() {
		return grass;
	}


	public void setGrass(String grass) {
		this.grass = grass;
	}


	public String getWeather() {
		return weather;
	}


	public void setWeather(String weather) {
		this.weather = weather;
	}


	public double getTemperature() {
		return temperature;
	}


	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}


	public double getCracks() {
		return cracks;
	}


	public void setCracks(double cracks) {
		this.cracks = cracks;
	}
	
	// find() - func def


}
