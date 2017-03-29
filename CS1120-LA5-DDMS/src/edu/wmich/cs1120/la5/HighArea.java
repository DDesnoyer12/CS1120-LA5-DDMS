package edu.wmich.cs1120.la5;

public class HighArea extends Area {

	/**
	 * Constructor for class HighArea
	 * @param basicEnergyCost Basic energy cost of the HighArea
	 * @param elevation Top elevation of the HighArea
	 * @param radiation Radiation level of the HighArea
	 */
	public HighArea(double basicEnergyCost, double elevation, double radiation) {
		super(basicEnergyCost, elevation, radiation);
	}

	/**
	 * Calculates the consumed energy of the HighArea by multiplying the basicEnergyCost by four
	 * @return Returns the consumed energy multiplied by four for the HighArea
	 */
	@Override
	public double calcConsumedEnergy() {
		return super.getBasicEnergyCost() * 4.0;
	}

}
