package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.gui.MainWindow;
import edu.wmich.cs1120.la5.TerrainScanner;

public abstract class Area implements IArea {

	private double basicEnergyCost;
	private double elevation;
	private double radiation;

	/**
	 * Constructor for class Area
	 * @param basicEnergyCost Basic energy cost of the Area
	 * @param elevation Top elevation of the Area
	 * @param radiation Radiation level of the Area
	 */
	public Area(double basicEnergyCost, double elevation, double radiation) {
		this.basicEnergyCost = basicEnergyCost;
		this.elevation = elevation;
		this.radiation = radiation;
	}

	/**
	 * Getter for elevation
	 * @return Returns the elevation
	 */
	public double getElevation() {
		return elevation;
	}

	/**
	 * Setter for the elevation
	 * @param elevation The elevation of the area
	 */
	public void setElevation(double elevation) {
		this.elevation = elevation;
	}

	/**
	 * Getter for radiation
	 * @return Returns the radiation of the area
	 */
	public double getRadiation() {
		return radiation;
	}

	/**
	 * Setter for the radiation
	 * @param radiation The radiation of the area
	 */
	public void setRadiation(double radiation) {
		this.radiation = radiation;
	}

	/**
	 * Getter for basicEnergyCost
	 * @return Returns the basicEnergyCOst
	 */
	public double getBasicEnergyCost() {
		return basicEnergyCost;
	}

	/**
	 * Setter for the basicEnergyCost
	 * @param basicEnergyCost The basicEnergyCost of the area
	 */
	public void setBasicEnergyCost(double basicEnergyCost) {
		this.basicEnergyCost = basicEnergyCost;
	}

	/**
	 * Calculates the consumed energy of the area based on if its a HighArea or a LowArea
	 * @return Returns the consumed energy multiplied by four for HighArea or by two for LowArea
	 */
	public abstract double calcConsumedEnergy();

}
