package edu.wmich.cs1120.la5;

public class LowArea extends Area {

	/**
	 * Constructor for class LowArea
	 * @param basicEnergyCost Basic energy cost of the LowArea
	 * @param elevation Top elevation of the LowArea
	 * @param radiation Radiation level of the LowArea
	 */
	public LowArea(double basicEnergyCost, double elevation, double radiation) {
		super(basicEnergyCost, elevation, radiation);
	}

	/**
	 * Calculates the consumed energy of the LowArea by multiplying the basicEnergyCost by two
	 * @return Returns the consumed energy multiplied by two for the LowArea
	 */
	@Override
	public double calcConsumedEnergy() {
		return super.getBasicEnergyCost() * 2.0;
	}

}
