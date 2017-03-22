package edu.wmich.cs1120.la5;
import edu.wmich.cs1120.la5.gui.MainWindow;
import edu.wmich.cs1120.la5.TerrainScanner;

import java.util.ArrayList;

public class ElevationAnalyzer implements IRover {
private ArrayList<IArea> path = new ArrayList<IArea>();
private String analysis;
	@Override
	public ArrayList<IArea> getPath() {
		return this.path;
	}

	@Override
	public void setPath(ArrayList<IArea> path) {
		this.path = path;
	}

	@Override
	public void analyzePath() {
		double total = 0;
		double avg = 0;
		for(int i =0; i<path.size(); i++){
			total = total + path.get(i).getElevation();
		}
		avg = total/path.size();
		analysis = Double.toString(avg);
	}

	@Override
	public String getAnalysis() {
		return analysis;
	}

	@Override
	public void setAnalysis(String analysis) {
		this.analysis = analysis;
	}

}
