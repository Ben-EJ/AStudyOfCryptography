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
import java.util.Arrays;
import static java.util.Objects.hash;
import utils.SHA;

/**
 *
 * @author benja
 */
public class TEST {
    public static void test() throws UnsupportedEncodingException, NoSuchAlgorithmException{
//       //ASK RONG ABOUT ALPHABET IS IT JUST LETTERS AND SHOULD 0 INDEX BE AN EMPTY SPACE.
//       //Are you going to give us passwords plain text or hashes to crack in lab
//       //Figure out how to turn password hash string into a byte array
//       //Show her tests
//       //When will she be checking rainbow tables in class
//       //Wont find the last one
//        byte[] hash = new byte[40];
//        
//        String toFind = "ccc";//Password to find
//        //
//        hash = SHA.SHA1(toFind); //Convert password to find into hash (This is the hash we are trying to crack)
//        String hashToCrack = SHA.SHA1toString(toFind);
//        
//        String begining ="ccc";
//        
//        String chainCurrent = begining;  
//        boolean found = false;
//        for (int i = 33; i < 100; i++){// Loops to create chain
//            BigInteger countChain = new BigInteger(Integer.toString(i));
//            
//            byte[] chainCurrentTemp = new byte[40];
//            chainCurrentTemp = SHA.SHA1(chainCurrent);//Hash
//               
//            String reduceOut = Chain.reduce(chainCurrentTemp,countChain,new BigInteger("48017"), new ArrayList<String>(Arrays.asList("0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z")));// Reduce
//            
//            
//            System.out.println("Chain pos num: " + i + " " + "Reduce: " + reduceOut);
//            chainCurrent = reduceOut;// Save reduced hash ready to build rest of chain
//                         
//        }
//        if(found == false){
//            System.out.println("Password Not Found");
//            System.out.println("recom chainEND: " + chainCurrent);
//        }
//        System.out.println("=================================================");
//        String toFind = "w10";//Password to find
//        System.out.println(toFind);
//        byte[] hash = new byte[40];
//        
//        hash = SHA.SHA1(toFind); //Convert password to find into hash (This is the hash we are trying to crack)
//        System.out.println(hash);
//        System.out.println(Chain.reduce(hash, new BigInteger("76") , new BigInteger("48017"), new ArrayList<String>(Arrays.asList("0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"))));
//        
//        System.out.println("=================================================");
//        String toFind2 = "cnq";//Password to find
//        System.out.println(toFind2);
//        byte[] hash2 = new byte[40];
//        
//        hash2 = SHA.SHA1(toFind2); //Convert password to find into hash (This is the hash we are trying to crack)
//        System.out.println(hash2);
//        System.out.println(Chain.reduce(hash2, new BigInteger("76") , new BigInteger("48017"), new ArrayList<String>(Arrays.asList("0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"))));
  }
    
}

