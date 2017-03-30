package edu.wmich.cs1120.la5;

import java.io.*;
import java.util.*;

public interface IRover {
	/**
	 * getter for the path ArrayList<IArea>
	 * @return returns the path ArrayList<IArea>
	 */
	ArrayList<IArea> getPath();
	/**
	 * setter for the path ArrayList<IArea>
	 * @param path takes in the path ArrayList<IArea>
	 */
	void setPath(ArrayList<IArea> path);
	/**
	 * Analyzes the path based on what variable the class is. (i.e.-elevation, radiation, energy)
	 */
	void analyzePath();
	/**
	 * getter for the analysis
	 * @return returns the analysis
	 */
	String getAnalysis();
	/**
	 * setter for the analysis
	 * @param analysis the String you want to set the analysis to
	 */
	void setAnalysis(String analysis);
	/**
	 * basic toString() format method
	 * @return returns the formatted String
	 */
	String toString();

}
