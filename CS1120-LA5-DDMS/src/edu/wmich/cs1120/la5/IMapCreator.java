package edu.wmich.cs1120.la5;

import java.io.*;

public interface IMapCreator {

	/**
	 * Reads and stores the input from the data file, and uses it to create and store 
	 * HighArea and LowArea type objects.
	 * @param fileName The name of the file
	 * @param threshold The limit for the elevation of the Area
	 * @throws IOException Throws an exception if an I/O interruption occurs
	 */
	void scanTerrain(String fileName, int threshold) throws IOException;

	/**
	 * Getter for TerrainScanner object
	 * @return Returns the TerrainScanner object
	 */
	TerrainScanner getScanner();

	/**
	 * Setter for the TerrainScanner object
	 * @param scanner The TerrainScanner object
	 */
	void setScanner(TerrainScanner scanner);

}
