package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.gui.MainWindow;
import edu.wmich.cs1120.la5.TerrainScanner;

import java.util.ArrayList;

public class EnergyAnalyzer implements IRover {
	private ArrayList<IArea> path = new ArrayList<IArea>();
	private String analysis;

	@Override
	public ArrayList<IArea> getPath() {
		return path;
	}

	@Override
	public void setPath(ArrayList<IArea> path) {
		this.path = path;
	}

	@Override
	public void analyzePath() {
		double total = 0;
		for (int i = 0; i < path.size(); i++) {
			total = total + path.get(i).calcConsumedEnergy();
		}

		analysis = Double.toString(total);

	}

	@Override
	public String getAnalysis() {
		return analysis;
	}

	@Override
	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}

	@Override
	public String toString() {
		return "Energy Information:";
	}

}
