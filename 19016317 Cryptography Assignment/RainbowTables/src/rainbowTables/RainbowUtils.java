/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rainbowTables;

import Main.Main;
import utils.FileHandle;
import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author benja
 */
//General rainbow table utility functions
public class RainbowUtils {
    /*
    Converts an interger into a string
    The interger to convert and the char set is also taken in as a parameter
    returns the converted int as a string of letters and numbers based on the alphabet provided
    */
    public static String int_to_string(BigInteger n, ArrayList<String> alphabet) {// Turns integer into a string
        BigInteger base = new BigInteger(Integer.toString(alphabet.size()));
        BigInteger sub = new BigInteger(Integer.toString(1));
	BigInteger r;
	String s="";
        
	while(n.compareTo(new BigInteger("0")) == 0 || n.compareTo(new BigInteger("0")) == 1) {
            
		r = n.mod(base); 
		n = n.divide(base); /* shift to right one digit (position) */
		s = alphabet.get(r.intValue()) + s;
		n = n.subtract(sub);   /*  this line is special! need it if we want handle different length of the strings */
	}
	return s;
    } 
    /*
    Checks to see if the given input string only contains integers
    returns true if it does and false if it does not
    */
    public static boolean checkIfNumber(String inputString){
        boolean validIn = true;
        if(inputString.equals("")){
            return false;
        }else{
            for (int i = 0; i < inputString.length(); i++){

                    if (inputString.charAt(i) != "0".charAt(0) && inputString.charAt(i) != "1".charAt(0) && inputString.charAt(i) != "2".charAt(0) && inputString.charAt(i) != "3".charAt(0) &&
                    inputString.charAt(i) != "4".charAt(0) && inputString.charAt(i) != "5".charAt(0) && inputString.charAt(i) != "6".charAt(0) && inputString.charAt(i) != "7".charAt(0)         
                    && inputString.charAt(i) != "8".charAt(0) && inputString.charAt(i) != "9".charAt(0) 
                    ){
                        validIn = false;
                        break;
                    } 
                }
            }
        return validIn;
    }
    /*
    Gets percentage of a given number
    Takes both percentage to find and the number to find the percentage of as input
    returns percentage as int
    */
    public static int percent(float percentage, float pwdAmt){
        return (int)(percentage * pwdAmt);
    }
    /*
    Gives current percentage of passwords proccessed
    Takes current password number and the size of the password array as parameters
    Returned current percentage complete to debug console
    returns void
    */
    public static void currentPercentage(int i, float pwdAmt){
        if (percent((float) 0.05, pwdAmt) == (int)i){
            System.out.println("5% Complete");
            
        }
        else if (percent((float) 0.1, pwdAmt) == (int)i){
            System.out.println("10% Complete");
            
        }
        else if(percent((float) 0.2, pwdAmt) == (int)i){
            System.out.println("20% Complete");
            
        }
        else if(percent((float) 0.5, pwdAmt) == (int)i){
            System.out.println("50% Complete");     
            
        }
        else if(percent((float) 0.8, pwdAmt) == (int)i){
            System.out.println("80% Complete");    
            
        }
        else if(percent((float) 0.9, pwdAmt) == (int)i){
            System.out.println("90% Complete"); 
            
        }
    }
    //Outputs entire rainbow table
    public static void outputRainbowTable(LinkedHashMap<String,String> rainbowTable){
        int entryCounter = 0;
        for (Map.Entry<String, String> entry : rainbowTable.entrySet()) {
            entryCounter++;
            System.out.println("Entry No. " + entryCounter + " Key: " + entry.getKey());
            System.out.println("Entry No. " + entryCounter + " Value: " + entry.getValue());
        }        
    }
    //Checks to see if rainbow table is generated
    public static HashMap<String, String> rainbowTableGenerated(HashMap<String, String> rainbowTable){
        if(rainbowTable.isEmpty()){
            System.out.println("Rainbow Table not generated: Pulling Rainbow Table from file");
            try {
                return FileHandle.readRainbowFile();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }

}
