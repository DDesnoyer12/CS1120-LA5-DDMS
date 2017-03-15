package edu.wmich.cs1120.la5;

public abstract class Area implements IArea {
	
	private double elevation;
	private double radiation;
	private double basicEnergyCost;
	
	public Area(double basicEnergyCost, double elevation, double radiation) {
		this.basicEnergyCost = basicEnergyCost;
		this.elevation = elevation;
		this.radiation = radiation;
	}

	public double getElevation() {
		return elevation;
	}

	public void setElevation(double elevation) {
		this.elevation = elevation;
	}

	public double getRadiation() {
		return radiation;
	}

	public void setRadiation(double radiation) {
		this.radiation = radiation;
	}

	public double getBasicEnergyCost() {
		return basicEnergyCost;
	}

	public void setBasicEnergyCost(double basicEnergyCost) {
		this.basicEnergyCost = basicEnergyCost;
	}
	
	public abstract double calcConsumedEnergy();

}
