package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

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

	/**
	 * Method reads symptoms from
	 * the file, using ReadSymptomsDataFromFile class
	 *
	 * @param file
	 * @return symptoms form the file
	 */
	public List<String> readSymptoms(String file){
		return new ReadSymptomDataFromFile(file).getSymptoms();
	}

	/**
	 * Method to sort the symptoms alphabetically
	 *
	 * @return
	 */
	public Map<String, Integer> sortedByName(){
		return new TreeMap<>(map);
	}

	/**Method that writes data in the file
	 * using WriteDataInFile class and
	 * sort the symptoms alphabetically
	 *
	 *
	 * @param file
	 */
	public void dataInFile(String file) {
		WriteDataInFile writeDataInFile = new WriteDataInFile();
		writeDataInFile.write(file, sortedByName());
	}

}
