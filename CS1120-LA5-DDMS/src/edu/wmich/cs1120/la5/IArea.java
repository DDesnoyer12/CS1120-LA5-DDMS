package edu.wmich.cs1120.la5;

public interface IArea {

	/**
	 * Getter for basicEnergyCost
	 * @return Returns the basicEnergyCOst
	 */
	double getBasicEnergyCost();

	/**
	 * Setter for the basicEnergyCost
	 * @param basicEnergyCost The basicEnergyCost of the area
	 */
	void setBasicEnergyCost(double basicEnergyCost);

	/**
	 * Getter for elevation
	 * @return Returns the elevation
	 */
	double getElevation();

	/**
	 * Setter for the elevation
	 * @param elevation The elevation of the area
	 */
	void setElevation(double elevation);

	/**
	 * Getter for radiation
	 * @return Returns the radiation of the area
	 */
	double getRadiation();

	/**
	 * Setter for the radiation
	 * @param radiation The radiation of the area
	 */
	void setRadiation(double radiation);

	/**
	 * Calculates the consumed energy of the area based on if its a HighArea or a LowArea
	 * @return Returns the consumed energy multiplied by four for HighArea or by two for LowArea
	 */
	double calcConsumedEnergy();

}
