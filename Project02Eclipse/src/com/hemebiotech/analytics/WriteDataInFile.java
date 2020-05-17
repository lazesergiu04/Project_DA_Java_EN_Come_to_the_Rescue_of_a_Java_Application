package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteDataInFile {
    /**
     * Method that writes data in a file,
     * using a for loop to define the format and
     * to separate each line
     *
     *
     * @param file
     * @param map
     */
    public void write(String file, Map<String, Integer> map ) {

        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){

            for (Map.Entry<String, Integer> into : map.entrySet()){

                writer.write(into.getKey() + "="+ into.getValue());
                writer.write(System.getProperty("line.separator"));
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
