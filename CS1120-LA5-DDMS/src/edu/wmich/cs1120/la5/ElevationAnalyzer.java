package edu.wmich.cs1120.la5;

import edu.wmich.cs1120.la5.gui.MainWindow;
import edu.wmich.cs1120.la5.TerrainScanner;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {
	private ArrayList<IArea> path = new ArrayList<IArea>();
	private String analysis;
	/**
	 * getter for the path ArrayList<IArea>
	 * @return returns the path ArrayList<IArea>
	 */
	@Override
	public ArrayList<IArea> getPath() {
		return this.path;
	}
	/**
	 * setter for the path ArrayList<IArea>
	 * @param path takes in the path ArrayList<IArea>
	 */
	@Override
	public void setPath(ArrayList<IArea> path) {
		this.path = path;
	}
	/**
	 * Analyzes the path based on what variable the class is. (i.e.-elevation, radiation, energy)
	 */
	@Override
	public void analyzePath() {
		double total = 0;
		double avg = 0;
		for (int i = 0; i < path.size(); i++) {
			total = total + path.get(i).getElevation();
		}
		avg = total / path.size();
		analysis = Double.toString(avg);
	}
	/**
	 * getter for the analysis
	 * @return returns the analysis
	 */
	@Override
	public String getAnalysis() {
		return analysis;
	}
	/**
	 * setter for the analysis
	 * @param analysis the String you want to set the analysis to
	 */
	@Override
	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}
	/**
	 * basic toString() format method
	 * @return returns the formatted String
	 */
	@Override
	public String toString() {
		return "Average elevation";
	}

}
