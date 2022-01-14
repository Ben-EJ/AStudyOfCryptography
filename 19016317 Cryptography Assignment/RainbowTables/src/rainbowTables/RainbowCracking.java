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
import java.util.LinkedHashMap;

import utils.SHA;
import Main.Main;
/**
 *
 * @author benja
 */
//Cracks passwords
public class RainbowCracking {
    public int chainLen = 0;
    public BigInteger PwSpSize = new BigInteger("0");
    public ArrayList<String> alpha = new ArrayList<String>();
    public LinkedHashMap<String,String> rainbowTable = new LinkedHashMap<String,String>();
    private boolean passwordFound = false;
    public String foundPassword = "";
    
    public RainbowCracking(LinkedHashMap<String,String> rainbowTableIn, int chainLenIn, BigInteger PwSpSizeIn, ArrayList<String> alphaIn){
        rainbowTable = rainbowTableIn;
        chainLen = chainLenIn;
        PwSpSize = PwSpSizeIn;
        alpha = alphaIn;
    }
    
    /*
    Reduces hole chain from the given position in chain
    Takes the begining of the chain as input, the position
    returns the password as a string
    */
    public String chainReduce(String hash, BigInteger pos) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        String pwd = Chain.reduce(hash,pos,PwSpSize,alpha);//Reduces input password
        while(pos.compareTo(new BigInteger(Integer.toString(chainLen - 1))) != 0){//While pos is not equal to 0
            pos = pos.add(new BigInteger("1"));// Add one to position 
            hash = SHA.SHA1toString(pwd);// Hash the password
            pwd = Chain.reduce(hash,pos,PwSpSize,alpha);// Reduce the password
        }
        return pwd;
    }
    /*
    Recompiles the found chain from the begining
    takes begining of chain as input and the hash that needs to be cracked.
    returns void
    */
    public void recompileChain(String begining, String sha1HashPwd) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        System.out.println("Recompiling Chain: " + begining);
        String chainCurrent = "";
        chainCurrent = begining;  
        for (int i = 0; i < chainLen; i++){// Loops to create chain
            BigInteger countChain = new BigInteger(Integer.toString(i));// Current pos in chain
            
            String chainCurrentTemp = "";
            chainCurrentTemp = SHA.SHA1toString(chainCurrent);//Hash the current password
               
            String reduceOut = Chain.reduce(chainCurrentTemp,countChain,PwSpSize,alpha);// Reduce
            
            if (SHA.SHA1toString(reduceOut).equals(sha1HashPwd)) {//If hashes match, password is found.
                System.out.println("PASSWORD FOUND!!!!!: " + reduceOut);// Print password
                foundPassword = reduceOut;
                passwordFound = true;
                break;
            }else{
                chainCurrent = reduceOut;// Save reduced hash ready to build rest of chain
            }               
        }
        
    }
    /*
    Cracks the given password hash using the previously generated rainbow table.
    takes hash to be cracked as input
    returns void
    */
    public boolean crackPassword(String sha1HashToCrack) throws UnsupportedEncodingException, NoSuchAlgorithmException{        
        
        BigInteger pos = new BigInteger(Integer.toString(chainLen - 1));//Step 0: Remember current chain position
        
        while (pos.compareTo(new BigInteger("0")) != 0 && passwordFound == false){
            String pwd = chainReduce(sha1HashToCrack,pos);//Step 1: apply chainReduce function
            
            if(rainbowTable.containsKey(pwd) == true){//Step 2: check if pwd is in the list of last chains, if yes go to step 4
                String getChainBegining = rainbowTable.get(pwd);
                
                recompileChain(getChainBegining, sha1HashToCrack);//Step 4: go to the beginning of the chain, recompile the chain to find the password 
            }
            pos = pos.subtract(new BigInteger("1"));//Step 3: go back to step 1
        }
        return passwordFound;
    }   
}
