/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rainbowTables;

import Main.Main;
import java.io.IOException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import rainbowTables.Chain;
/**
 *
 * @author benja
 */
//Produces a rainbow table

public class RainbowTable {
    /*
    Generates a rainbow table, checks for collisions in each chain, and prints ammount of collisions found
    Takes list of starter passwords, the desired chain size for each chain, the password space prime number and the char sent as parameters.
    returns rainbowtable as a LinkedHashMap<String,String>
    */
    public static LinkedHashMap<String,String> createRainbowTable(ArrayList<String> passwords, int chainSize, BigInteger PwSpSize, ArrayList<String> alpha) {
         LinkedHashMap<String,String> rainbowTableIn = new LinkedHashMap<String,String>();   
         BigInteger collisonAmmount = new BigInteger("0") ;
         try {
                for(int i = 0; i < passwords.size(); i++){//Builds Table
                    String theChainEnd = Chain.generateChain(passwords.get(i), chainSize, PwSpSize, alpha);// Creates chain
                    boolean check = rainbowTableIn.containsKey(theChainEnd);//Collison Checking
                    RainbowUtils.currentPercentage(i, passwords.size());//Gives percent of completion.
                    
                    if(theChainEnd == null){//If the chain is empty
                        System.out.println("Chain Returned Null");
                    }
                    else if(check == true){//Prevents collisions from being added to rainbow table
                      collisonAmmount = collisonAmmount.add(new BigInteger("1"));
                    }
                    else{
                        rainbowTableIn.put(theChainEnd, passwords.get(i));// Adds completed chain to rainbow table
                    }
                }
                System.out.println("collison Ammount: " + collisonAmmount);// Prints out total number of collisions after rainbow table is built
                return rainbowTableIn;
                
            } 
            catch (NoSuchAlgorithmException | IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;   
    }
}
