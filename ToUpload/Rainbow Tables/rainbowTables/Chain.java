/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rainbowTables;

import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import utils.SHA;

/**
 *
 * @author benja
 */
//Creates chains
public class Chain {

    /*
    This function reduces a given password hash and gives a plain text password as output
    Takes the sha1 hash as input, the position in current chain, the password space prime number and the char set
    returns plain text password hash as a string 
     */
    public static String reduce(String hash, BigInteger pos, BigInteger PwSpSize, ArrayList<String> alpha) {
        BigInteger hashInt = new BigInteger(hash, 16); //Convert hash to big int

        BigInteger result1 = hashInt.add(pos);// Add current position to avoid collisons

        BigInteger result2 = result1.mod(PwSpSize);// Mod by password space prime

        String temp = RainbowUtils.int_to_string(result2, alpha); //Change integer to string using char set

        return temp;
    }

    /*
    Generates a single chain from given password/String 
    Takes the begining of the chain as input, the chain length, the password space prime number and the char set as parameters.
    returns the end of the chain as a string
     */
    public static String generateChain(String begining, int chainLen, BigInteger PwSpSize, ArrayList<String> alpha) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String chainCurrent = "";
        String theChainEnd = "";
        boolean chainSuccess = true;
        chainCurrent = begining;

        for (int i = 0; i < chainLen; i++) {
            String chainCurrentTemp = "";

            try {
                chainCurrentTemp = SHA.SHA1toString(chainCurrent);//Hashes password using sha1

                BigInteger countChain = new BigInteger(Integer.toString(i));// Gets the current pos in chain

                String reduceOut = reduce(chainCurrentTemp, countChain, PwSpSize, alpha);// Reduce

                if (i == chainLen - 1) {
                    theChainEnd = reduceOut;//Save reduced hash, end of chain.
                }
                chainCurrent = reduceOut;// Place reduced hash ready to build rest of chain

            } catch (java.lang.IllegalArgumentException e) {
                System.out.println("Problematic Input Password, disallowed: " + chainCurrent);
                chainSuccess = false;
                break;
            }
        }
        if (chainSuccess == true) {// If it succeeds in genrating the chain return the end of the chain

            return theChainEnd;
        } else {
            return null;
        }

    }
}
