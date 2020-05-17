package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnalyticsCounter {
	/**
	 * Create a variable called map
	 * as type of Map formed of a String and an Integer
	 *
	 * Create Analytics Counter method that assign map as a
	 * new HashMap
	 */

	private Map<String, Integer> map;
	public AnalyticsCounter(){ map = new HashMap<>(); }

	/**
	 * Method createMap that creates a list of
	 * symptoms with the number of occurrences
	 * @param symptomsList
	 */
	public void createMap(List<String> symptomsList) {
		for (String line : symptomsList){
			if (map.containsKey(line)){
				//increment the  repeated symptom in the list
				map.put(line,map.get(line)+1);
			}else {
				map.put(line, 1);
			}
		}
	}


}
