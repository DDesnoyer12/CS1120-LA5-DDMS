package edu.wmich.cs1120.la5;

import java.io.*;
import java.util.*;
import edu.wmich.cs1120.la5.gui.MainWindow;
import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromTxt implements IMapCreator {
	
	private TerrainScanner scanner = new TerrainScanner();
	private IArea[][] areaArray = new IArea[10][10];

	/**
	 * Reads and stores the input from the text file, and uses it to create and store 
	 * HighArea and LowArea type objects.
	 * @param fileName The name of the text file
	 * @param threshold The limit for the elevation of the Area
	 * @throws IOException Throws an exception if an I/O interruption occurs
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		File textFile = new File(fileName);
		Scanner textScan = new Scanner(textFile);
		double basicEnergyCost = 0.0, elevation = 0.0, radiation = 0.0;
		int i = 0, j = 0;
		while(textScan.hasNextLine()) {
			
			String[] nextLine = textScan.nextLine().split(" ");
			
			basicEnergyCost = Double.parseDouble(nextLine[0]);
			elevation = Double.parseDouble(nextLine[1]);
			radiation = Double.parseDouble(nextLine[2]);
			
			if(radiation >= 0.5) {
				areaArray[i][j] = new HighArea(basicEnergyCost, elevation, radiation);
			} else if(radiation < 0.5 && elevation > (threshold*0.5)) {
				areaArray[i][j] = new HighArea(basicEnergyCost, elevation, radiation);
			} else {
				areaArray[i][j] = new LowArea(basicEnergyCost, elevation, radiation);
			}
			
			if(j < 9) {
				j++;
			} else if(j == 9) {
				j = 0;
				i++;
			}
			
		}		
		scanner.setTerrain(areaArray);
		
	}

	/**
	 * Getter method for the TerrainScanner
	 * @return Returns a TerrainScanner object.
	 */
	@Override
	public TerrainScanner getScanner() {
		return this.scanner;
	}

	/**
	 * Setter for the TerrainScanner
	 * @param scanner An object of TerrainScanner
	 */
	@Override
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;
	}

}
