/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author benja
 */
//File handling functions
public class FileHandle {

    /*
    Writes rainbow table to file
    Takes rainbow table as a parameter
    returns void
     */
    public static void writeRainbowToFile(LinkedHashMap<String, String> rainbowTable) {

        try (PrintWriter writer = new PrintWriter("RainbowTable.csv")) {

            for (Map.Entry<String, String> set
                    : rainbowTable.entrySet()) {
                StringBuilder chainData = new StringBuilder();
                chainData.append(set.getKey());
                chainData.append(",");
                chainData.append(set.getValue());
                chainData.append("\n");
                writer.write(chainData.toString());
            }
            writer.close();
            System.out.println("Wrote to rainbow table to file");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        }
    }

    /*
    Pulls rainbow table from file
    Takes no parameters
    returns the rainbow table as a LinkedHashMap<String,String>
     */
    public static LinkedHashMap<String, String> readRainbowFile() throws FileNotFoundException, IOException {
        LinkedHashMap<String, String> rainbowTable = new LinkedHashMap<String, String>();
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("RainbowTable.csv"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                count++;
                rainbowTable.put(values[0], values[1]);
                //System.out.println(count);
            }
            return rainbowTable;
        }
    }

    /*
    Writes rainbow table configs to file
    Takes chainSize, passwordLen and charSetUsed as parameters
    returns void
     */
    public static void writeConfigFile(int chainSize, int passwordLen, int charSetUsed, int ammountOfChains) {
        try {
            FileWriter myWriter = new FileWriter("configs.txt");
            myWriter.write(Integer.toString(chainSize) + System.getProperty("line.separator"));
            myWriter.write(Integer.toString(passwordLen) + System.getProperty("line.separator"));
            myWriter.write(Integer.toString(charSetUsed) + System.getProperty("line.separator"));
            myWriter.write(Integer.toString(ammountOfChains) + System.getProperty("line.separator"));
            myWriter.close();
            System.out.println("Wrote to config file");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    /*
    Pulls rainbow table configurations from file
    Takes no parameters
    returns the rainbow table configs as a ArrayList<String>
     */
    public static ArrayList<String> readConfigFile() throws FileNotFoundException, IOException {
        ArrayList<String> configs = new ArrayList<String>();
        int count = 0;
        try {
            File myFile = new File("configs.txt");
            Scanner myReader = new Scanner(myFile);
            while (myReader.hasNextLine()) {
                String value = myReader.nextLine();

                configs.add(value);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Cant read Config File");
            e.printStackTrace();
        }
        return configs;
    }

}
