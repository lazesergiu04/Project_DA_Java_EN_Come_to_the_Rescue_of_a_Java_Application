package com.hemebiotech.analytics;

import java.util.List;

public class AppLauncher {
    /**
     * The main method that will create a new fie
     * with the summary of the data from symptoms.txt
     *
     * @param args
     *
     */
    public static void main(String[] args)  {
        String outputFile = "result.out";
        AnalyticsCounter analyticsCounter = new AnalyticsCounter();
        List<String> data = analyticsCounter.readSymptoms("symptoms.txt");
        analyticsCounter.createMap(data);
        analyticsCounter.dataInFile(outputFile);
        System.out.println("The analytic result is available in " + outputFile);
    }

}
