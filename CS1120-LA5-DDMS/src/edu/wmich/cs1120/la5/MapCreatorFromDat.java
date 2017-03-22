package edu.wmich.cs1120.la5;

import java.io.*;
import edu.wmich.cs1120.la5.gui.MainWindow;
import edu.wmich.cs1120.la5.TerrainScanner;

public class MapCreatorFromDat implements IMapCreator {

	private TerrainScanner scanner = new TerrainScanner();
	private IArea areaArray[][] = new IArea[10][10];

	@Override
	public void scanTerrain(String fileName, int threshold) throws IOException {
		File datFile = new File(fileName);
		RandomAccessFile raf = new RandomAccessFile(datFile, "r");
		boolean flag = false;
		int index = 0;
		int a = 0;
		int b = 0;
		char c;
		Addition add = new Addition();
		Subtraction minus = new Subtraction();
		IExpression ex;
		double basicEnergyCost = 0;
		double elevation = 0;
		double radiation = 0;
		int i = 0;
		int j = 0;
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
			c = raf.readChar();
			// System.out.println(c);
			a = raf.readInt();
			b = raf.readInt();
			// System.out.println(a+" " +b);
			ex = ExpressionFactory.getExpression(c, a, b);
			index = ex.getValue();
			if (index == -1) {
				flag = true;
			}

		}

		scanner.setTerrain(areaArray);
	}

	@Override
	public TerrainScanner getScanner() {
		return this.scanner;
	}

	@Override
	public void setScanner(TerrainScanner scanner) {
		this.scanner = scanner;
	}

}
