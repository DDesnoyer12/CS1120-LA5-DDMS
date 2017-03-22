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
