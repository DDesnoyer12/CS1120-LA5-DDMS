package edu.wmich.cs1120.la5;

import java.io.*;
import edu.wmich.cs1120.la5.gui.MainWindow;
import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromDat implements IMapCreator {

	private TerrainScanner scanner = new TerrainScanner();
	private IArea areaArray[][] = new IArea[10][10];

	/**
	 * Reads and stores the data from the binary file, and uses it to create 
	 * and store HighArea and LowArea objects in an array.
	 * @param fileName The name of the binary file.
	 * @param threshold The limit for the elevation of an Area.
	 * @throws IOException Throws an exception if an I/O interruption occurs.
	 */
	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		File datFile = new File(fileName);
		RandomAccessFile raf = new RandomAccessFile(datFile, "r");
		boolean flag = false;
		int index = 0;
		int left = 0, right = 0;
		char character;
		double basicEnergyCost = 0, elevation = 0, radiation = 0;
		int i = 0, j = 0;
		IExpression expression;
		
		while (flag == false) {
			
			raf.seek(index * 34);
			
			basicEnergyCost = raf.readDouble();
			elevation = raf.readDouble();
			radiation = raf.readDouble();
			
			if (radiation >= 0.5) {
				areaArray[i][j] = new HighArea(basicEnergyCost, elevation, radiation);
			} else if (radiation < 0.5 && elevation > (threshold * 0.5)) {
				areaArray[i][j] = new HighArea(basicEnergyCost, elevation, radiation);
			} else {
				areaArray[i][j] = new LowArea(basicEnergyCost, elevation, radiation);
			}
			
			if (j < 9) {
				j++;
			} else if (j == 9) {
				j = 0;
				i++;
			}
			
			character = raf.readChar();
			left = raf.readInt();
			right = raf.readInt();
			expression = ExpressionFactory.getExpression(character, left, right);
			index = expression.getValue();
			if (index == -1) {
				flag = true;
			}

		}

		scanner.setTerrain(areaArray);
		raf.close();
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
